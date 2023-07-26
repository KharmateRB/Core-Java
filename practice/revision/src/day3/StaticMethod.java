package day3; 

public class StaticMethod {

	void display() {
		System.out.println("By instance method");
	}

	static void show() {
		System.out.println("By static method");
	}

	public static void main(String[] args) {
		
		StaticMethod t= new StaticMethod ();
		t.display();
		StaticMethod.show();
		
		
	}
}
