package n1exercici1;

public class Worker {
	
	private String name; 
	private String lastname;
	private int hourPrice; 
	
	public  Worker(String name,String lastname, int hourPrice) {
		this.name = name; 
		this.lastname = lastname; 
		this.hourPrice = hourPrice; 
	}

	public int calculateSalary(int workedHours) {
		
		return hourPrice * workedHours; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getHourPrice() {
		return hourPrice;
	}

	public void setHourPrice(int hourPrice) {
		this.hourPrice = hourPrice;
	}
	
	

}
