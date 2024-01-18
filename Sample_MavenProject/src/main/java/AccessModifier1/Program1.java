package AccessModifier1;

public class Program1 {
	
	public void print() {
		System.out.println("Hi");
	}
	
	private void add() {
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
	
	protected void name() {
		System.out.println(" added.");
	}
	
	void sum() {
		int x=3;
		int y=4;
		int z=x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Program1 s=new Program1();
		s.print();
		s.add();
		s.name();
		s.sum();
	}

}
