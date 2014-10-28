// Pre-Conditions:
// Depends on EnrolledStudent

package studentAcademicStatus;

// Subclass of EnrolledStudent
/**
 * @author owusumic17
 *
 */
public class Regular extends EnrolledStudent {

	// Declarations
	/**
	 * Humanitities Credits 
	 */
	double humanitiesCredits;
	
	/**
	 * Social Studies Credits
	 */
	double socialStudiesCredits;
	
	/**
	 * Science Credits
	 */
	double scienceCredits;
	
	/**
	 * General Credits 
	 */
	double generalCredits;
	
	/**
	 * Major
	 */
	String major;

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
	public Regular (String first, String last, double enrolledCred, double totalCred,  boolean nonRegStud, double humCred, 
			double ssCred, double sciCred, double genCred, String mjr){
		// Get fields from super
		super(first, last, enrolledCred, totalCred, false);

		// Regular has 5 unique fields
		humanitiesCredits = humCred;
		socialStudiesCredits = ssCred;
		scienceCredits = sciCred;
		generalCredits = genCred;
		major = mjr;
	}
	// Setters for Regular-specific fields
	/**
	 * @param humanitiesCredits
	 */
	public void setHumanitiesCredits(double humanitiesCredits) {
		this.humanitiesCredits = humanitiesCredits;
	}
	/**
	 * @param socialStudiesCredits
	 */
	public void setSocialStudiesCredits(double socialStudiesCredits) {
		this.socialStudiesCredits = socialStudiesCredits;
	}
	/**
	 * @param scienceCredits
	 */
	public void setScienceCredits(double scienceCredits) {
		this.scienceCredits = scienceCredits;
	}
	/**
	 * @param generalCredits
	 */
	public void setGeneralCredits(double generalCredits) {
		this.generalCredits = generalCredits;
	}
	/**
	 * @param major
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	// Implementation of inherited abstract methods

	// Hardcoded Category
	String getStudentCategory() {
		return "Regular";
	}

	// Class standing depending on the amount of credits the enrolledStudent has
	String getClassStanding() throws Exception {
		if (totalCreditsEarned > 0 && totalCreditsEarned <= 11.5)
			return "First Year, Semester 1";
		else if (totalCreditsEarned >= 12 && totalCreditsEarned <= 27.5)
			return "First Year, Semester 2";
		else if (totalCreditsEarned >= 28 && totalCreditsEarned <= 43.5)
			return "Second Year, Semester 1";
		else if (totalCreditsEarned >= 44 && totalCreditsEarned <= 59.5)
			return "Second Year, Semester 2";
		else if (totalCreditsEarned >= 60 && totalCreditsEarned <= 75.5)
			return "Junior, Semester 1";
		else if (totalCreditsEarned >= 76 && totalCreditsEarned <= 91.5)
			return "Junior, Semester 2";
		else if (totalCreditsEarned >= 92 && totalCreditsEarned <= 107.5)
			return "Senior, Semester 1";
		else if (totalCreditsEarned >= 108 && totalCreditsEarned <= 123.5)
			return "Senior Year, Semester 2";
		else return "Graduate.";
	}

	// 10% of total credits should come from humanities, social studies and science each
	boolean makingGoodProgress() throws Exception {
		double comparison = totalCreditsEarned/10;
		if (comparison <= humanitiesCredits
				&& comparison <= socialStudiesCredits
				&& comparison <= scienceCredits)
			return true;

		else return false;
	}

	// Regular students must take between 12 and 18 credits
	boolean validRegistration() {
		if (currentEnrolledCredits > 12 && currentEnrolledCredits <= 18)
			return true;
		else return false;
	}

	// Return major field
	public String getMajor() {
		return major;
	}

	// Overwritten toString method to incorporate unique fields
	public String toString() {
		// Return toString from super
		return super.toString()
				// Append new field as well
				+ "\nHumanities Credits: " + humanitiesCredits
				+ "\nSocial Studies Credits: " + socialStudiesCredits
				+ "\nScience Credits: " + scienceCredits
				+ "\nGeneral Credits: " + generalCredits
				+ "\nMajor: " + major;
	}

}

// Post Conditions:
// Definition of Regular Grinnell EnrolledStudent