package day2;

public class Animal {

	String color;
	int age;

	void initobj(String c, int a) {
		color = c;
		age = a;
	}

	public void eat() {
		System.out.println("iam eating");
	}

	

	void display() {
		System.out.println(color + " \n " + age);

	}

	void run() {
		System.out.println("Im running");
	}
}

class Bird {
	void fly() {
		System.out.println("Im flying");
	}
}
