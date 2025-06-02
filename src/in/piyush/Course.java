package in.piyush;

class Course {
    String courseName;
    static int maxCapacity = 100 ;
    int enrollments;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    String[] enrolledStudents = new String[maxCapacity];

    static void setMaxCapacity(int capacity) {
        Course.maxCapacity = maxCapacity;

    }
    void enrollStudent(String studentName) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student " + studentName + " unenrolled");
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                enrolledStudents[i] = null;
                enrollments--;
                break;
            }
        }
    }


    Course java = new Course("Java");
}


