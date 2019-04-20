package inf008.ads.ifba.edu.br.logisticsnegotium.session;

import java.util.Collection;

import inf008.ads.ifba.edu.br.logisticsnegotium.dao.DeliveryDAOIF;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.AutomatedVehicles;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.Point;

public interface AppDeliveryIF{
	public void addDelivery(int registration, Point reach, Point dely, double price) throws Exception;
	public void addVehicle(int registration, double capacity, double latitude, double longitude) throws Exception;
    public Collection<AutomatedVehicles> listVehicles() throws Exception;
	public Collection<AutomatedVehicles> searchByCapacity(double capacity) throws Exception;    
	
	
	public void setDeliveryDAOIF(DeliveryDAOIF deliveryDAO);

}
