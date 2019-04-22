package inf008.ads.ifba.edu.br.logisticsnegotium.dao;

import android.view.View;

import java.util.Collection;

import inf008.ads.ifba.edu.br.logisticsnegotium.entities.AutomatedVehicles;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.Point;

public interface DeliveryDAOIF {
	public void save(AutomatedVehicles av, Point point) throws Exception;
	public Collection<AutomatedVehicles> findAll() throws Exception;
	public Collection<AutomatedVehicles> findByCapacity(double capacity) throws Exception;
}
