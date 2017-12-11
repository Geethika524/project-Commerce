import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Product{
	
	PrintStream ps = new PrintStream(System.out);
	 Scanner sc = new Scanner(System.in);
	   
		SortedMap<String, Integer> sm = new TreeMap<String, Integer>();
		public int total = 0;
		private String product;
		
			public void input() {
				
					ps.println("Enter number of products: ");
					int n = sc.nextInt();
				
					String[] b= new String[n];
					int[] c = new int[n];
					int[] p = new int[n];
					

					int price = 0;
					
					for(int i = 0; i < n ;i ++) {
					
						ps.print("Enter  product: ");
					    String d = sc.nextLine();
					    b[i]= sc.nextLine();
					    
					    ps.print("Enter the product Price: ");
					    c[i]  = sc.nextInt();
					    		                
					    p[i] = c[i];
					    
		                sm.put(b[i], c[i]);

		                Set s = sm.entrySet();
		                
		                total = total + c[i];
		                ps.println(total);
		                
		                Iterator t = s.iterator();

		                while (t.hasNext()) {
			
		                	Map.Entry m = (Map.Entry)t.next();
			                
			                product = (String)m.getKey();
			                price = (Integer)m.getValue();
			                
			                ps.println();
			                ps.println("\t" + "Product" + "\t" + "\t" + "Price");
			                ps.println("\t" + product + "\t" +"\t" + price);
			                ps.println();
			               			                
		                }
		                
						ps.println("Current total price: " + total);
					}
			}

			
			
}