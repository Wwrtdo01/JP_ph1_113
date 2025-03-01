package ISstudentEnrollmentSystem;

public abstract class FacultyMember extends Person{
public String MembershipType;  // teaching assistant or facultyMember or professor

public abstract String getSectionDoctor(); // to get your course teacher (who's gonna teach you), randomly as (KSU)

// constructors 
FacultyMember(String mType, String fname,String lName, int phoneNum, String email, int ssn, String location){
	
	MembershipType = mType;
}

}
