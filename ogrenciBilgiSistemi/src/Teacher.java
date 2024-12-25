public class Teacher {

    // variables
    int count;
    String name;
    String phone;
    String branch;

    // constructor method
    Teacher(int count,String name, String phone, String branch) {
        this.count = count;
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }

    void printTeacher() {
        System.out.printf("-Teacher %d-\n", count);
        System.out.printf("Name: %s\n", name);
        System.out.printf("Phone: %s\n", phone);
        System.out.printf("Branch: %s\n", branch);
        System.out.println();
    }


}
