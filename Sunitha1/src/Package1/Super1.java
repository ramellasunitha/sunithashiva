
//Super1 & Super2 classes

//parent three parameterized constructor
//Parent Default constructor...
//Parent one parameterized contructor...
//parent two parameterized constructor...
//child two parameterized constructor...
//child default constructor
//child three parameterized constructor
//child one parameterized constructor

package Package1;

public class Super1 {
	
	public Super1() {
		this(12,13,14);
		System.out.println("Parent Default constructor...");
	}
	
	public Super1(int a) {
		this();
		System.out.println("Parent one parameterized contructor...");
	}
	
	public Super1(int a, int b) {
		this(12);
		System.out.println("parent two parameterized constructor...");
	}
	
	public Super1(int a, int b, int c) {
		System.out.println("parent three parameterized constructor");
	}
	
}
