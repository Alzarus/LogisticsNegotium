package inf008.ads.ifba.edu.br.logisticsnegotium.dao;

import java.util.Collection;

import inf008.ads.ifba.edu.br.logisticsnegotium.entities.AutomatedVehicles;

public interface DeliveryDAOIF {
	public void save(AutomatedVehicles av) throws Exception;
	public Collection<AutomatedVehicles> findAll() throws Exception;
	public Collection<AutomatedVehicles> findByCapacity(double capacity) throws Exception;
}
