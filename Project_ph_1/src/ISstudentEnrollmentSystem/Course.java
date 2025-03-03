package ISstudentEnrollmentSystem;

public class Course {
	   private String courseName; // Name of the course
	    private String courseId;   // Unique ID of the course
	    private int courseHours;   // Credit hours for the course

	    // Constructor
	    public Course(String courseName, String courseId, int courseHours) {
	        this.courseName = courseName;
	        this.courseId = courseId;
	        this.courseHours = courseHours;
	    }

	    // Getters and Setters
	    public String getCourseName() {
	        return courseName;
	    }

	    public void setCourseName(String courseName) {
	        this.courseName = courseName;
	    }

	    public String getCourseId() {
	        return courseId;
	    }

	    public void setCourseId(String courseId) {
	        this.courseId = courseId;
	    }

	    public int getCourseHours() {
	        return courseHours;
	    }

	    public void setCourseHours(int courseHours) {
	        this.courseHours = courseHours;
	    }

	    // Display course details
	    public void displayCourseInfo() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Course ID: " + courseId);
	        System.out.println("Course Hours: " + courseHours);
	    }
	}

