package week7.day1;

public class ChromeDriver {

	int rollNo;
	String subject;
	
	//default Constructor
	public ChromeDriver() {
		System.out.println("I am Default constructor");
	}
	
	//parameterized Constructor
	public ChromeDriver(int rollNo,String subject) {
		this();
		
		this.rollNo=rollNo;
		this.subject=subject;
		
		System.out.println("My rollNo is :"+rollNo+"\n"+"My subject name is :"+subject);
	}
	
	public ChromeDriver(int x) {
		this(27,"CS");

		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
//		ChromeDriver obj=new ChromeDriver();
//		
//		/*
//		 * System.out.println("Default value for int :"+obj.rollNo);
//		 * System.out.println("Default value for String :"+ obj.subject);
//		 */
//		
//		ChromeDriver obj1=new ChromeDriver(28,"maths");
		
		ChromeDriver obj2=new ChromeDriver(30);
		
	}
	
}
