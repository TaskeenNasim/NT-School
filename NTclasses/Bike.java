//Inheritance
import java.io.*;
import java.util.*;

class Vehicle{
    public void Move(){
        System.out.print("Vehicle can move");
    }
}
class Bike extends Vehicle{

// }

// public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bike bike = new Bike();
        bike.Move();
    }
}