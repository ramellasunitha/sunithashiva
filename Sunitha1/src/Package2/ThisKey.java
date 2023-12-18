
// using this keyword --- calling the method in the same class
package Package2;

public class ThisKey {
	public void m1() {
		this.m4();
		System.out.println("This is default method.....");
	}
	
	public void m2() {
		this.m1();
		System.out.println("This is one parameterized method...");
	}
	
	public void m3() {
		this.m2();
		System.out.println("This is two parameterized method...");
	}
	
	public void m4() {
		System.out.println("This is three parameterized method...");
	}
	
	public void m5() {
		this.m3();
		System.out.println("This is four parameterized method....");
	}
	
	public static void main(String[] args) {
		ThisKey obj=new ThisKey();
		obj.m5();
	}

}
