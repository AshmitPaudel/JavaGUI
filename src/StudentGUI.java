import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGUI extends JFrame implements ActionListener {

    // creating panel for regular and dropout
    JPanel RegularPanel, DropoutPanel;

    JSeparator horizontalLineRegular, horizontalLineRegularII, horizontalLineDropout, horizontalLineDropoutII;

    // labels for dropout
    JLabel TopDropout, StudentManagementSystemDropout, StudentNameLabel, EnrollmentIDLabel, CourseNameLabel, CourseDurationLabel, TuitionFeeLabel, NumberOfRemainingModulesLabel, NumberOfMonthsAttendedLabel, dateOfBirthComboBoxDropoutLabel, dateOfEnrollmentComboBoxDropoutLabel, dateOfDropoutComboBoxDropoutLabel;

    // labels for regular
    JLabel TopRegular, StudentManagementSystemRegular, StudentNameLabelRegular, EnrollmentIDLabelRegular, CourseNameLabelRegular, CourseDurationLabelRegular, TuitionFeeLabelRegular, NumberOfModulesLabelRegular, NumberOfCreditHoursLabelRegular, NumberOfDaysPresentLabelRegular, dateOfBirthComboBoxLabel, dateOfEnrollmentComboBoxLabel;

    //text field for regular
    private JTextField StudentNameTextFieldRegular, EnrollmentIDTextFieldRegular, CourseNameTextFieldRegular, CourseDurationTextFieldRegular, TuitionFeeTextFieldRegular, NumberOfModulesTextFieldRegular, NumberOfCreditHoursTextFieldRegular, NumberOfDaysPresentTextFieldRegular;

    // text fields for dropout
    private JTextField StudentNameTextField, EnrollmentIDTextField, CourseNameTextField, CourseDurationTextField, TuitionFeeTextField, NumberOfRemainingModulesTextField, NumberOfMonthsAttendedTextField;

    // combo box for regular
    JComboBox<String> dateOfBirthComboBoxRegular1, dateOfBirthComboBoxRegular2, dateOfBirthComboBoxRegular3, dateOfEnrollmentComboBoxRegular1, dateOfEnrollmentComboBoxRegular2, dateOfEnrollmentComboBoxRegular3;

    // combo box for dropout
    JComboBox<String> dateOfBirthComboBoxDropout1, dateOfBirthComboBoxDropout2, dateOfBirthComboBoxDropout3, dateOfEnrollmentComboBoxDropout1, dateOfEnrollmentComboBoxDropout2, dateOfEnrollmentComboBoxDropout3, dateOfDropoutComboBoxDropout1, dateOfDropoutComboBoxDropout2, dateOfDropoutComboBoxDropout3;

    // button for switching
    JButton SwitchToRegular, SwitchToDropout;

    // buttons for regular
    JButton AddRegularStudent, PresentPercentage, GrantCertificate, Display, Clear;

    // buttons for dropout
    JButton AddDropoutStudentDropout, PayTheBillsDropout, RemoveDropoutStudentDropout, DisplayDropout, ClearDropout;

    // Array List
    ArrayList<Student> StudentArray = new ArrayList<Student>();

    /**
     * Clears the input fields for regular students.
     */
    private void clearRegular() {
        // Your code to clear input fields for regular students
        StudentNameTextFieldRegular.setText("");
        EnrollmentIDTextFieldRegular.setText("");
        CourseNameTextFieldRegular.setText("");
        CourseDurationTextFieldRegular.setText("");
        TuitionFeeTextFieldRegular.setText("");
        NumberOfModulesTextFieldRegular.setText("");
        NumberOfCreditHoursTextFieldRegular.setText("");
        NumberOfDaysPresentTextFieldRegular.setText("");
    }

    /**
     * Clears the input fields for dropout students.
     */
    private void clearDropout() {
        // Your code to clear input fields for dropout students
        StudentNameTextField.setText("");
        EnrollmentIDTextField.setText("");
        CourseNameTextField.setText("");
        CourseDurationTextField.setText("");
        TuitionFeeTextField.setText("");
        NumberOfRemainingModulesTextField.setText("");
        NumberOfMonthsAttendedTextField.setText("");
    }

    /**
     * Checks if all components for a regular student are filled.
     *
     * @return True if all regular student fields are filled, false otherwise.
     */
    private boolean areRegularStudentFieldsFilled() {
        return !StudentNameTextFieldRegular.getText().isEmpty() &&
                !EnrollmentIDTextFieldRegular.getText().isEmpty() &&
                !CourseNameTextFieldRegular.getText().isEmpty() &&
                !CourseDurationTextFieldRegular.getText().isEmpty() &&
                !TuitionFeeTextFieldRegular.getText().isEmpty() &&
                !NumberOfModulesTextFieldRegular.getText().isEmpty() &&
                !NumberOfCreditHoursTextFieldRegular.getText().isEmpty() &&
                !NumberOfDaysPresentTextFieldRegular.getText().isEmpty();
    }

    /**
     * Checks if all components for a dropout student are filled.
     *
     * @return True if all dropout student fields are filled, false otherwise.
     */
    private boolean areDropoutStudentFieldsFilled() {
        return !StudentNameTextField.getText().isEmpty() &&
                !EnrollmentIDTextField.getText().isEmpty() &&
                !CourseNameTextField.getText().isEmpty() &&
                !CourseDurationTextField.getText().isEmpty() &&
                !TuitionFeeTextField.getText().isEmpty() &&
                !NumberOfRemainingModulesTextField.getText().isEmpty() &&
                !NumberOfMonthsAttendedTextField.getText().isEmpty();
    }

    /**
     * Displays information for regular students.
     */
    private void DisplayRegular() {
        for (Student student : StudentArray) {
            if (student instanceof Regular) {
                // Call the display method specific to Regular class to show student information
                student.display();

            }
        }
    }

    /**
     * Displays information for dropout students.
     */
    private void DisplayDropout() {
        for (Student student : StudentArray) {
            if (student instanceof Dropout) {
                // Cast the student object to Dropout type to access dropout-specific methods
                Dropout dropoutStudent = (Dropout) student;
                // Call the display method specific to Dropout class to show student information
                dropoutStudent.display();
            }
        }
    }

    public StudentGUI() {

        // object for regular and dropout

        RegularPanel = new JPanel();
        DropoutPanel = new JPanel();

        RegularPanel.setLayout(null);
        DropoutPanel.setLayout(null);

        RegularPanel.setVisible(true);
        DropoutPanel.setVisible(true);

        Color ColorI = new Color(30, 79, 137);
        Color ColorII = new Color(30, 79, 137);
        RegularPanel.setBackground(ColorI);
        DropoutPanel.setBackground(ColorII);

        // labels for dropout
        TopDropout = new JLabel("Dropout");
        StudentManagementSystemDropout = new JLabel("Student Management System");
        StudentNameLabel = new JLabel("Stud. Name");
        EnrollmentIDLabel = new JLabel("Enroll. ID");
        CourseNameLabel = new JLabel("Course Name");
        CourseDurationLabel = new JLabel("Course Dur.");
        TuitionFeeLabel = new JLabel("Tuition Fee");
        NumberOfRemainingModulesLabel = new JLabel("Rem. Modules");
        NumberOfMonthsAttendedLabel = new JLabel("Mo. Attended");

        // labels for regular
        TopRegular = new JLabel("Regular");
        StudentManagementSystemRegular = new JLabel("Student Management System");
        StudentNameLabelRegular = new JLabel("Stud. Name");
        EnrollmentIDLabelRegular = new JLabel("Enroll. ID");
        CourseNameLabelRegular = new JLabel("Course Name");
        CourseDurationLabelRegular = new JLabel("Course Dur.");
        TuitionFeeLabelRegular = new JLabel("Tuition Fee");
        NumberOfModulesLabelRegular = new JLabel("Modules");
        NumberOfCreditHoursLabelRegular = new JLabel("Credit Hrs.");
        NumberOfDaysPresentLabelRegular = new JLabel("Days Present");

        // labels for combo-box dropout

        dateOfBirthComboBoxDropoutLabel = new JLabel("Date Of Birth");
        dateOfEnrollmentComboBoxDropoutLabel = new JLabel("Enroll. Date");
        dateOfDropoutComboBoxDropoutLabel = new JLabel("Dropout Date");

        // labels for combo-box regular

        dateOfBirthComboBoxLabel = new JLabel("Date Of Birth");
        dateOfEnrollmentComboBoxLabel = new JLabel("Enroll. Date");

        // text fields for dropout

        StudentNameTextField = new JTextField();
        EnrollmentIDTextField = new JTextField();
        CourseNameTextField = new JTextField();
        CourseDurationTextField = new JTextField();
        TuitionFeeTextField = new JTextField();
        NumberOfRemainingModulesTextField = new JTextField();
        NumberOfMonthsAttendedTextField = new JTextField();

        //text field for regular

        StudentNameTextFieldRegular = new JTextField();
        EnrollmentIDTextFieldRegular = new JTextField();
        CourseNameTextFieldRegular = new JTextField();
        CourseDurationTextFieldRegular = new JTextField();
        TuitionFeeTextFieldRegular = new JTextField();
        NumberOfModulesTextFieldRegular = new JTextField();
        NumberOfCreditHoursTextFieldRegular = new JTextField();
        NumberOfDaysPresentTextFieldRegular = new JTextField();

        // arrays
        String[] dayArray = {"1", "2", "3", "4", "5", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

        String[] monthArray = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};

        String[] yearArray = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
                "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
                "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020", "2021", "2022", "2023"};

        // combo box for dropout

        dateOfBirthComboBoxDropout1 = new JComboBox<>(dayArray);
        dateOfBirthComboBoxDropout2 = new JComboBox<>(monthArray);
        dateOfBirthComboBoxDropout3 = new JComboBox<>(yearArray);
        dateOfEnrollmentComboBoxDropout1 = new JComboBox<>(dayArray);
        dateOfEnrollmentComboBoxDropout2 = new JComboBox<>(monthArray);
        dateOfEnrollmentComboBoxDropout3 = new JComboBox<>(yearArray);
        dateOfDropoutComboBoxDropout1 = new JComboBox<>(dayArray);
        dateOfDropoutComboBoxDropout2 = new JComboBox<>(monthArray);
        dateOfDropoutComboBoxDropout3 = new JComboBox<>(yearArray);

        // combo box for regular

        dateOfBirthComboBoxRegular1 = new JComboBox<>(dayArray);
        dateOfBirthComboBoxRegular2 = new JComboBox<>(monthArray);
        dateOfBirthComboBoxRegular3 = new JComboBox<>(yearArray);

        dateOfEnrollmentComboBoxRegular1 = new JComboBox<>(dayArray);
        dateOfEnrollmentComboBoxRegular2 = new JComboBox<>(monthArray);
        dateOfEnrollmentComboBoxRegular3 = new JComboBox<>(yearArray);

        // buttons for regular

        // switch button

        SwitchToDropout = new JButton("Go to Dropout");
        SwitchToDropout.addActionListener(this);

        AddRegularStudent = new JButton("Add Regular");
        AddRegularStudent.addActionListener(this);

        PresentPercentage = new JButton("Present %");
        PresentPercentage.addActionListener(this);

        GrantCertificate = new JButton("Grant Cert.");
        GrantCertificate.addActionListener(this);

        Display = new JButton("Display");
        Display.addActionListener(this);

        Clear = new JButton("Clear");
        Clear.addActionListener(this);

        // buttons for dropout

        // switch button

        SwitchToRegular = new JButton("Go to Regular");
        SwitchToRegular.addActionListener(this);

        AddDropoutStudentDropout = new JButton("Add Dropout");
        AddDropoutStudentDropout.addActionListener(this);

        PayTheBillsDropout = new JButton("Pay bills");
        PayTheBillsDropout.addActionListener(this);

        RemoveDropoutStudentDropout = new JButton("Remove");
        RemoveDropoutStudentDropout.addActionListener(this);

        DisplayDropout = new JButton("Display");
        DisplayDropout.addActionListener(this);

        ClearDropout = new JButton("Clear");
        ClearDropout.addActionListener(this);

        // adding panels to the frame

        this.add(RegularPanel);
        this.add(DropoutPanel);

        // adding components to dropout panel

        // adding labels for dropout
        DropoutPanel.add(TopDropout);
        DropoutPanel.add(StudentManagementSystemDropout);
        DropoutPanel.add(StudentNameLabel);
        DropoutPanel.add(EnrollmentIDLabel);
        DropoutPanel.add(CourseNameLabel);
        DropoutPanel.add(CourseDurationLabel);
        DropoutPanel.add(TuitionFeeLabel);
        DropoutPanel.add(NumberOfRemainingModulesLabel);
        DropoutPanel.add(NumberOfMonthsAttendedLabel);

        // adding labels for combo-box dropout
        DropoutPanel.add(dateOfBirthComboBoxDropoutLabel);
        DropoutPanel.add(dateOfEnrollmentComboBoxDropoutLabel);
        DropoutPanel.add(dateOfDropoutComboBoxDropoutLabel);

        // adding text fields for dropout
        DropoutPanel.add(StudentNameTextField);
        DropoutPanel.add(EnrollmentIDTextField);
        DropoutPanel.add(CourseNameTextField);
        DropoutPanel.add(CourseDurationTextField);
        DropoutPanel.add(TuitionFeeTextField);
        DropoutPanel.add(NumberOfRemainingModulesTextField);
        DropoutPanel.add(NumberOfMonthsAttendedTextField);

        // adding combo box for dropout
        DropoutPanel.add(dateOfBirthComboBoxDropout1);
        DropoutPanel.add(dateOfBirthComboBoxDropout2);
        DropoutPanel.add(dateOfBirthComboBoxDropout3);

        DropoutPanel.add(dateOfEnrollmentComboBoxDropout1);
        DropoutPanel.add(dateOfEnrollmentComboBoxDropout2);
        DropoutPanel.add(dateOfEnrollmentComboBoxDropout3);

        DropoutPanel.add(dateOfDropoutComboBoxDropout1);
        DropoutPanel.add(dateOfDropoutComboBoxDropout2);
        DropoutPanel.add(dateOfDropoutComboBoxDropout3);

        // adding buttons for dropout
        DropoutPanel.add(AddDropoutStudentDropout);
        DropoutPanel.add(PayTheBillsDropout);
        DropoutPanel.add(RemoveDropoutStudentDropout);
        DropoutPanel.add(DisplayDropout);
        DropoutPanel.add(ClearDropout);

        // adding switch button
        DropoutPanel.add(SwitchToRegular);

        // adding components to regular panel

        // adding labels for regular
        RegularPanel.add(TopRegular);
        RegularPanel.add(StudentManagementSystemRegular);
        RegularPanel.add(StudentNameLabelRegular);
        RegularPanel.add(EnrollmentIDLabelRegular);
        RegularPanel.add(CourseNameLabelRegular);
        RegularPanel.add(CourseDurationLabelRegular);
        RegularPanel.add(TuitionFeeLabelRegular);
        RegularPanel.add(NumberOfModulesLabelRegular);
        RegularPanel.add(NumberOfCreditHoursLabelRegular);
        RegularPanel.add(NumberOfDaysPresentLabelRegular);

        // adding labels for combo box regular
        RegularPanel.add(dateOfBirthComboBoxLabel);
        RegularPanel.add(dateOfEnrollmentComboBoxLabel);

        // adding text field for regular
        RegularPanel.add(StudentNameTextFieldRegular);
        RegularPanel.add(EnrollmentIDTextFieldRegular);
        RegularPanel.add(CourseNameTextFieldRegular);
        RegularPanel.add(CourseDurationTextFieldRegular);
        RegularPanel.add(TuitionFeeTextFieldRegular);
        RegularPanel.add(NumberOfModulesTextFieldRegular);
        RegularPanel.add(NumberOfCreditHoursTextFieldRegular);
        RegularPanel.add(NumberOfDaysPresentTextFieldRegular);

        // adding combo box for regular
        RegularPanel.add(dateOfBirthComboBoxRegular1);
        RegularPanel.add(dateOfBirthComboBoxRegular2);
        RegularPanel.add(dateOfBirthComboBoxRegular3);

        RegularPanel.add(dateOfEnrollmentComboBoxRegular1);
        RegularPanel.add(dateOfEnrollmentComboBoxRegular2);
        RegularPanel.add(dateOfEnrollmentComboBoxRegular3);

        // adding buttons for regular
        RegularPanel.add(AddRegularStudent);
        RegularPanel.add(PresentPercentage);
        RegularPanel.add(GrantCertificate);
        RegularPanel.add(Display);
        RegularPanel.add(Clear);

        // adding switch button
        RegularPanel.add(SwitchToDropout);

        // Setting the size of the frame
        int frameWidth = 1000;
        int frameHeight = 600;
        this.setSize(frameWidth, frameHeight);

        this.setVisible(true);
        this.setResizable(false);
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the bounds for panels to cover the entire frame
        RegularPanel.setBounds(0, 0, frameWidth, frameHeight);
        DropoutPanel.setBounds(0, 0, frameWidth, frameHeight);

        SwitchToRegular.setBounds(800, 50, 150, 40);
        SwitchToRegular.setBackground(new Color(255, 255, 255));
        SwitchToRegular.setFont(new Font("Montserrat", Font.BOLD, 16));
        SwitchToRegular.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        SwitchToRegular.setFocusPainted(false);
        SwitchToRegular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        SwitchToDropout.setBounds(800, 50, 150, 40);
        SwitchToDropout.setBackground(new Color(255, 255, 255));
        SwitchToDropout.setFont(new Font("Montserrat", Font.BOLD, 16));
        SwitchToDropout.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        SwitchToDropout.setFocusPainted(false);
        SwitchToDropout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        StudentManagementSystemRegular.setBounds(280, 20, 500, 100);
        StudentManagementSystemRegular.setFont(new Font("Montserrat", Font.BOLD, 30));
        StudentManagementSystemRegular.setForeground(new Color(0, 0, 0));

        StudentManagementSystemDropout.setBounds(280, 20, 500, 100);
        StudentManagementSystemDropout.setFont(new Font("Montserrat", Font.BOLD, 30));
        StudentManagementSystemDropout.setForeground(new Color(0, 0, 0));

        TopRegular.setBounds(120, 90, 100, 30);
        TopRegular.setFont(new Font("Montserrat", Font.BOLD, 22));
        TopRegular.setForeground(new Color(0, 0, 0));

        TopDropout.setBounds(120, 90, 100, 30);
        TopDropout.setFont(new Font("Montserrat", Font.BOLD, 22));
        TopDropout.setForeground(new Color(0, 0, 0));

        horizontalLineRegular = new JSeparator(SwingConstants.HORIZONTAL);
        horizontalLineRegular.setBounds(0, 130, 1000, 10);

        horizontalLineRegularII = new JSeparator(SwingConstants.HORIZONTAL);
        horizontalLineRegularII.setBounds(0, 550, 1000, 10);

        horizontalLineDropout = new JSeparator(SwingConstants.HORIZONTAL);
        horizontalLineDropout.setBounds(0, 130, 1000, 10);

        horizontalLineDropoutII = new JSeparator(SwingConstants.HORIZONTAL);
        horizontalLineDropoutII.setBounds(0, 550, 1000, 10);


        RegularPanel.add(horizontalLineRegular);
        RegularPanel.add(horizontalLineRegularII);
        DropoutPanel.add(horizontalLineDropout);
        DropoutPanel.add(horizontalLineDropoutII);

        // regular GUI

        // labels for regular
        StudentNameLabelRegular.setBounds(120, 160, 109, 20);
        StudentNameLabelRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        StudentNameLabelRegular.setForeground(new Color(0, 0, 0));

        EnrollmentIDLabelRegular.setBounds(120, 280, 89, 20);
        EnrollmentIDLabelRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        EnrollmentIDLabelRegular.setForeground(new Color(0, 0, 0));

        CourseNameLabelRegular.setBounds(120, 220, 128, 20);
        CourseNameLabelRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        CourseNameLabelRegular.setForeground(new Color(0, 0, 0));

        CourseDurationLabelRegular.setBounds(120, 340, 114, 20);
        CourseDurationLabelRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        CourseDurationLabelRegular.setForeground(new Color(0, 0, 0));

        TuitionFeeLabelRegular.setBounds(120, 400, 106, 20);
        TuitionFeeLabelRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        TuitionFeeLabelRegular.setForeground(new Color(0, 0, 0));

        NumberOfModulesLabelRegular.setBounds(500, 160, 81, 20);
        NumberOfModulesLabelRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfModulesLabelRegular.setForeground(new Color(0, 0, 0));

        NumberOfCreditHoursLabelRegular.setBounds(500, 220, 102, 20);
        NumberOfCreditHoursLabelRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfCreditHoursLabelRegular.setForeground(new Color(0, 0, 0));

        NumberOfDaysPresentLabelRegular.setBounds(500, 280, 126, 20);
        NumberOfDaysPresentLabelRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfDaysPresentLabelRegular.setForeground(new Color(0, 0, 0));

        // combo box label regular
        dateOfBirthComboBoxLabel.setBounds(500, 340, 122, 20);
        dateOfBirthComboBoxLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        dateOfBirthComboBoxLabel.setForeground(new Color(0, 0, 0));

        dateOfEnrollmentComboBoxLabel.setBounds(500, 400, 152, 20);
        dateOfEnrollmentComboBoxLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        dateOfEnrollmentComboBoxLabel.setForeground(new Color(0, 0, 0));

        //text field for regular
        StudentNameTextFieldRegular.setBounds(300, 155, 160, 30);
        StudentNameTextFieldRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        StudentNameTextFieldRegular.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        EnrollmentIDTextFieldRegular.setBounds(300, 275, 160, 30);
        EnrollmentIDTextFieldRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        EnrollmentIDTextFieldRegular.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));


        CourseNameTextFieldRegular.setBounds(300, 215, 160, 30);
        CourseNameTextFieldRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        CourseNameTextFieldRegular.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));


        CourseDurationTextFieldRegular.setBounds(300, 335, 160, 30);
        CourseDurationTextFieldRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        CourseDurationTextFieldRegular.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));


        TuitionFeeTextFieldRegular.setBounds(300, 395, 160, 30);
        TuitionFeeTextFieldRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        TuitionFeeTextFieldRegular.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));


        NumberOfModulesTextFieldRegular.setBounds(660, 155, 160, 30);
        NumberOfModulesTextFieldRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfModulesTextFieldRegular.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));


        NumberOfCreditHoursTextFieldRegular.setBounds(660, 215, 160, 30);
        NumberOfCreditHoursTextFieldRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfCreditHoursTextFieldRegular.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));


        NumberOfDaysPresentTextFieldRegular.setBounds(660, 275, 160, 30);
        NumberOfDaysPresentTextFieldRegular.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfDaysPresentTextFieldRegular.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));


        // combo box for regular
        dateOfBirthComboBoxRegular1.setBounds(660, 335, 40, 30);
        dateOfBirthComboBoxRegular1.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfBirthComboBoxRegular2.setBounds(700, 335, 60, 30);
        dateOfBirthComboBoxRegular2.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfBirthComboBoxRegular3.setBounds(760, 335, 60, 30);
        dateOfBirthComboBoxRegular3.setFont(new Font("Montserrat", Font.BOLD, 16));


        dateOfEnrollmentComboBoxRegular1.setBounds(660, 395, 40, 30);
        dateOfEnrollmentComboBoxRegular1.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfEnrollmentComboBoxRegular2.setBounds(700, 395, 60, 30);
        dateOfEnrollmentComboBoxRegular2.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfEnrollmentComboBoxRegular3.setBounds(760, 395, 60, 30);
        dateOfEnrollmentComboBoxRegular3.setFont(new Font("Montserrat", Font.BOLD, 16));

        // buttons for regular
        AddRegularStudent.setBounds(120, 480, 140, 40);
        AddRegularStudent.setFont(new Font("Montserrat", Font.BOLD, 20));
        AddRegularStudent.setBackground(new Color(225, 225, 225));
        AddRegularStudent.setForeground(new Color(0, 0, 0));
        AddRegularStudent.setFocusPainted(false);
        AddRegularStudent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AddRegularStudent.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        PresentPercentage.setBounds(260, 480, 140, 40);
        PresentPercentage.setFont(new Font("Montserrat", Font.BOLD, 20));
        PresentPercentage.setBackground(new Color(225, 225, 225));
        PresentPercentage.setForeground(new Color(0, 0, 0));
        PresentPercentage.setFocusPainted(false);
        PresentPercentage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        PresentPercentage.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        GrantCertificate.setBounds(400, 480, 140, 40);
        GrantCertificate.setFont(new Font("Montserrat", Font.BOLD, 20));
        GrantCertificate.setBackground(new Color(225, 225, 225));
        GrantCertificate.setForeground(new Color(0, 0, 0));
        GrantCertificate.setFocusPainted(false);
        GrantCertificate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        GrantCertificate.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        Display.setBounds(540, 480, 140, 40);
        Display.setFont(new Font("Montserrat", Font.BOLD, 20));
        Display.setBackground(new Color(225, 225, 225));
        Display.setForeground(new Color(0, 0, 0));
        Display.setFocusPainted(false);
        Display.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Display.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));


        Clear.setBounds(680, 480, 140, 40);
        Clear.setFont(new Font("Montserrat", Font.BOLD, 20));
        Clear.setBackground(new Color(225, 225, 225));
        Clear.setForeground(new Color(0, 0, 0));
        Clear.setFocusPainted(false);
        Clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Clear.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        // dropout GUI

        // labels
        StudentNameLabel.setBounds(120, 160, 109, 20);
        StudentNameLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        StudentNameLabel.setForeground(new Color(0, 0, 0));

        EnrollmentIDLabel.setBounds(120, 280, 89, 20);
        EnrollmentIDLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        EnrollmentIDLabel.setForeground(new Color(0, 0, 0));

        CourseNameLabel.setBounds(120, 220, 128, 20);
        CourseNameLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        CourseNameLabel.setForeground(new Color(0, 0, 0));

        CourseDurationLabel.setBounds(120, 340, 114, 20);
        CourseDurationLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        CourseDurationLabel.setForeground(new Color(0, 0, 0));

        TuitionFeeLabel.setBounds(120, 400, 106, 20);
        TuitionFeeLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        TuitionFeeLabel.setForeground(new Color(0, 0, 0));

        NumberOfRemainingModulesLabel.setBounds(500, 160, 134, 20);
        NumberOfRemainingModulesLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfRemainingModulesLabel.setForeground(new Color(0, 0, 0));

        NumberOfMonthsAttendedLabel.setBounds(500, 220, 125, 20);
        NumberOfMonthsAttendedLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfMonthsAttendedLabel.setForeground(new Color(0, 0, 0));

        // labels for combo-box dropout
        dateOfBirthComboBoxDropoutLabel.setBounds(500, 280, 126, 20);
        dateOfBirthComboBoxDropoutLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        dateOfBirthComboBoxDropoutLabel.setForeground(new Color(0, 0, 0));

        dateOfEnrollmentComboBoxDropoutLabel.setBounds(500, 340, 122, 20);
        dateOfEnrollmentComboBoxDropoutLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        dateOfEnrollmentComboBoxDropoutLabel.setForeground(new Color(0, 0, 0));

        dateOfDropoutComboBoxDropoutLabel.setBounds(500, 400, 152, 20);
        dateOfDropoutComboBoxDropoutLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
        dateOfDropoutComboBoxDropoutLabel.setForeground(new Color(0, 0, 0));

        StudentNameTextField.setBounds(300, 155, 160, 30);
        StudentNameTextField.setFont(new Font("Montserrat", Font.BOLD, 20));
        StudentNameTextField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        EnrollmentIDTextField.setBounds(300, 275, 160, 30);
        EnrollmentIDTextField.setFont(new Font("Montserrat", Font.BOLD, 20));
        EnrollmentIDTextField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        CourseNameTextField.setBounds(300, 215, 160, 30);
        CourseNameTextField.setFont(new Font("Montserrat", Font.BOLD, 20));
        CourseNameTextField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        CourseDurationTextField.setBounds(300, 335, 160, 30);
        CourseDurationTextField.setFont(new Font("Montserrat", Font.BOLD, 20));
        CourseDurationTextField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        TuitionFeeTextField.setBounds(300, 395, 160, 30);
        TuitionFeeTextField.setFont(new Font("Montserrat", Font.BOLD, 20));
        TuitionFeeTextField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        NumberOfRemainingModulesTextField.setBounds(660, 155, 160, 30);
        NumberOfRemainingModulesTextField.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfRemainingModulesTextField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        NumberOfMonthsAttendedTextField.setBounds(660, 215, 160, 30);
        NumberOfMonthsAttendedTextField.setFont(new Font("Montserrat", Font.BOLD, 20));
        NumberOfMonthsAttendedTextField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        // combo box for dropout
        dateOfBirthComboBoxDropout1.setBounds(660, 275, 40, 30);
        dateOfBirthComboBoxDropout1.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfBirthComboBoxDropout2.setBounds(700, 275, 60, 30);
        dateOfBirthComboBoxDropout2.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfBirthComboBoxDropout3.setBounds(760, 275, 60, 30);
        dateOfBirthComboBoxDropout3.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfEnrollmentComboBoxDropout1.setBounds(660, 335, 40, 30);
        dateOfEnrollmentComboBoxDropout1.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfEnrollmentComboBoxDropout2.setBounds(700, 335, 60, 30);
        dateOfEnrollmentComboBoxDropout2.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfEnrollmentComboBoxDropout3.setBounds(760, 335, 60, 30);
        dateOfEnrollmentComboBoxDropout3.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfDropoutComboBoxDropout1.setBounds(660, 395, 40, 30);
        dateOfDropoutComboBoxDropout1.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfDropoutComboBoxDropout2.setBounds(700, 395, 60, 30);
        dateOfDropoutComboBoxDropout2.setFont(new Font("Montserrat", Font.BOLD, 16));

        dateOfDropoutComboBoxDropout3.setBounds(760, 395, 60, 30);
        dateOfDropoutComboBoxDropout3.setFont(new Font("Montserrat", Font.BOLD, 16));

        // buttons for dropout
        AddDropoutStudentDropout.setBounds(120, 480, 140, 40);
        AddDropoutStudentDropout.setFont(new Font("Montserrat", Font.BOLD, 19));
        AddDropoutStudentDropout.setBackground(new Color(225, 225, 225));
        AddDropoutStudentDropout.setForeground(new Color(0, 0, 0));
        AddDropoutStudentDropout.setFocusPainted(false);
        AddDropoutStudentDropout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AddDropoutStudentDropout.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        PayTheBillsDropout.setBounds(260, 480, 140, 40);
        PayTheBillsDropout.setFont(new Font("Montserrat", Font.BOLD, 20));
        PayTheBillsDropout.setBackground(new Color(225, 225, 225));
        PayTheBillsDropout.setForeground(new Color(0, 0, 0));
        PayTheBillsDropout.setFocusPainted(false);
        PayTheBillsDropout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        PayTheBillsDropout.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        RemoveDropoutStudentDropout.setBounds(400, 480, 140, 40);
        RemoveDropoutStudentDropout.setFont(new Font("Montserrat", Font.BOLD, 20));
        RemoveDropoutStudentDropout.setBackground(new Color(225, 225, 225));
        RemoveDropoutStudentDropout.setForeground(new Color(0, 0, 0));
        RemoveDropoutStudentDropout.setFocusPainted(false);
        RemoveDropoutStudentDropout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        RemoveDropoutStudentDropout.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        DisplayDropout.setBounds(540, 480, 140, 40);
        DisplayDropout.setFont(new Font("Montserrat", Font.BOLD, 20));
        DisplayDropout.setBackground(new Color(225, 225, 225));
        DisplayDropout.setForeground(new Color(0, 0, 0));
        DisplayDropout.setFocusPainted(false);
        DisplayDropout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        DisplayDropout.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        ClearDropout.setBounds(680, 480, 140, 40);
        ClearDropout.setFont(new Font("Montserrat", Font.BOLD, 20));
        ClearDropout.setBackground(new Color(225, 225, 225));
        ClearDropout.setForeground(new Color(0, 0, 0));
        ClearDropout.setFocusPainted(false);
        ClearDropout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ClearDropout.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    }

    // action listener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SwitchToRegular) {
            DropoutPanel.setVisible(false);
            RegularPanel.setVisible(true);
        } else if (e.getSource() == SwitchToDropout) {
            RegularPanel.setVisible(false);
            DropoutPanel.setVisible(true);
        }
        if (e.getSource() == AddRegularStudent) {

            if (areRegularStudentFieldsFilled()) {
                String studentName = StudentNameTextFieldRegular.getText();

                if (!studentName.matches("^[a-zA-Z]+$")) {
                    JOptionPane.showMessageDialog(null, "Invalid student name. Please enter a valid name.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String courseName = CourseNameTextFieldRegular.getText();

                if (!courseName.matches("^[a-zA-Z]+$")) {
                    JOptionPane.showMessageDialog(null, "Invalid course name. Please enter a valid name.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    int enrollmentID = Integer.parseInt(EnrollmentIDTextFieldRegular.getText());
                    int courseDuration = Integer.parseInt(CourseDurationTextFieldRegular.getText());
                    int tuitionFee = Integer.parseInt(TuitionFeeTextFieldRegular.getText());
                    int numberOfModules = Integer.parseInt(NumberOfModulesTextFieldRegular.getText());
                    int numOfCreditHours = Integer.parseInt(NumberOfCreditHoursTextFieldRegular.getText());
                    int numOfDaysPresent = Integer.parseInt(NumberOfDaysPresentTextFieldRegular.getText());

                    if (enrollmentID <= 0 || courseDuration <= 0 || tuitionFee <= 0 || numberOfModules <= 0 || numOfCreditHours <= 0 || numOfDaysPresent <= 0) {
                        JOptionPane.showMessageDialog(null, "Invalid numeric input. Please enter valid values.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else {
                        if (numOfDaysPresent > courseDuration) {
                            JOptionPane.showMessageDialog(null, "days present is greater than course duration.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            String dateOfEnrollment = dateOfBirthComboBoxRegular1.getSelectedItem() + "-" + dateOfBirthComboBoxRegular2.getSelectedItem() + "-" + dateOfBirthComboBoxRegular3.getSelectedItem();
                            String dateOfBirth = dateOfEnrollmentComboBoxRegular1.getSelectedItem() + "-" + dateOfEnrollmentComboBoxRegular2.getSelectedItem() + "-" + dateOfEnrollmentComboBoxRegular3.getSelectedItem();

                            Regular regularStudent = new Regular(enrollmentID, dateOfBirth, courseName, studentName, dateOfEnrollment,
                                    courseDuration, tuitionFee, numberOfModules, numOfCreditHours, numOfDaysPresent);

                            StudentArray.add(regularStudent);

                            JOptionPane.showMessageDialog(this, "Regular student added successfully!");
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid values.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the fields for regular student.");
            }

        } else if (e.getSource() == PresentPercentage) {
            if (areRegularStudentFieldsFilled()) {
                try {
                    // Parse the enrollment ID and days present from input fields
                    int enrollmentID = Integer.parseInt(EnrollmentIDTextFieldRegular.getText());
                    double daysPresent = Double.parseDouble(NumberOfDaysPresentTextFieldRegular.getText());

                    boolean studentFound = false;

                    // Iterate through StudentArray to find the Regular student
                    for (Student studentObject : StudentArray) {
                        if (studentObject instanceof Regular) {
                            Regular regularObject = (Regular) studentObject;
                            if (regularObject.getEnrollmentID() == enrollmentID) {

                                // Check if daysPresent is longer than course duration
                                if (daysPresent > regularObject.getCourseDuration()) {
                                    JOptionPane.showMessageDialog(this, "Days present cannot be longer than course duration.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                                    return;  // Exit the method if invalid input
                                }
                                char presentGrade = regularObject.presentPercentage(daysPresent);

                                String scholarshipMessage;
                                if (presentGrade == 'A') {
                                    scholarshipMessage = "Congrats, Scholarship has been granted! Grade: A";
                                } else {
                                    scholarshipMessage = "Graduated! Grade: " + presentGrade;
                                }

                                JOptionPane.showMessageDialog(this, "Present percentage calculated! " + scholarshipMessage, "Present Percentage", JOptionPane.INFORMATION_MESSAGE);

                                studentFound = true;
                                break;
                            }
                        }
                    }

                    if (!studentFound) {
                        JOptionPane.showMessageDialog(this, "Regular student with Enrollment ID " + enrollmentID + " not found.", "Student Not Found", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException exe) {
                    JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid values.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the fields for regular student.", "Incomplete Fields", JOptionPane.ERROR_MESSAGE);
            }

        } else if (e.getSource() == GrantCertificate) {
            if (areRegularStudentFieldsFilled()) {
                int enrollmentID = Integer.parseInt(EnrollmentIDTextFieldRegular.getText());
                // Find the Regular student using the provided enrollment ID
                Regular regularStudent = null;
                for (Student studentObject : StudentArray) {
                    if (studentObject instanceof Regular) {
                        Regular regularObject = (Regular) studentObject;
                        if (regularObject.getEnrollmentID() == enrollmentID) {
                            regularStudent = regularObject;
                            break;
                        }
                    }
                }

                if (regularStudent != null) {
                    regularStudent.grantCertificate(regularStudent.getCourseName(), enrollmentID, regularStudent.getDateOfEnrollment());
                    JOptionPane.showMessageDialog(this, "Certificate granted!");
                } else {
                    JOptionPane.showMessageDialog(this, "Regular student with Enrollment ID " + enrollmentID + " not found.", "Student Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the fields for regular student.");
            }
        } else if (e.getSource() == Display) {

            if (areRegularStudentFieldsFilled()) {
                // Call DisplayRegular() to show details of Regular students
                DisplayRegular();
                JOptionPane.showMessageDialog(this, "Regular student details displayed!");
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the fields for regular student.");
            }
        } else if (e.getSource() == Clear) {
            clearRegular();
            JOptionPane.showMessageDialog(this, "Regular fields cleared!");
        } else if (e.getSource() == AddDropoutStudentDropout) {
            if (areDropoutStudentFieldsFilled()) {
                String studentName = StudentNameTextField.getText();

                if (!studentName.matches("^[a-zA-Z]+$")) {
                    JOptionPane.showMessageDialog(null, "Invalid student name. Please enter a valid name.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String courseName = CourseNameTextField.getText();
                if (!courseName.matches("^[a-zA-Z]+$")) {
                    JOptionPane.showMessageDialog(null, "Invalid course name. Please enter a valid name.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    int enrollmentID = Integer.parseInt(EnrollmentIDTextField.getText());
                    int courseDuration = Integer.parseInt(CourseDurationTextField.getText());
                    int tuitionFee = Integer.parseInt(TuitionFeeTextField.getText());
                    int remainingModules = Integer.parseInt(NumberOfRemainingModulesTextField.getText());
                    int monthsAttended = Integer.parseInt(NumberOfMonthsAttendedTextField.getText());

                    if (enrollmentID <= 0 || courseDuration <= 0 || tuitionFee <= 0 || remainingModules <= 0 || monthsAttended <= 0) {
                        JOptionPane.showMessageDialog(null, "Invalid numeric input. Please enter valid values.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    String dateOfBirth = dateOfBirthComboBoxDropout1.getSelectedItem() + "-" +
                            dateOfBirthComboBoxDropout2.getSelectedItem() + "-" +
                            dateOfBirthComboBoxDropout3.getSelectedItem();
                    String dateOfEnrollment = dateOfEnrollmentComboBoxDropout1.getSelectedItem() + "-" +
                            dateOfEnrollmentComboBoxDropout2.getSelectedItem() + "-" +
                            dateOfEnrollmentComboBoxDropout3.getSelectedItem();
                    String dateOfDropout = dateOfDropoutComboBoxDropout1.getSelectedItem() + "-" +
                            dateOfDropoutComboBoxDropout2.getSelectedItem() + "-" +
                            dateOfDropoutComboBoxDropout3.getSelectedItem();

                    Dropout dropoutStudent = new Dropout(
                            dateOfBirth, studentName, courseDuration, tuitionFee,
                            remainingModules, monthsAttended, dateOfDropout, enrollmentID, courseName, dateOfEnrollment);

                    StudentArray.add(dropoutStudent);

                    JOptionPane.showMessageDialog(this, "Dropout student added successfully!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid numeric input. Please enter valid values.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the fields for dropout student.");
            }

        } else if (e.getSource() == PayTheBillsDropout) {
            if (areDropoutStudentFieldsFilled()) {
                int enrollmentID = Integer.parseInt(EnrollmentIDTextField.getText());

                Dropout dropoutStudent = null;
                for (Student studentObject : StudentArray) {
                    if (studentObject instanceof Dropout) {
                        Dropout dropoutObject = (Dropout) studentObject;
                        if (dropoutObject.getEnrollmentID() == enrollmentID) {
                            dropoutStudent = dropoutObject;
                            break;
                        }
                    }
                }

                if (dropoutStudent != null) {
                    if (!dropoutStudent.isHasPaid()) {
                        dropoutStudent.billsPayable();
                        JOptionPane.showMessageDialog(this, "Bills paid!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Bills have already been paid.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Dropout student with Enrollment ID " + enrollmentID + " not found.", "Student Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the fields for dropout student.");
            }
        } else if (e.getSource() == RemoveDropoutStudentDropout) {
            if (areDropoutStudentFieldsFilled()) {
                int enrollmentID = Integer.parseInt(EnrollmentIDTextField.getText());

                Dropout dropoutStudentToRemove = null;
                for (Student studentObject : StudentArray) {
                    if (studentObject instanceof Dropout) {
                        Dropout dropoutObject = (Dropout) studentObject;

                        if (dropoutObject.getEnrollmentID() == enrollmentID) {
                            if (dropoutObject.isHasPaid()) {
                                dropoutStudentToRemove = dropoutObject;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(this, "Cannot remove student. Pay the bills first.");
                                return;
                            }
                        }
                    }
                }

                if (dropoutStudentToRemove != null) {
                    StudentArray.remove(dropoutStudentToRemove);
                    JOptionPane.showMessageDialog(this, "Student removed successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Dropout student with Enrollment ID " + enrollmentID + " not found.", "Student Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the fields for dropout student.");
            }
        } else if (e.getSource() == DisplayDropout) {
            if (areDropoutStudentFieldsFilled()) {
                DisplayDropout();
                JOptionPane.showMessageDialog(this, "Dropout student details displayed!");
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the fields for dropout student.");
            }
        } else if (e.getSource() == ClearDropout) {
            clearDropout();
            JOptionPane.showMessageDialog(this, "Dropout fields cleared!");
        }
    }

    public static void main(String[] args) {

        StudentGUI student = new StudentGUI();
    }

}