package inf008.ads.ifba.edu.br.logisticsnegotium.entities;

import inf008.ads.ifba.edu.br.logisticsnegotium.interfaces.AutomatedVehiclesIF;

public abstract class AutomatedVehicles implements AutomatedVehiclesIF {
    private int registration;
    private double capacity;
    private Point point;

    public AutomatedVehicles(int registration, double capacity, double latitude, double longitude){
        this.setRegistration(registration);
        this.setCapacity(capacity);
        this.setPoint(latitude, longitude);
    }

    public int getRegistration() {
        return registration;
    }

    private void setRegistration(int registration) {
        this.registration = registration;
    }

    public double getCapacity() {
        return capacity;
    }

    private void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(double latitude, double longitude){
        this.point = new Point(latitude, longitude);
    }


}
