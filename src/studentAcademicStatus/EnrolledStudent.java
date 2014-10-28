// Pre-Conditions:
// No Additional

package studentAcademicStatus;

// Superclass
/**
 * @author owusumic17
 *
 */
public abstract class EnrolledStudent {

	// Declarations
	/**
	 * First Name
	 */
	String firstName;
	
	/**
	 * Last Name
	 */
	String lastName;
	
	/**
	 * Current Enrolled Credits
	 */
	double currentEnrolledCredits;
	
	/**
	 * Total Credits Earned 
	 */
	double totalCreditsEarned;
	
	boolean nonRegularStudent;


	/**
	 * @param first
	 * @param last
	 * @param enrolledCred
	 * @param totalCred
	 */
	public EnrolledStudent(String first, String last, double enrolledCred, double totalCred, boolean nonRegStud) {

		firstName = first;
		lastName = last;
		currentEnrolledCredits = enrolledCred;
		totalCreditsEarned = totalCred;
		nonRegularStudent = nonRegStud;

	}

	// Abstract Method Declarations
	/**
	 * @return category
	 */
	abstract String getStudentCategory();

	/**
	 * @return standing
	 * @throws Exception
	 */
	abstract String getClassStanding() throws Exception;

	/**
	 * @return boolean
	 * @throws Exception
	 */
	abstract boolean makingGoodProgress() throws Exception;

	/**
	 * boolean
	 * @return
	 */
	abstract boolean validRegistration();

	/**
	 * @return major
	 * @throws Exception
	 */
	abstract String getMajor() throws Exception;

	// Getters + Setters
	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return currentEnrolledCredits
	 */
	public double getCurrentEnrolledCredits() {
		return currentEnrolledCredits;
	}

	/**
	 * @param currentEnrolledCredits
	 */
	public void setCurrentEnrolledCredits(double currentEnrolledCredits) {
		this.currentEnrolledCredits = currentEnrolledCredits;
	}

	/**
	 * @return totalCreditsEarned
	 */
	public double getTotalCreditsEarned() {
		return totalCreditsEarned;
	}
	/**
	 * @param totalCreditsEarned
	 */
	public void setTotalCreditsEarned(double totalCreditsEarned) {
		this.totalCreditsEarned = totalCreditsEarned;
	}
	

	// toString method for nicely formatted output
	public String toString(){
		return "Name: " + firstName + " " + lastName
				+ "\nCurrent Enrolled Credits: " + currentEnrolledCredits
				+ "\nTotal Credits Earned: " + totalCreditsEarned
				+ "\nNon-Regular Student? " + nonRegularStudent;
	}


}

// Post Conditions:
// Abstract definition of Grinnell EnrolledStudent