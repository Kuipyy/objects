//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1, "Neslihan", "537999", "Maths");
        Teacher teacher2 = new Teacher(2, "Mert", "5428888", "History");

        Course maths = new Course("Maths", "101", "MTH", teacher1);
        Course history = new Course("Language", "205", "HST", teacher2);

        maths.addTeacher(teacher1);
        maths.printTeacherInfo();

        history.addTeacher(teacher2);
        history.printTeacherInfo();
    }
}