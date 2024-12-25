public class Student {

    Course course1;
    Course course2;
    Course course3;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPassed;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPassed = false;
    }

    void addBulkExamNote(double score1, double score2, double score3) {
        if (score1 >= 0 && score1 <= 100) {
            course1.score = score1;
        }
        if (score2 >= 0 && score2 <= 100) {
            course2.score = score2;
        }
        if (score3 >= 0 && score3 <= 100) {
            course3.score = score3;
        }
    }

    void printScores() {
        System.out.println(this.course1.name + " Not: " + this.course1.score);
        System.out.println(this.course2.name + " Not: " + this.course2.score);
        System.out.println(this.course3.name + " Not: " + this.course3.score);
        System.out.println("Average: " + this.average);
    }

    void isPassed() {
        this.average = (this.course1.score + this.course2.score + this.course3.score) / 3;
        if (this.average >= 50) {
            this.isPassed = true;
            System.out.println("Passed!");
        } else {
            this.isPassed = false;
            System.out.println("Failed!");
        }
        printScores();
    }

}
