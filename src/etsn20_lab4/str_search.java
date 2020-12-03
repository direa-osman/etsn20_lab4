package etsn20_lab4;
import java.util.*;

public class str_search {

	public static void main(String[] args) {
		
	    Scanner userInput = new Scanner(System.in);
	    System.out.println("Enter textfile to search (example.txt): ");
	    String textfile = userInput.nextLine();
	    System.out.println("Enter pattern to search for: ");
	    String pattern = userInput.nextLine();

		Scanner sc = new Scanner(str_search.class.getResourceAsStream(textfile));
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Boolean found = Arrays.asList(line.split(" ")).contains(pattern);
			if(found) {
				System.out.println(line);
			}
		}
		
		userInput.close();
		sc.close();       
	    
	}

}
