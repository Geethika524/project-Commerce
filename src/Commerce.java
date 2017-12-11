 y/nimport java.io.PrintStream;
import java.util.Scanner;

public class Commerce {
 public static void main(String args[]) {
	 
	 PrintStream ps = new PrintStream(System.out);
	 Scanner sc = new Scanner(System.in);
	 Name n = new Name();
	 
	 ps.println("Did you want to enter your mobile number:y/n");
	 
	 String y = "y";
	
	 String s = sc.nextLine();
	 String name = new String();
	 String number = new String();
	 
	 if(y.equalsIgnoreCase(s)) {
	
	 n.input(name, number);
	 
	 }
	 
	 else {
		
		 n.input(name);
		 
	 }
	
	 

	 Product p = new Product();
	 p.input();

	 
	 ps.println("Name of the customer is       :       " + n.name);
	 ps.println("Number of the cutomer is      :       " + n.number);
	 ps.print("Final total is                  :       " + p.total);
	 
 }
}
