//25/06/2022

class Student {
    public String name;
    public int age;
    private long contactNumber;

    Student() {
        name = "Anonymous";
        age = 18;
        contactNumber = 8789228113L;
    }

    Student(String name) {
        this.name = name;
        age = 21;
        contactNumber = 8789228113L;
    }

    //compiler will add this peice of code on its own
    Student(String name, int age, long contactNumber) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    Student(Long contactNumber) {
        name = "Anony";
        age = 21;
        this.contactNumber = contactNumber;
    }
    //Creating a method for display the information
    //Method defination
    void displayStudentsInfo() {
        System.out.println("Name of student: " + name);
        System.out.println("Age of Student: " + age);
        System.out.println("Contact Number of Student: " + contactNumber);
    }

    //only Students name
    String getStudentName() {
        return name;
    }

    //Get students age
    int getStudentAge(){
        return age;
    }

    //set student name
    void setStudentName(String name) {
        this.name = name;
    }

    //set student age
    void setStudentAge(int age) {
        this.age = age;
    }

    //set student contact number
    void setStudentNumber(long contactNumber){
        this.contactNumber = contactNumber;
    }

}
class Constructor {
    public static void main(String[] args) {
        Student bhavleen = new Student("Bhavleen", 27, 8789228113L);
        // bhavleen.contactNumber = 99999999L;
        // System.out.println("Name of Student: " + bhavleen.getsStudentName());

        bhavleen.displayStudentsInfo(); //Calling Method
        Student rajeev = new Student(); //default constructor
        rajeev.displayStudentsInfo();
        System.out.println("Name of Student: " + bhavleen.name);
        System.out.println("Age of Student: " + bhavleen.age);
        // Student rajeev = new Student();//default constructor
        System.out.println("Name of Student: " + rajeev.name);
        System.out.println("Age of Student: " + rajeev.age);
        Student rahul = new Student("Rahul");
        rahul.displayStudentsInfo();
        System.out.println("Name of Student: " + rahul.name); //Rahul
        System.out.println("Age of Student: " + rahul.age); //21
        Student rashika = new Student(27L);
        rashika.displayStudentsInfo();
        System.out.println("Name of Student: " + rashika.name);
        System.out.println("Age of Student: " + rashika.age);
        }
}
