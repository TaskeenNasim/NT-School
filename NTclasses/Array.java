import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
    try {
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new printStream(new FileOutputStream("")));
    } catch(Exception e) {
        System.out.println("Error");
    }
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int ar[] = new int[n];
    for(int i=0; i<n; i++){
        ar[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i=0;i<n;i++){
        if(ar[i] == k){
            System.out.println(i+" ");
        }
    }
    if(flag == 0){
        System.out.println("element not present");
    }

    }
}
