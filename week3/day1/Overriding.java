package week3.day1;

public class Overriding extends LearnOverRiding {

	public void seleniumVersion() {
		System.out.println("4.21.0");
	}
	public static void main(String[] args) {
		Overriding or=new Overriding();
		or.seleniumVersion();
	}
}
