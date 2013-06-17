package mzielins.scjp;

public class Question8 {

	static interface I {
		static class C2 {
		}
	}

	public static void main(String[] args) {
		Question8.I.C2 ob1=new Question8.I.C2();
		System.out.println("object created");
	}

}
