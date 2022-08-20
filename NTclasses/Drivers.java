// 24/06/2022
class Student {
    public String name;
    public int age;
    public long contactNumber;

    //compiler will add this peice of code on its own
    Student() {
        name = null;
        age = 18;
        contactNumber = 1111111111L;

    }
}
class Drivers {
    public static void main(String[] args) {
        Student bhavleen = new Student();
        System.out.println("Name of Student: " + bhavleen.name);
        System.out.println("Age of Student: " + bhavleen.age);
        // System.out.println("Contact Number of Student: " + bhavleen.contactNumber);
        System.out.println("Contact Number of Student: " + bhavleen.contactNumber);
        bhavleen.name = "Bhavleen Singh";
        bhavleen.age = 27;
        bhavleen.contactNumber = 99999999L;
        System.out.println("********************");
        System.out.println("Name of Student: " + bhavleen.name);
        System.out.println("Age of Student: " + bhavleen.age);
    }

}