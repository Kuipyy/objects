public class Course {

    // variables
    Teacher teacher; // reference object
    String name;
    String code;
    String prefix;
    Double score;

    // methods

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int score = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.name)) {
            this.teacher = teacher;
        } else {
            System.out.println("Teacher branch and the course prefix are different! ");
        }
    }

    void printTeacherInfo() {
        this.teacher.printTeacher();
    }

}

