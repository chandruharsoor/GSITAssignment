package oopsConcepts;

public class Encapsulation {

	public static void main(String[] args) {
		
		Employees emp =  new Employees();
		
		emp.setEmpId(30005990);
		emp.setEmpName("Rahul , Naame tho suna hi hoga");
		emp.setEmpSalary(900000);
		
		
		emp.displayDetails();	

	}

}
