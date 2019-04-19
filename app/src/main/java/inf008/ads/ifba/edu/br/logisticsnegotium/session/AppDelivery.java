package inf008.ads.ifba.edu.br.logisticsnegotium.session;

import inf008.ads.ifba.edu.br.logisticsnegotium.entities.Point;

public class AppDelivery {
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
}
