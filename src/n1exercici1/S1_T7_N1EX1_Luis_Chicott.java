package n1exercici1;

public class S1_T7_N1EX1_Luis_Chicott {


	public static void main(String[] args) {
		

		//Ejercicio 1
		RemoteWorker worker1 = new RemoteWorker("Luis", "Chicott", 20);
		OnSiteWorker worker2 = new OnSiteWorker("Eliécer", "Chicott", 30, 150);
		
		RemoteWorker worker3 = new RemoteWorker("Ernesto", "Gasia", 20);	
		OnSiteWorker worker4 = new OnSiteWorker("Alejandro", "Gonzalez", 30, 150);
		
		
		 System.out.println(worker1.toString()  + " |salary: " + worker1.calculateSalary(100)); 
		 System.out.println(worker2.toString()  + " |salary: " + worker2.calculateSalary(100)); 
		 
		 System.out.println(worker3.toString()  + " |salary: " + worker3.calculateSalary(150)); 
		 System.out.println(worker4.toString()  + " |salary: " + worker4.calculateSalary(160)); 
		 
		 System.out.print("\n");
		 
		//Ejercicio 2
		@SuppressWarnings("deprecation")
		int resultW1 = worker1.baseSalaryMonth(); 
		System.out.println("The base salary per month of " + worker1.getName() + " is " + resultW1);
		
		@SuppressWarnings("deprecation")
		int resultW3 = worker3.baseSalaryMonth(); 
		System.out.println("The base salary per month of " + worker3.getName() + " is " + resultW3);
		
		 System.out.print("\n");
		
		@SuppressWarnings("deprecation")		
		String answerW2 = worker2.bonusHour(99);
		System.out.println(answerW2);
		
		@SuppressWarnings("deprecation")		
		String answerW4 = worker4.bonusHour(120);
		System.out.println(answerW4);
		
	
		
	}

}
