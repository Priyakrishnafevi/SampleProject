package testinterface;

public class InterfaceTesting implements Sample_Interface1,Sample_Interface2 { //childclass. called interfaces using implements// multiple interface
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTesting i=new InterfaceTesting();
		i.add();
		i.print();
		i.sum();
	//	Sample_Interface1 j=new Sample_Interface1();-- Cannot instantiate the interfacename.
		Sample_Interface1 j=new InterfaceTesting();// we can instantiate the interface using the class.
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int d=a+b;
		System.out.println("The sum is "+(a+b));
		
	}

}
