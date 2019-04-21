package inf008.ads.ifba.edu.br.logisticsnegotium.session;

import java.util.ArrayList;
import java.util.Collection;
import inf008.ads.ifba.edu.br.logisticsnegotium.dao.DeliveryDAOIF;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.AutomatedVehicles;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.Point;

public class AppDelivery implements AppDeliveryIF{
    private Point pointRech;
    private Point pointDely;
    private DeliveryDAOIF deliveryDAO;

    public AppDelivery(Point pointRech, Point pointDely){
        this.setPointRech(pointRech);
        this.setPointDely(pointDely);
    }


    public Point getPointRech() {
        return pointRech;
    }

    private void setPointRech(Point pointRech) {
        this.pointRech = pointRech;
    }

    public Point getPointDely() {
        return pointDely;
    }

    private void setPointDely(Point pointDely) {
        this.pointDely = pointDely;
    }


	@Override
	public void addDelivery(int registration, Point reach, Point dely, double price) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addVehicle(int registration, double capacity, double latitude, double longitude, boolean isAirVehicle) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Collection<AutomatedVehicles> listVehicles() throws Exception {
		Collection<AutomatedVehicles> avAll = this.deliveryDAO.findAll();
		  
    	return avAll;
	}


	@Override
	public Collection<AutomatedVehicles> searchByCapacity(double capacity) throws Exception {

		Collection<AutomatedVehicles> avPossible = new ArrayList<AutomatedVehicles>();
		Collection<AutomatedVehicles> avAll = this.deliveryDAO.findAll();
		for(AutomatedVehicles vehicle : avAll){
			if(vehicle.getCapacity() == capacity){
				avPossible.add(vehicle);
			}
		}

    	return avPossible;

		
//		Collection<AutomatedVehicles> avPossible = this.deliveryDAO.findByCapacity(capacity);
//
//    	return avPossible;
	}


	@Override
	public void setDeliveryDAOIF(DeliveryDAOIF deliveryDAO) {
		this.deliveryDAO = deliveryDAO;
	}

}
