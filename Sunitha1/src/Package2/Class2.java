package Package2;

import Package1.Class1;

public class Class2 {
	public void me1() {
		System.out.println("Package 2 class 2 method1");
	}
	
	public static void main(String[] args) {
		Class1 ob1=new Class1();   /// has a relation
		ob1.abc();
		ob1.xyz();
		Class2 ob2=new Class2();
		ob2.me1();
	}

}
