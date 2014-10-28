// Pre-Conditions:
// Depends on NonRegular and EnrolledStudent as Superclasses

package studentAcademicStatus;

// Subclass of NonRegular
/**
 * @author owusumic17
 *
 */
public class Alum extends NonRegular{

	// Declaration
	/**
	 * Major
	 */
	public String major;

	// Constructor
	/**
	 * @param first
	 * @param last
	 * @param enrolledCred
	 * @param totalCred
	 * @param mjr
	 */
	public Alum (String first, String last, double enrolledCred,
			double totalCred, String mjr){
		super(first, last, enrolledCred, totalCred, true);
		major = mjr;
	}

	// Hardcoded category method
	String getStudentCategory() {
		return "Alum";
	}

	// Return major field
	public String getMajor() {
		return major;
	}

	// Overwritten toString method to incorporate unique fields
	public String toString() {
		return super.toString()
				+ "\nMajor: " + major;
	}

}

// Post Conditions:
// Definition of Grinnell Alum EnrolledStudent