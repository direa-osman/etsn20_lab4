package etsn20_lab4;
import java.util.*;

public class str_search {

	public static void main(String[] args) {
		

	    if(args.length < 2) {
		    System.out.println("Enter textfile to search (example.txt):... ");
		    System.out.println("And Enter pattern to search for:... ");
		    System.exit(1);
	    }
	    String pattern = args[0];
	    String textfile = args[1];
		Scanner sc = new Scanner(str_search.class.getResourceAsStream(textfile));
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			boolean found = Arrays.asList(line.split(" ")).contains(pattern);
			if(found) {
				System.out.println(line);
			}
		}
		
		sc.close();       
	    
	}

}
