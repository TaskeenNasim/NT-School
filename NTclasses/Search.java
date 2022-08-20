//29/06/2022

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// import java.util.HashSet;

public class Search{
    public static void main(String[] args);
    ArrayList<Integer> myArrayList = new ArrayList<>();
    int size ;
    System.out.println("Enter̥ the size of your List: ");
    Scanner scanner = new Scanner(System.in);
    size = Scanner.nextInt();
    System.out.println("Start entering values now: ");
    for(int i = 0; i < size; i++ ) {
        int value = scanner.nextInt();
        myArrayList.add(value);
    }
    //sort the array first
    Collections.sort(myArrayList);
    Pair<Integer, Integer> myPair = new Pair<> (myArrayList.get(0) - 2, myArrayList.get(size - 1));
    System.out.println("Lowest Value: " + myPair.getKey());
    System.out.println("Highest Value: " + myPair.getValue());
    System.out.println("MyPair " + myPair.toString());
      

}