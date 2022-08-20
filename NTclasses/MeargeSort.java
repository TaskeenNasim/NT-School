import java.io.*;
import java.util.*;



public class MeargeSort(){
static void merge(int ar[],int x1,int y1,int x2,int y2){
    int tmp[] = new int[ar.length];
    int i=x1;
    int j=x2;
    int k=x1;
    while(i<=y1 && j<=y2){
        if(ar[i]<ar[j]){
            tmp[k++]=ar[i++];
        }
        else{
            tmp[k++]=ar[j++];
        }
    }
    while(i<=y1){
        tmp[k++] = ar[i++];
    }
    while(j<=y2){
        tmp[k++] = ar[j++];
    }
    for(int p=x1;p<=y2;p++){
        ar[p]=tmp[p];
    }
}
}


public static void helper(int ar[],int l,int r){
    // base logic
    if(l>=r){
        return;
    }
    int m = (l+r)/2;
    helper(ar,l,m);
    helper(ar,m+1,r);
    merge(ar,l,m,m+1,r);

}

public static void mergeSort(int ar[]){
    helper(ar,0,ar.length-1);
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
    int ar1[] = new int[n];
    for(int i=0;i<n;i++){
        ar1[i] = sc.nextInt();
    }
    mergeSort(ar1);		
    System.out.println(Arrays.toString(ar1));
}

