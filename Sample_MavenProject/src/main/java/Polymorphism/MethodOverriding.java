package Polymorphism;

public class MethodOverriding extends SubClasschild{
	
	public void add() {
		super.add();
		System.out.println("main parent class");
	}
	
	public static void main(String[] args) {
		MethodOverriding s=new MethodOverriding();
		s.add();
	}

}
