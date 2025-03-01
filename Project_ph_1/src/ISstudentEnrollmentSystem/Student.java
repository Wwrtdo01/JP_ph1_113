package ISstudentEnrollmentSystem;

public class Student extends Person {
protected Course courses[]; //Array of object & it's available courses at IS(information system) section [composition]
protected int numOfCourse; // recorded courses
protected ClassRoom cRoom[];  
protected int id_S;         // Student id
protected double GPA;     // the GPA of CFY : common first year
protected String uniEmail;   // university email of student
protected double SATdeg,SAATdeg;  //  SAT: قدرات. SAAT : تحصيلي.  


//constructors 

Student(String firstN,String lN, int phoneNum,String email, int ssn, String location ,int id, double gpa, String uniEmail, double sat, double saat){
	id_S = id; GPA = gpa; this.uniEmail = uniEmail; SATdeg = sat ; SAATdeg = saat;
}



	}

