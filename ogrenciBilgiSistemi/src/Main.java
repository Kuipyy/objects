//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1, "Neslihan", "537999", "Maths");
        Teacher teacher2 = new Teacher(2, "Mert", "542888", "History");
        Teacher teacher3 = new Teacher(3, "Yasemin", "540555", "Language");

        Course maths = new Course("Maths", "101", "MTH");
        Course history = new Course("History", "205", "HST");
        Course language = new Course("Language", "306", "LNG");

        Student student1 = new Student("atahan", "122344", "3", maths, history, language);

        student1.addBulkExamNote(55,65,100);
        student1.isPassed();
        System.out.println();

        System.out.println();

        maths.addTeacher(teacher1);
        maths.printTeacherInfo();

        history.addTeacher(teacher2);
        history.printTeacherInfo();

        language.addTeacher(teacher3);
        language.printTeacherInfo();
    }
}