//this is an abstract class
//cannot be used to create object
abstract class A {
	//abstract method, doesn't have a body
	public abstract void m1(double x);
	public void m2() {
		System.out.println("This is something");
	}
	public int m3(int i) {
		return i;
	}
}
//the subclass of A
class B extends A {
	//provides the body
	public void m1(double x) {
		System.out.println(x*x);
	}
}
//The main class
public class Abstraction {

	public static void main(String[] args) {
		
		B b = new B();
		b.m1(1.3);
		b.m2();
		System.out.println(b.m3(5));

	}

}
