public class course {
    static int maxCapacity = 100;
    String courseName;
    int enrollements;
    String[] enrolledStudents;
    course(String courseName){
        this.courseName=courseName;
        this.enrollements=0;
        this.enrolledStudents = new String[maxCapacity];
    }
    static void setMaxCapacity(int maxCapacity) {
        course.maxCapacity = maxCapacity;
    }
    void enrollStudent(String studentName) {
        enrolledStudents[enrollements]=studentName;
        enrollements++;
    }
    void unenrollStudent(String studentName){
        System.out.println("Student remove");
        enrollements--;
    }
}
