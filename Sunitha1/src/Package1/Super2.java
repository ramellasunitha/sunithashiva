
//parent three parameterized constructor
//Parent Default constructor...
//Parent one parameterized contructor...
//parent two parameterized constructor...
//child two parameterized constructor...
//child default constructor
//child three parameterized constructor
//child one parameterized constructor


package Package1;

public class Super2 extends Super1{
	public Super2() {
		this(12,13);
		System.out.println("child default constructor");
	}
	
	public Super2(int a) {
		this(11,13,14);
		System.out.println("child one parameterized constructor");
	}
	
	public Super2(int a, int b) {
		super(12,13);
		System.out.println("child two parameterized constructor...");
	}
	
	public Super2(int a, int b, int c) {
		this();
		System.out.println("child three parameterized constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Break point");
		Super2 obj=new Super2(12);	
	}

}
