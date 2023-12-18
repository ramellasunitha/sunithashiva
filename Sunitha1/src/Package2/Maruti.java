
//// calling the methods using "this" and "super" keywords.

package Package2;

public class Maruti extends swift{
	
	public void ma1() {
		this.ma2(12);
		System.out.println("this is the Child default method");
	}
	
	public void ma2(int a) {
		super.method3(12,11);
		System.out.println("this is the child one parameterized method");
	}
	
	public void ma3(int a,int b) {
		this.ma4(12,12,12);
		System.out.println("This is the child two parameterized method");
	}
	
	public void ma4(int a, int b, int c) {
		this.ma1();
		System.out.println("This is the child three paramterized method");
	}
	
	public static void main(String[] args) {
		Maruti obj=new Maruti();
		obj.ma3(11,13);
	}

}
