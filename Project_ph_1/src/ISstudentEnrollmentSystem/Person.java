package ISstudentEnrollmentSystem;

public class Person {
	protected String fName, lName;
    protected int phoneNum;
    protected String email;
    protected int ssn;
    protected String location;

    public Person(String fName , String lName , int phoneNum , String email , int ssn , String location) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.ssn = ssn;
        this.location = location;
    }

    public String toString() {
        return "Name: " + fName + " " + lName + ", Phone: " + phoneNum + ", email: " + email + ", SSN: " + ssn + ", Location: " + location;
    }

}
