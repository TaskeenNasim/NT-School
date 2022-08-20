// import java.io.*;
// import java.util.*;

// abstract class Fruit{
//     void display(){
//         System.out.println("hello fruit");
//     }
// }

// class Apple extends Fruit{
//     void.display(){
//         System.out.println("hello.apple");
//     }
// }
// //newly discovered fruit
// class DragonFruit extends Fruit{

// }
// public class Main {
//     public static void main(String[] args) {
//         Fruit fruit = new Apple();
//         fruit.display();
        
//     }
// }




import java.io.*;
import java.util.*;

abstract class Fruit{
	int cost = 100;
	void display(){
		System.out.println("sell fruit: "+cost);

	}
}
class Apple extends Fruit{
	int cost = 120;
	void display(){
		System.out.println("sell apple: "+cost);
	}
}

// newly discovered fruit, we don't know about
class DragronFruit extends Fruit{
	
}


// get and setter

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		DragronFruit fruit = new DragronFruit();
		fruit.display();
	}
}
