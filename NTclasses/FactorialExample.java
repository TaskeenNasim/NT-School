import java.io.*;
import java.util.*;

public class Main{
    public static void cal(int n) {
        //base code
        if(n ==0 || n==1){
            return 1;
        }
        // main logic
        int val = n*cal(n-1);
        return val;
    }
//         System.out.println(n+" ");
//         print(n-1);

//     }
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int ar[] = new int[n];
//     for(int i=0)
// }

class FactorialExample{
    static int factorial(int n){
        if(n == 0)
        return 1;
        else{
            return(n*factorial(n-1));
        }
    }
}