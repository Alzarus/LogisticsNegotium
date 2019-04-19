package inf008.ads.ifba.edu.br.logisticsnegotium.session;

import java.util.Collection;

import inf008.ads.ifba.edu.br.logisticsnegotium.entities.AutomatedVehicles;
import inf008.ads.ifba.edu.br.logisticsnegotium.entities.Point;

public class AppDelivery implements AppDeliveryIF{
    private Point pointRech;
    private Point pointDely;

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
	public Collection<AutomatedVehicles> findAll() throws Exception {
		// TODO Auto-generated method stub
		//Map
		return null;
	}


	@Override
	public AutomatedVehicles findByCapacity(double capacity) throws Exception {
		// TODO Auto-generated method stub
		//Escolha de veiculo
		return null;
	}
}
