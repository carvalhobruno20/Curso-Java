package entities;

public class Employee {

	public String name;
	public Double grossSalary;
	public Double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		return grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return "Employee: " + name + ", $ " +  String.format("%.2f", netSalary());
	}
	
}
