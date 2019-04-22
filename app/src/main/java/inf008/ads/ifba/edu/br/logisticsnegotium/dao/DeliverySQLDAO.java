package inf008.ads.ifba.edu.br.logisticsnegotium.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.AirVehicle;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.AutomatedVehicles;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.LandVehicle;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.Point;

public class DeliverySQLDAO implements DeliveryDAOIF {
	private static final String DRIVER_NAME = "org.hsqldb.jdbcDriver";
	private static final String DB_URI = "jdbc:hsqldb:hsql://localhost/";
	private static final String DB_USER = "SA";
	private static final String DB_PWD = "";
	private static final String SAVE = "INSERT INTO AUTOMATED_VEHICLES(_id, capacity, latitude, longitude, isAirVehicle) VALUES(?, ?, ?, ?, ?)";
	private static final String FIND_ALL = "SELECT _id, capacity, latitude, longitude, isAirVehicle FROM AUTOMATED_VEHICLES";
	
	
	public DeliverySQLDAO() throws SQLException, ClassNotFoundException {
		Class.forName(DeliverySQLDAO.DRIVER_NAME);
	}
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DeliverySQLDAO.DB_URI, 
				DeliverySQLDAO.DB_USER, DeliverySQLDAO.DB_PWD);
	}
	
	
	@Override
	public void save(AutomatedVehicles av, Point point) throws Exception {
		PreparedStatement stmt = this.getConnection().prepareStatement(DeliverySQLDAO.SAVE);
		stmt.setInt(1, av.getId());
		stmt.setDouble(2, av.getCapacity());
		stmt.setDouble(3, point.getLatitude());
		stmt.setDouble(4, point.getLongitude());
		stmt.setBoolean(5, av.isAirVehicle());
		stmt.executeUpdate();
		stmt.close();
	}
	
	@Override
	public Collection<AutomatedVehicles> findAll() throws Exception {
		Collection<AutomatedVehicles> avAll = new ArrayList<AutomatedVehicles>();
		PreparedStatement stmt = this.getConnection().prepareStatement(DeliverySQLDAO.FIND_ALL);
		ResultSet rSet = stmt.executeQuery();
		
		while(rSet.next()) {
			if(rSet.getBoolean("isAirVehicle")) {
				AutomatedVehicles av = new AirVehicle(rSet.getInt("_id"),
													  rSet.getDouble("capacity"),
											  		  rSet.getDouble("latitude"), 
													  rSet.getDouble("longitude"),
													  rSet.getBoolean("isAirVehicle"));
				avAll.add(av);
			}else {
				AutomatedVehicles av = new LandVehicle(rSet.getInt("_id"),
													  rSet.getDouble("capacity"),
											  		  rSet.getDouble("latitude"), 
													  rSet.getDouble("longitude"),
													  rSet.getBoolean("isAirVehicle"));
				avAll.add(av);
			}	
		}	
		
		rSet.close();
		stmt.close();
		
		return avAll;
	}
	
	@Override
	public Collection<AutomatedVehicles> findByCapacity(double capacity) throws Exception {
		Collection<AutomatedVehicles> avByCap = new ArrayList<AutomatedVehicles>();
		PreparedStatement stmt = this.getConnection().prepareStatement(DeliverySQLDAO.FIND_ALL);
		ResultSet rSet = stmt.executeQuery();
		
		while(rSet.next()) {
			while(rSet.next()) {
				if(rSet.getBoolean("isAirVehicle")) {
					AutomatedVehicles av = new AirVehicle(rSet.getInt("_id"),
														  rSet.getDouble("capacity"),
												  		  rSet.getDouble("latitude"), 
														  rSet.getDouble("longitude"),
														  rSet.getBoolean("isAirVehicle"));
					if(av.getCapacity() >= capacity)
						avByCap.add(av);
				}else {
					AutomatedVehicles av = new LandVehicle(rSet.getInt("_id"),
														  rSet.getDouble("capacity"),
												  		  rSet.getDouble("latitude"), 
														  rSet.getDouble("longitude"),
														  rSet.getBoolean("isAirVehicle"));
					if(av.getCapacity() >= capacity)
						avByCap.add(av);
				}	
			}	
		}	
		
		rSet.close();
		stmt.close();
		
		return avByCap;
	}
}
