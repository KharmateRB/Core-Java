package day2;

public class Employee {
	String name ;
	int emp_id;
	
	

	public Employee(String name, int emp_id) {
		super();
		this.name = name;
		this.emp_id = emp_id;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("ROHIT",101);
		Employee e2=new Employee("PRASHANT",102);
		System.out.println("Employee 1 :"+e1.name+" "+e1.emp_id);
		System.out.println("Employee 1 :"+e2.name+" "+e2.emp_id);


	}

}
