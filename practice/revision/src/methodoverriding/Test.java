package methodoverriding;

//same name
// in different class
//same argument as same sequence same type
//but use inheritance 

public class Test {

	void show(int a) {
		System.out.println("1");
	}

	static  class Xyz extends Test {

		void show(int a) {
			System.out.println("2");
		}

		public static void main(String args[]) {
			Test t = new Test();
			t.show(9);
			Xyz x = new Xyz();
			x.show(8);

		}
	}

}
