public class Student {

    // Private instance variables are used to store student data.

    protected int  enrollmentID;
    protected String dateOfBirth;
    protected String courseName;
    protected String studentName;
    protected String dateOfEnrollment;
    protected int courseDuration;
    protected int tuitionFee;

    // Constructor method initializes some student data, including date of birth, student name, course duration, and tuition fee. Other variables are set to default values.

    public Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee) {

        // Initializing  instance variables

        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;

        // Setting these variables to default values

        this.courseName = "";
        this.dateOfEnrollment = "";
        this.enrollmentID = 0;
    }

    // Getter methods for private instance variables

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    // Setter methods for private instance variables

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    /**
     * Display method prints out student data, including enrollment ID, date of birth, course name, student name,
     * date of enrollment, course duration, and tuition fee.
     * <p>
     * If not all parameters have been set, the method prints out a warning message.
     */

    public void display() {

        // Checking if all required parameters have been set

//        if (enrollmentID == 0 || courseName.equals("") || dateOfEnrollment.equals("")) {
//            System.out.println("Not all parameters have been set.");
//            return;
//        }
        // Printing out student data
        System.out.println("Enrollment ID: " + enrollmentID);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Course Name: " + courseName);
        System.out.println("Student Name: " + studentName);
        System.out.println("Date of Enrollment: " + dateOfEnrollment);
        System.out.println("Course Duration: " + courseDuration);
        System.out.println("Tuition Fee: " + tuitionFee);
    }
}