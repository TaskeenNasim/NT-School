// class Main
// {
//     // Find the next greater element for every array element
//     public static void findNextGreaterElements(int[] input)
//     {
//         // base case
//         if (input == null) {
//             return;
//         }
 
//         // do for each element
//         for (int i = 0; i < input.length; i++)
//         {
//             // keep track of the next greater element for element `input[i]`
//             int next = -1;
 
//             // process elements on the right of element `input[i]`
//             for (int j = i + 1; j < input.length; j++)
//             {
//                 // break the inner loop at the first larger element on the
//                 // right of element `input[i]`
//                 if (input[j] > input[i])
//                 {
//                     next = input[j];
//                     break;
//                 }
//             }
 
//             System.out.print(next + " ");
//         }
//     }
 
//     public static void main(String[] args)
//     {
//         int[] input = { 2, 7, 3, 5, 4, 6, 8 };
//         findNextGreaterElements(input);
//     }
// }






import java.io.*;
import java.util.*;

public class Main {
	public static void findNextGreater(int ar[]){
		int n = ar.length;
		int ans[] = new int[n];
		Stack<Integer> stk = new Stack<>();
		for(int i=n-1;i>=0;i--){
			while(stk.size()>0 && ar[stk.peek()]<ar[i]){
				stk.pop();
			}
			if(stk.size()==0){
				ans[i]=-1;
			}
			else{
				ans[i] = ar[stk.peek()];
			}
			stk.push(i);
		}
		System.out.println(Arrays.toString(ans));
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
		findNextGreater(ar);
	}
}
