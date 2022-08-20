// import java.io.*;
// import java.util.*;

// public class Main {
//     // 
// 	public static boolean search(int ar[],int tar){
// 		int i=0;
// 		int j=ar.length-1;
// 		while(i<j){
// 			int sum = ar[i]+ar[j];
// 			if(sum == tar){
//                 System.out.println(ar[i]+" "+ar[j]);
// 				return true;
// 			}
// 			else if(sum < tar){
// 				i++;
// 			}
// 			else{
// 				j--;
// 			}
// 		}
// 		return false;
// 	}


// 	public static void main(String[] args) {
// 		try {
// 			System.setIn(new FileInputStream("input.txt"));
// 			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		} catch (Exception e) {
// 			System.err.println("Error");
// 		}
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int ar[] = new int[n];
// 		for(int i=0;i<n;i++){
// 			ar[i] = sc.nextInt();
// 		}
// 		int tar = sc.nextInt();
// 		if(search(ar,tar)){
// 			System.out.println("Yes");
// 		}
// 		else{
// 			System.out.println("No");
// 		}
// 	}
// }



// Abstracte classes
// import java.io.*;
// import java.util.*;

// abstract class Fruit{
// 	int cost = 100;
// 	void display(){
// 		System.out.println("sell fruit: "+cost);

// 	}
// }
// class Apple extends Fruit{
// 	int cost = 120;
// 	void display(){
// 		System.out.println("sell apple: "+cost);
// 	}
// }

// // newly discovered fruit, we don't know about
// class DragronFruit extends Fruit{
	
// }


// // get and setter

// public class Main {
// 	public static void main(String[] args) {
// 		try {
// 			System.setIn(new FileInputStream("input.txt"));
// 			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		} catch (Exception e) {
// 			System.err.println("Error");
// 		}
// 		DragronFruit fruit = new DragronFruit();
// 		fruit.display();
// 	}
// }




// public class Main {
// 	static void calArea(int l,int r){
// 		System.out.println("rectanlge area: "+(l*r));
// 	}

// 	static void calArea(int r,int l){
// 		System.out.println("rectanlge area: "+(l*r));
// 	}
	
// 	static void calArea(int l){
// 		System.out.println("square area: "+(l*l));
// 	}

// 	static void calArea(double r){
// 		System.out.println("cirle area: "+(3.14*r*r));
// 	}
	

// 	public static void main(String[] args) {
// 		try {
// 			System.setIn(new FileInputStream("input.txt"));
// 			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		} catch (Exception e) {
// 			System.err.println("Error");
// 		}
// 		calArea(1,2);
// 		calArea(2,1);
// 		calArea(3);
// 		calArea(14.00);
// 	}
// }






// import java.io.*;
// import java.util.*;

// abstract class Fruit{
// 	int cost = 100;
// 	void display(){
// 		System.out.println("sell fruit: "+cost);

// 	}
// }
// class Apple extends Fruit{
// 	int cost = 120;
// 	void display(){
// 		System.out.println("sell apple: "+cost);
// 	}
// }

// // newly discovered fruit, we don't know about
// class DragronFruit extends Fruit{
	
// }


// // get and setter

// public class Main {
// 	static int calArea(int l,int r){
// 		return l*r;
// 	}

// 	static String calArea(double r){
// 		return (3.14*r*r)+"";
// 	}
	

// 	public static void main(String[] args) {
// 		try {
// 			System.setIn(new FileInputStream("input.txt"));
// 			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		} catch (Exception e) {
// 			System.err.println("Error");
// 		}
// 		System.out.println(calArea(1,2));
// 		System.out.println(calArea(14.00));
// 	}
// }





// Polymorphism

// import java.io.*;
// import java.util.*;

// abstract class Vehicle{
// 	abstract void accerate();
// 	abstract void checkSpeed();
// }


// class Posche extends Vehicle{
// 	@Override
// 	public void accerate(){
// 		System.out.println("posche accelrate");
// 	}

// 	@Override
// 	public void checkSpeed(){
// 		System.out.println("posche speed: 100km per hr");
// 	}
// }

// class Benz extends Vehicle{
// 	@Override
// 	public void accerate(){
// 		System.out.println("benz accelrate");
// 	}

// 	@Override
// 	public void checkSpeed(){
// 		System.out.println("benz speed: 180km per hr");
// 	}
// }


// // get and setter

// public class Main {
	

// 	public static void main(String[] args) {
// 		try {
// 			System.setIn(new FileInputStream("input.txt"));
// 			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		} catch (Exception e) {
// 			System.err.println("Error");
// 		}
// 		Vehicle car = new Posche();
// 		car.accerate();
// 		car.checkSpeed();

// 		Vehicle car2 = new Benz();
// 		car2.accerate();
// 		car2.checkSpeed();

// 	}
// }








// import java.io.*;
// import java.util.*;

// interface User{
// 	public void displayName();
// }

// interface Person extends User{

// }


// class Rahul implements User{
// 	@Override
// 	public void displayName(){
// 		System.out.println("Hi my name is rahul, i am pro coder");
// 	}
// }

// public class Main {
// 	public static void main(String[] args) {
// 		try {
// 			System.setIn(new FileInputStream("input.txt"));
// 			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		} catch (Exception e) {
// 			System.err.println("Error");
// 		}
// 		Scanner sc = new Scanner(System.in);
// 		User user = new Rahul();
// 		user.displayName();
// 	}
// }





import java.io.*;
import java.util.*;

// heirachy level inhertance
class Parent{
	public Parent(){
		System.out.println("called parent");
	}
}

class Child1 extends Parent{
	public Child1(){
		System.out.println("called Child1");
	} 
}

class Child2 extends Parent{
	public Child2(){
		System.out.println("called Child2");
	} 
}

class Child3 extends Parent{
	public Child3(){
		System.out.println("called Child3");
	} 
}


public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);

		Parent chd1 = new Child3();
	}
}








