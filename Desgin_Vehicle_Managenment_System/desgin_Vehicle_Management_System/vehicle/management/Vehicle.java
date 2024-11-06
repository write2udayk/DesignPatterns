package vehicle.management;

public abstract class Vehicle {
	private String model;
	private String number;

	public Vehicle(String model, String number) {
		this.model = model;
		this.number = number;
	}

	public String getVehicleDetails() {
        return "Model: " + model +
               ", License Plate: " +number;
               
    }

	void getdetails() {
		// TODO Auto-generated method stub
		
	}

}
