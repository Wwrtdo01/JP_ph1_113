package ISstudentEnrollmentSystem;

public class ClassRoom {
	// aggregation 
	// 
	public Student students[]; // each classRoom can only fit for 32 students 
	public int numOfStudent;
	  private int buildingNum;  // Building number where the classroom is located
	    private int floorNum;     // Floor number of the classroom
	    private int classRoomNum; // Unique classroom number

	    // Constructor
	    public ClassRoom(int buildingNum, int floorNum, int classRoomNum) {
	        this.buildingNum = buildingNum;
	        this.floorNum = floorNum;
	        this.classRoomNum = classRoomNum;
	        students = new Student[32];
	        numOfStudent = 0;
	        
	    }
	    
	    public void addStudent(Student s) { // add s into first empty place at classRoom
	    	
	    	if(numOfStudent < students.length) {
	    		students[numOfStudent++] = s;
	    		
	    	}
	    	else
	    		System.out.println("there is no enough place find another classRoom !");
	    }
	    public void deleteStudent(Student s) { // delete student using university email student
	    	for(int i = 0; i<numOfStudent; i++) {
	    		if(students[i].uniEmail.equals(s.uniEmail)) {
	    			students[i] = null;
	    		}
	    		else
	    			System.out.println("not found!");
	    	}
	    }
	    public void selectStudent(Student s) { // selecting student using id student with showing fname,lname,gpa 
	    	for(int i = 0; i<numOfStudent; i++) {
	    		if(students[i].id_S == s.id_S) {
	    			System.out.println(students[i].fName+","+students[i].lName+"GPA: "+students[i].GPA);
	    		}
	    		else
	    			System.out.println("not found!");
	    	}
	    }

	    // Getters and Setters
	    public int getBuildingNum() {
	        return buildingNum;
	    }

	    public void setBuildingNum(int buildingNum) {
	        this.buildingNum = buildingNum;
	    }

	    public int getFloorNum() {
	        return floorNum;
	    }

	    public void setFloorNum(int floorNum) {
	        this.floorNum = floorNum;
	    }

	    public int getClassRoomNum() {
	        return classRoomNum;
	    }

	    public void setClassRoomNum(int classRoomNum) {
	        this.classRoomNum = classRoomNum;
	    }

	    // Display classroom details
	    public void displayClassRoomInfo() {
	        System.out.println("Building Number: " + buildingNum);
	        System.out.println("Floor Number: " + floorNum);
	        System.out.println("Classroom Number: " + classRoomNum);
	    }

}
