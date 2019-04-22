package inf008.ads.ifba.edu.br.logisticsnegotium.entities;

import inf008.ads.ifba.edu.br.logisticsnegotium.interfaces.AutomatedVehiclesIF;

public abstract class AutomatedVehicles implements AutomatedVehiclesIF {
    private int id;
    private double capacity;
    private Point point;
    private boolean isAirVehicle;

    public AutomatedVehicles(int id, double capacity, double latitude, double longitude, boolean isAirVehicle){
        this.setId(id);
        this.setCapacity(capacity);
        this.setPoint(latitude, longitude);
        this.setAirVehicle(isAirVehicle);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
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

	public boolean isAirVehicle() {
		return isAirVehicle;
	}

	public void setAirVehicle(boolean isAirVehicle) {
		this.isAirVehicle = isAirVehicle;
	}
}
