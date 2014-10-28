// Pre-Conditions:
// Depends on Regular and Enrolled Student as superclasses

package studentAcademicStatus;

// Subclass of Regular student
/**
 * @author owusumic17
 *
 */
public class Employee extends Regular {

	// Constructor
	/**
	 * @param first
	 * @param last
	 * @param enrolledCred
	 * @param totalCred
	 * @param humCred
	 * @param ssCred
	 * @param sciCred
	 * @param genCred
	 * @param mjr
	 */
	public Employee(String first, String last, double enrolledCred, double totalCred, double humCred, double ssCred, 
			double sciCred, double genCred, String mjr) {
		super(first, last, enrolledCred, totalCred, false, humCred, ssCred, sciCred, genCred, mjr);
	}

	// Hard-coded category string
	String getStudentCategory() {
		return "Employee";
	}

	// Employee's can only take up to 4 credits 
	boolean validRegistration() {
		// Check if currentEnrolledCredits is in valid range
		if (currentEnrolledCredits <= 4 && currentEnrolledCredits > 0)
			return true;
		else
			return false;
	}

}

// Post Conditions:
// Definition of Grinnell Employee EnrolledStudent