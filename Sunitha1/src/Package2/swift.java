
// calling the methods using "this" and "super" keywords.

package Package2;

public class swift {
	public void method1() {
		this.method4(12,12,12);
		System.out.println("This is the parent default method");
	}
	
	public void method2(int a) {
		this.method1();
		System.out.println("This is the parent one parameterized method");
	}
	
	public void method3(int a, int b) {
		this.method2(12);
		System.out.println("This is the parent two parameterized method");
	}

	public void method4(int a, int b, int c) {
		System.out.println("Thi is the parent three parameterized method");
	}
}
