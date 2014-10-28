// Pre-Conditions:
// Depends on EnrolledStudent as a superclass

package studentAcademicStatus;

// SubClass of EnrolledStudent
/**
 * @author owusumic17
 *
 */
public abstract class NonRegular extends EnrolledStudent {

	// Constructor
	/**
	 * @param first
	 * @param last
	 * @param enrolledCred
	 * @param totalCred
	 */
	public NonRegular(String first, String last, double enrolledCred,
			double totalCred, boolean nonRegStud){
		// NonRegular inherits all fields from EnrolledStudent
		super(first, last, enrolledCred, totalCred, true);

	}

	// NonRegular Students can only take up to 4 credits
	boolean validRegistration(){
		// Check if currentEnrolledCredits is in valid range
		if (currentEnrolledCredits <= 4 && currentEnrolledCredits > 0)
			return true;
		else
			return false;	
	}

	// NonRegular students do not have Class Standing-- therefore throw exception
	String getClassStanding() throws Exception {
		throw new Exception("No class standing available for NonRegular students.");
	}

	// NonRegular students do not have Progress Report-- therefore throw exception
	boolean makingGoodProgress() throws Exception {
		throw new Exception("No progress report available for NonRegular students.");
	}

	// Inherited to string method
	public String toString() {
		return super.toString();
	}
}

// Post Conditions:
// Abstract definition of Grinnell NonRegular EnrolledStudent