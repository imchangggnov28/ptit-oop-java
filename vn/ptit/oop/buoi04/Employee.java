package vn.ptit.oop.buoi04; 
	public class Employee { 
	private String firstName; 
	private String lastName; 
	private double monthlySalary; 
	public Employee(String firstName, String lastName, double monthlySalary) { 
		this.firstName = firstName; 
		this.lastName = lastName; 
		setMonthlySalary(monthlySalary); 
	} 
	public String getFirstName() { return firstName; } 
	public void setFirstName(String firstName) { this.firstName = firstName; } 
	public String getLastName() { return lastName; } 
	public void setLastName(String lastName) { this.lastName = lastName; } 
	public double getMonthlySalary() { return monthlySalary; } 
	public void setMonthlySalary(double monthlySalary) { 
		this.monthlySalary = Math.max(0.0, monthlySalary); 
	} 
	public double getYearlySalary() { return monthlySalary * 12; } 
	public void raiseSalary(double percent) { 
		if (percent > 0) { 
			this.monthlySalary += this.monthlySalary * (percent / 100.0); 
		} 
	} 
} 