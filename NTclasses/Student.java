//24 class
class Main {
    String name;
    int age;
}

class Student {
    public static void main(String[] args){
        Student bhavleen = new Student();
        System.out.println("Name of Student:" + bhavleen.name); //default value = null
        System.out.println("Age of Student: " + bhavleen.age); //default value = 0
        bhavleen.name = "Bhavleen Singh";
        bhavleen.age = 27;
        System.out.println("**********");

        System.out.println("Name of Student:" + bhavleen.name); //Bhavleen Singh
        System.out.println("Age of Student: " + bhavleen.age); //27
        Student Rajeev = new Student();
        // rajeev.name = new Student();
        // rajeev.name = "Rajeev Singh";
        // rajeev.age = 36;
    }
}