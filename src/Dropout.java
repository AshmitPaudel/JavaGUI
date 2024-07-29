public class Dropout extends Student {

    // Instance variables are created 

    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;

    // Constructor

    public Dropout(String dateOfBirth, String studentName, int courseDuration, int tuitionFee,
                   int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout, int enrollmentId, String courseName, String dateOfEnrollment) {

        // Initialize the instance variables of the Dropout class

        super(dateOfBirth, studentName, courseDuration, tuitionFee);
//        super.setDateOfEnrollment(dateOfEnrollment);
        super.enrollmentID = enrollmentId;
        super.dateOfEnrollment = dateOfEnrollment;
        super.setDateOfEnrollment(dateOfEnrollment);
        super.setCourseName(courseName);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;

    }

// Getter methods for the instance variables

    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }

    public int getNumOfMonthsAttended() {
        return numOfMonthsAttended;
    }

    public String getDateOfDropout() {
        return dateOfDropout;
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

// Method to calculate the remaining amount of tuition fee and mark bills as paid

    public void billsPayable() {
        remainingAmount = (getCourseDuration() - numOfMonthsAttended) * getTuitionFee();
        hasPaid = true;
    }

// Method to remove a student from the course

    public void removeStudent() {

        // Check if the student has paid their bills

        if (!hasPaid) {
            System.out.println("All bills not cleared.");
            return;
        }

        // Reset the instance variables to remove the student from the course

        numOfRemainingModules = 0;
        numOfMonthsAttended = 0;
        dateOfDropout = "";
        remainingAmount = 0;
    }

    // Override the display method of the superclass (Student) to display the instance variables of the Dropout class

    @Override
    public void display() {
        super.display(); // Call the display method of the superclass (Student) to display the common instance variables

        // Display the instance variables of the Dropout class
        System.out.println("Number of Remaining Modules: " + numOfRemainingModules);
        System.out.println("Number of Months Attended: " + numOfMonthsAttended);
        System.out.println("Date of Dropout: " + dateOfDropout);
        System.out.println("Remaining Amount: " + remainingAmount);
    }
}