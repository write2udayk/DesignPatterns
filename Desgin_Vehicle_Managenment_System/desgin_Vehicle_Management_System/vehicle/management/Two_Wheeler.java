package vehicle.management;

public class Two_Wheeler extends Vehicle {
	private String fueltype;

	public Two_Wheeler(String model, String number,String fuelType) {
		super(model, number);
		this.fueltype=fuelType;
	}

	@Override
	void getdetails() {
		System.out.println();
		
	}

	
	

}
