import java.util.ArrayList;

// Class to represent a student
class Student {
    private String studentId;
    private String name;
    private String address;
    private ArrayList<Double> grades;
    private ArrayList<Boolean> attendance;

    // Constructor
    public Student(String studentId, String name, String address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.grades = new ArrayList<>();
        this.attendance = new ArrayList<>();
    }

    // Method to add grade
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Method to mark attendance
    public void markAttendance(boolean present) {
        attendance.add(present);
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public ArrayList<Boolean> getAttendance() {
        return attendance;
    }
}

// Main class
public class StudentRecordSystem {
    public static void main(String[] args) {
        // Creating a sample student
        Student student1 = new Student("007", "Sai Chandra", "KPHB Colony");

        // Adding grades
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(80);

        // Marking attendance
        student1.markAttendance(true);
        student1.markAttendance(true);
        student1.markAttendance(false);

        // Printing student details
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Average Grade: " + student1.calculateAverageGrade());
        System.out.println("Attendance: " + student1.getAttendance());
    }
}
