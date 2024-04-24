package n1exercici1;

public class OnSiteWorker extends Worker {
	
	private static int benzina = 150; 
    
    public OnSiteWorker(String name, String lastname, int hourPrice) {
        super(name, lastname, hourPrice);
    }
    
    @Override
	public int calculateSalary(int workedHours) {
	
	int baseSalary = super.calculateSalary(workedHours);
	return baseSalary + benzina; 
    }
    
    
    @Deprecated
    public String bonusHour(int workedHours) {
    	String answer; 
    	if (workedHours > 100){
    		answer = super.getName() + " has earned a bonus of 150€ for working more than 100 hours this month."; 
    	}else {
    		answer = "Unfortunately, " + super.getName() + " has not earned the bonus this month.";  
    	}  	
    	return answer; 
    }
    
    
    
    @Override
    public String toString() {
    	return "name: " + super.getName() + "| lastname: " + super.getLastname() + " | hour price: " + super.getHourPrice(); 
    }

    
}
