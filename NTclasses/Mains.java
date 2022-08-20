import java.io.*;
import java.util.*;

public class Mains {
	// time cmp: o(n^2)
	public static void bubbleSort(int ar[]){
		int n = ar.length;
		int cmp=0;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(ar[j]>ar[j+1]){
					int t = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = t;
					cmp++;
				}
			}
		}
		System.out.println("Number of cmp: "+cmp);
	}


	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++){
			ar[i] = sc.nextInt();
		}
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
	}
}
