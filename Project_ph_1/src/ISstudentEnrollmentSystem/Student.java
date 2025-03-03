package ISstudentEnrollmentSystem;

public class Student extends Person {
	//course
protected Course courses[]; //Array of object & it's available courses at IS(information system) section [composition]
protected int numOfCourse; // recorded courses
protected int numOfRecordedhours;
protected ClassRoom cRoom[];  
protected int id_S;         // Student id
protected double GPA;     // the GPA of CFY : common first year
protected String uniEmail;   // university email of student
protected double SATdeg,SAATdeg;  //  SAT: قدرات. SAAT : تحصيلي.  
//classRoom aggregation


//constructors 
Student(String fn,String ln,String uniEmail, double gpa, double sat, double saat){
	fName = fn;  lName = ln; uniEmail = uniEmail; GPA = gpa; SATdeg = sat; SAATdeg = saat; 

}

Student(String fN,String lN,int phN,int id, double gpa, String uniEmail, int size){
	id_S = id; GPA = gpa; this.uniEmail = uniEmail; fName = fN; lName = lN; phoneNum = phN; 
	courses = new Course[size];
	numOfCourse = 0;
	numOfRecordedhours = 0;
}
//
Student(String firstN,String lN, int phoneNum,String email, int ssn, String location ,int id, double gpa, String uniEmail, double sat, double saat){
	super(firstN,lN,phoneNum,email,ssn,location);
	id_S = id; GPA = gpa; this.uniEmail = uniEmail; SATdeg = sat ; SAATdeg = saat;
}
// methods 

public void addCourse(Course c) { // add the course at first valid index
	if(numOfRecordedhours <=20 && numOfRecordedhours >=12) {
		for(int i = 0; i<20; i++)
		courses[i] = new Course(c);
		numOfRecordedhours += c.getCourseHours(); 
		numOfCourse++;
	}
	
	
}
public void deleteCourse(Course c) { // to delete the course by using courseId
	for(int i = 0; i<numOfCourse; i++) {
		if(courses[i].getCourseId().equals(c.getCourseId())) {
			courses[i] = null;
		}
	}
}

public String selectCourse(Course c) {  // to select the wanted course by using id_C to return full name of course
	for(int i = 0; i<numOfCourse; i++) {
		if(courses[i].getCourseId().equals(c.getCourseId())) {
			return courses[i].getCourseName();
		}
		
	}
	return "not found";
}


	}

