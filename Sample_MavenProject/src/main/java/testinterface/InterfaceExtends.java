package testinterface;

public class InterfaceExtends implements Sample_Interface2{//calling extended interfaces

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExtends s=new InterfaceExtends();
		s.sum();
		s.add();
		s.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("The sum is "+(a+b));
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("The add is "+(a+b));
	}

}
