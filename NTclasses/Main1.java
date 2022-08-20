// You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
// Return the minimum number of boats to carry every given person.
// people = [3,2,2,1], limit = 3
// output :  3


import java.io.*;
import java.util.*;

public class Main1 {
	public static int cntBoat(int ar[],int lmt){
		Arrays.sort(ar);
		int i=0;
		int j=ar.length-1;
		int cnt=0;
		while(i<=j){
			if(ar[i]+ar[j]<=lmt){
				cnt++;
				i++;
				j--;
			}
			else if(ar[j]<=lmt){
				cnt++;
				j--;
			}
			else{
				i++;
			}
		}
		return cnt;
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
		int lmt = sc.nextInt();
		System.out.println(cntBoat(ar,lmt));
		
	}
}

