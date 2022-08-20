public class Method {
    


//creating a method for displaying the information
// Method defination
void displayStudentsInfo(){
    System.out.println("Name of Student: " + name);
    System.out.println("Age of Student: " + age);
    System.out.println("Contact Number of Student: " + ContactNumber);
}

//Get Students name
String getStudentName() {
    return name;
}

//Get Student age
int getStudentAge() {
    return age;
}

//Get Student contact number
long getStudentcontactNumber() {
    return contactNumber;
}

//set Student name
void setStudentName(String name) {
    this.name = name;
}
//set Student age
void setStudentAge(int age) {
    this.age = age;
}
//set student contact number
void setStudentContactNumber(long contactNumber) {
    this.contactNumber = contactNumber;
}
}

class Method{
    public static void main(String[] args) {
        Student bhavleen = new Student("Bhavleen", 27, 8789228113L);
        bhavleen.displayStudentsInfo(); //calling method
        Student rajeev = new Student(); //default constructor
        rajeev.displayStudentsInfo();  //calling method
        Student rahul = new Student("Rahul");
        rahul.displayStudentsInfo();
        Student rahul = new Student("Rahul");
        rahul.displayStudentsInfo();// calling method
        Student rashika = new Student(27);
        rashika.displayStudentsInfo(); // calling method
        

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
