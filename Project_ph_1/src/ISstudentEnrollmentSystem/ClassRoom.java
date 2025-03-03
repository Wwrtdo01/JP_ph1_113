package ISstudentEnrollmentSystem;

public class ClassRoom {
	  private int buildingNum;  // Building number where the classroom is located
	    private int floorNum;     // Floor number of the classroom
	    private int classRoomNum; // Unique classroom number

	    // Constructor
	    public ClassRoom(int buildingNum, int floorNum, int classRoomNum) {
	        this.buildingNum = buildingNum;
	        this.floorNum = floorNum;
	        this.classRoomNum = classRoomNum;
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
