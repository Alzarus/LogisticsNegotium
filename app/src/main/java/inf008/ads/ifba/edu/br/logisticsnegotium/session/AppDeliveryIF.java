package inf008.ads.ifba.edu.br.logisticsnegotium.session;

import java.util.Collection;

import inf008.ads.ifba.edu.br.logisticsnegotium.entities.AutomatedVehicles;

public interface AppDeliveryIF{
	//public void save(Atividade atividade) throws Exception;
	public Collection<AutomatedVehicles> findAll() throws Exception;
	public AutomatedVehicles findByCapacity(double capacity) throws Exception;

}
