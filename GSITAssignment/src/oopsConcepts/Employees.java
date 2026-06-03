package oopsConcepts;

public class Employees {
	
	private int empId ;
	private String empName;
	private double empSalary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID  : " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary       : " + empSalary);
    }

}
