package Abstract;

public class Abstract2 extends Abstract1 {
	
	public void print() { //override
		System.out.println("world");
	}
	
	public static void main(String[] args) {
		Abstract2 i=new Abstract2();
		i.print();
		i.print2();
	}

}
