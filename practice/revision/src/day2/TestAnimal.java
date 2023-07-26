package day2;

public class TestAnimal {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Animal dog = new Animal();
	Animal horse = new Animal();
	Bird crow = new Bird();
	dog.eat();
	horse.eat();
	crow.fly();
	System.out.println("without method call it will print this first");
	dog.eat();
	dog.color = "black";
	dog.age = 10;
	System.out.println(dog.color + " \n" + dog.age); // by reference variable

	Animal tiger = new Animal();
	tiger.initobj("Brown", 25); // by using method
	tiger.display();

}
}