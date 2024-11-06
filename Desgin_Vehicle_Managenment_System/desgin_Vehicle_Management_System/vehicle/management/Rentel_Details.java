package vehicle.management;

public class Rentel_Details {

	private String name;
	private String PhNum;
	private String licience;

	public String getName() {
		return name;
	}

	public String getPhNum() {
		return PhNum;
	}

	public String getLicience() {
		return licience;
	}

	public Rentel_Details(String name, String phNum, String licience) {
		
		this.name = name;
		this.PhNum = phNum;
		this.licience = licience;
	}

	
}
