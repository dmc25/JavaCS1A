package week4;

import java.io.IOException;
import java.net.URL;

public class Test {

	public static void main(String[] args) throws IOException {
		
		URL url = Test.class.getResource("Employees.csv");
		String [] fileLocation = url.toString().split(":");
		
		EmployeeList e1 = new EmployeeList(fileLocation[fileLocation.length - 1]);
		Employee em1 = new Employee("Damian Coln", "20262400", "1737 84th Ave, Oakland, CA 94621", "(650)892-6959", "08-14-1990", "TS");
		Employee em2 = new Employee("Marquita Cogley", "30281481", "833 Grand St Boca Raton FL 33428", "(145) 164-5833",  "4/14/1965", "U");
		Employee em3 = new Employee("Stephani Swarthout", "31921800", "39 Roehampton Ave Santa Cruz CA 95060", "(802) 925-5373", "5/8/1989", "C");
		
		System.out.println();
		System.out.println("Original Employee List: ");
		e1.display();
		
		System.out.println();
		System.out.println("Add Damian to list: ");
		e1.add(em1);
		e1.display();
		
		System.out.println();
		System.out.println("Sorted by name:");
		e1.sortByName();
		e1.display();
		
		System.out.println();
		System.out.println("Sort by ID: ");
		e1.sortByID();
		e1.display();
		
		System.out.println();
		System.out.println("Remove of Damian: ");
		e1.remove(em1);
		e1.display();
		
		System.out.println();
		System.out.println("Print out Marquita Cogley's Info");
		System.out.println();
		e1.search(em2);
		System.out.println(em2.display());
		
		System.out.println();
		System.out.println("Updating Stephanie Swarthout: ");
		System.out.println();
		e1.updateAddr(em3, "217 Chestnut St, Santa Cruz, CA, 95060");
		System.out.println(em3.toString());

	}

}
