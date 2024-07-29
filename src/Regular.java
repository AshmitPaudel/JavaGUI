public class Regular extends Student {

    // Private instance variables are created to store regular student data

    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    /**
     * Constructor method that initializes the regular student data. This method sets the enrollment ID, course name, date of enrollment,
     * number of modules, number of credit hours, days present, and scholarship status.
     */

    public Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment,
                   int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent) {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        setEnrollmentID(enrollmentID);
        setCourseName(courseName);
        setDateOfEnrollment(dateOfEnrollment);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }

    // Getter methods for private instance variables

    public int getNumOfModules() {
        return numOfModules;
    }

    public int getNumOfCreditHours() {
        return numOfCreditHours;
    }

    public double getDaysPresent() {
        return daysPresent;
    }

    public boolean isGrantedScholarship() {
        return isGrantedScholarship;
    }

    // Method to calculate and return present percentage based on days present

    public char presentPercentage(double daysPresent) {

        // Check if number of days present is greater than course duration

        if (daysPresent > getCourseDuration()) {
            System.out.println("Number of days present cannot be greater than course duration.");
            return ' ';
        }

        // Calculate present percentage and set scholarship status based on percentage

        double presentPercentage = (daysPresent / getCourseDuration()) * 100;

        if (presentPercentage >= 80) {
            isGrantedScholarship = true;
            return 'A';
        } else if (presentPercentage >= 60) {
            return 'B';
        } else if (presentPercentage >= 40) {
            return 'C';
        } else if (presentPercentage >= 20) {
            return 'D';
        } else {
            return 'E';
        }
    }

    // Method to display graduation certificate and scholarship status

    public void grantCertificate(String courseName, int enrollmentId, String dateOfEnrollment) {
        System.out.println("The student has graduated with course name: " + courseName + ", enrollment ID: " + enrollmentId + ", and date of enrollment: " + dateOfEnrollment);

        if (isGrantedScholarship) {
            System.out.println("The scholarship has been granted.");
        }
    }

    // Override superclass display method to include instance variables of Regular class

    @Override
    public void display() {
        super.display();

        System.out.println("Number of Modules: " + numOfModules);
        System.out.println("Number of Credit Hours: " + numOfCreditHours);
        System.out.println("Days Present: " + daysPresent);
    }
}