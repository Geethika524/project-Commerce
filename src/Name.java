import java.io.PrintStream;
import java.util.Scanner;

public  class Name implements  Input{
	
	PrintStream ps = new PrintStream(System.out);
	Scanner sc = new Scanner(System.in);

	String name;
	String number;
			
	public void input(String name1) {
		
		ps.println("Enter Customer name");
		name = sc.nextLine();
		
		
	}

	
	public void input(String name1, String number1) {
		
		ps.println("Enter Customer name");
		name = sc.nextLine();
		
		ps.println("Enter Customer number");
		number = sc.nextLine();
		
	}
	
	
	
}