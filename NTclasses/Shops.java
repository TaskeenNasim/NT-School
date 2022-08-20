//write a program to print Shop-> Ram, Subham, Gita, Renu      Name,Address,Cont

class Shopskeeper {
    String name;
    String address;
    long contactNumber;
    static int numberOfVisitors = 0;

    Shopskeeper(String name, String address, long contactNumber, int numberOfVisitors) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        // this.numberOfVisitors = numberOfVisitors;
        numberOfVisitors++;


    }
}

class Shops {
    public static void main(String[] args) {
        int numberOfVisitors = 0;
        Shopskeeper ram, shubham, renu, gita;
        ram = new Shopskeeper("Ram", "Delhi", 8789228113L, numberOfVisitors: 1 );
        System.out.println("No of visitors so far: " + Shopskeeper.numberOfVisitors);
        shubham = new Shopskeeper(name: "Shubham", address:"Noida", contactNumber: 222222222L, numberOfVisitors: 2);
        System.out.println("No of visitors so far: " + Shopskeeper.numberOfVisitors);
        renu = new Shopskeeper(name: "Renu", address:"Goa", contactNumber: 33333333L, numberOfVisitors: 3);
        System.out.println("No of visitors so far: " + Shopskeeper.numberOfVisitors);
        gita = new Shopskeeper(name: "Gita", address:"Gurugram", contactNumber: 44444444L, numberOfVisitors: 4);
        System.out.println("No of Visitors so far: " + Shopskeeper.numberOfVisitors); //expected output


    }
}
