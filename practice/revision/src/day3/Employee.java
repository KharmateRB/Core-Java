package day3; // Static keyword use

public class Employee {

		int empid;
		String name;
		static String company= "iacsd";
	public Employee(int empid, String name) {
			super();
			this.empid = empid;
			this.name = name;
		}
	
	void display()
	{
		System.out.println(empid+""+name+" "+   company);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"  rohit  ");
		e1.display();
		Employee e2=new Employee(102,"  anil  ");
		e2.display();
		Employee e3=new Employee(103,"  shubham  ");
		e3.display();


	}

}
