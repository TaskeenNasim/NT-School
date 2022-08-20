class Student {
    // String name; //null
    static final int grade = 7;
//     final String schoolName = "Army school";
    public String schoolName;
    Student(String schoolName) {
//        Student.grade = grade;
        this.schoolName = schoolName;
    }
}

public class Drivers {
    public static void main(String[] args) {
        Student student1, student2, student3;
        student1 = new Student( "Army School");
        student2 = new Student("Kendar Vidyala");
        student3 = new Student( "DPS");
        student1.grade = 12;
        student2.grade = 13;
        student3.grade = 14;

//         Student3.schoolName = "Random";
//        Student.grade = 8;
        System.out.println("Student1 grade: " + student1.grade); //8
        System.out.println("Student1 name: " + student1.schoolName);
        // Student1.schoolName = "St Patricks";
        System.out.println("Student2 grade: " + student2.grade); //8
        System.out.println("Student2 school name: " + student2.schoolName);
         System.out.println("Student3 name: " + student3.grade); //8
        System.out.println("Student3 school name: " + student2.schoolName);
    }
}
