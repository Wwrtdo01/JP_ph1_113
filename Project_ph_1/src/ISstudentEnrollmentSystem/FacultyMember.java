package ISstudentEnrollmentSystem;

public abstract class FacultyMember extends Person{
	
public String MembershipType;  // teaching assistant or facultyMember or professor

// constructors 
FacultyMember(String mType, String fname,String lName, int phoneNum, String email, int ssn, String location){
	super(fname,lName,phoneNum,email,ssn,location);
	MembershipType = mType;
}

}
