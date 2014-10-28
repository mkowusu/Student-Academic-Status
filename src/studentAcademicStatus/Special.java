// Pre-Conditions:
// NonRegular and Enrolled Students are required as superclasses

package studentAcademicStatus;

// Subclass of NonRegular
/**
 * @author owusumic17
 *
 */
public class Special extends NonRegular {

	// Constructor
	/**
	 * @param first
	 * @param last
	 * @param enrolledCred
	 * @param totalCred
	 */
	public Special (String first, String last, double enrolledCred,
			double totalCred) {
		super(first, last, enrolledCred, totalCred, true);
	}

	// Hardcoded Category String
	String getStudentCategory() {
		return "Special";
	}

	// Special Students don't have a major-- therefore throw exception
	String getMajor() throws Exception {
		throw new Exception("Special students do not have a major."); 
	}

}

// Post Conditions:
// Definition of Grinnell Special EnrolledStudent
