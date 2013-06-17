package mzielins.scjp;

public class Question11 {

	static int f1(int i) {
		System.out.print(i + ",");
		return 0;
	}

	public static void main(String... args) {
		int i = 0;
		i = i++ + f1(i);
		System.out.print(i);
	}
	
}
