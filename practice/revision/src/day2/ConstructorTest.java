package day2;

public class ConstructorTest {
	//int i;
	//String s;
	ConstructorTest(int a)
	{
		
		System.out.println("parameterized constructor");
	
	}
	public static void main(String args[]) {

		 ConstructorTest t = new ConstructorTest(10);  //default constructor 
		// System.out.println(t.i +""+t.s);
	}
}
