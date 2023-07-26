package methodoverloading;

 //same method name
 // within same class
// diffenent arguments type and sequence can be different

public class Test {
	
	void show(String name)
	{
		System.out.println("1");
	}
	void show(int a)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		t.show(10);
		t.show("rohit");


	}

}
