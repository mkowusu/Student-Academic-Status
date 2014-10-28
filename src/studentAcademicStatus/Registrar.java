// Pre-Conditions
// This class depends on EnrolledStudent, Regular, NonRegular, Alum, Special,
// and Employee to run

package studentAcademicStatus;

import java.util.ArrayList;

/**
 * @author owusumic17
 *
 */
public class Registrar {

	/**
	 * Object ArrayList of Enrolled Students
	 */
	static ArrayList<EnrolledStudent> listOfStudents = new ArrayList<EnrolledStudent>();

	// Method to print all students added to the ArrayList listOfStudents
	public static void listStudents () {
		System.out.println ("List of currently enrolled students:\n");
		for (int i = 0; i < listOfStudents.size(); i++)
			// iterate through listOfStudents printing the objects
			System.out.println(listOfStudents.get(i) + "\n");
		System.out.println ("\nEnd of Listing");
	}

	
	public static void totalNonRegularStudents () {
		int count = 0;
		for (int i = 0; i < listOfStudents.size(); i++) {
			if(listOfStudents.get(i).nonRegularStudent == true)
			count++;
		}
		System.out.println ("\nCurrent Number of Non-Regular Students: " + count);
	}


	/**
	 * @param argv
	 * @throws Exception
	 */
	public static void main (String [] argv) throws Exception {

		// Declarations
		Regular regular = new Regular("Michael", "Owusu", 16, 42, false, 12, 
				12, 20, 14, "Computer Science");
		Alum alum = new Alum("Erik", "Opavsky", 4, 124, "Computer Science");
		Alum alum1 = new Alum("Peter", "Dixon", 5, 144, "Computer Science");
		Special special = new Special("Drew", "Cooper", 4, 8);
		Employee employee = new Employee("Terri", "Wilson", 4, 120, 30, 25, 25, 40, "English");
		Employee employee1 = new Employee("John", "Yang", 5, 130, 32, 26, 27, 40, "Music");

		// Add EnrolledStudents to Registrar list 
		listOfStudents.add(regular);
		listOfStudents.add(alum);
		listOfStudents.add(alum1);
		listOfStudents.add(special);
		listOfStudents.add(employee);
		listOfStudents.add(employee1);

		// Print EnrolledStudents and details
		listStudents();
		
		totalNonRegularStudents();

		

	}

}

// Post Conditions:
// Several students of varying types are initialized and added to the ArrayList
// listOfStudents is printed
// Methods from supporting classes are called
// Exceptions are handled without interrupting the output