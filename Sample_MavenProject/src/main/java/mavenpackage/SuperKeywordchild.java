package mavenpackage;

public class SuperKeywordchild extends SuperKeyword {

	public void print() {
		System.out.println("Hi");
		System.out.println(super.a);
		System.out.println(b);
	super.add();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordchild x=new SuperKeywordchild();
		x.print();
		//x.add();

	}

}
