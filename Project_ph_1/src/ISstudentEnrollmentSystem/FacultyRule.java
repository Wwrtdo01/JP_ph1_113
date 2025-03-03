package ISstudentEnrollmentSystem;

public abstract class FacultyRule {

	public double BachPassDegree = 92.50;

    // Minimum passing degree for Master's students
    public double MasterPassDegree = 98.50;

    //Abstract method to check if a given degree meets the passing requirement.
    public abstract boolean CheckPassDegree(double degree);

    //Abstract method to get the doctor section details.
    public abstract String getDoctorSection();
}
