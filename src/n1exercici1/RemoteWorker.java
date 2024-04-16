package n1exercici1;

public class RemoteWorker extends Worker {
	
	final int INTERNET_RATE = 30; 
    
    public RemoteWorker(String name, String lastname, int hourPrice) {
        super(name, lastname, hourPrice);
    }
    
    
    @Override
    public int calculateSalary(int workedHours) {
	
	int baseSalary = super.calculateSalary(workedHours);
	return baseSalary + INTERNET_RATE; 
    }
    
    @Deprecated
    public int baseSalaryMonth() {
        return 160 * super.getHourPrice();
    }
    
    @Override
    public String toString() {
    	return "name: " + super.getName() + "| lastname: " + super.getLastname() + " | hour price: " + super.getHourPrice(); 
    }

}
