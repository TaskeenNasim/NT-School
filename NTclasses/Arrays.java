// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         int[] numbers = new int[10];
//         int index;
//         // writing values inside array
//         for(index = 0; index < 10; index++) {
//             numbers[index] = index + 1;
//         }
//         // Reading values from array
//         for(index = 0; index < 10; index++){
//             System.out.println(numbers[index]);
//         }
//         //  number[10] = 11;
//     }
// }



// import java.util.Scanner;
// class Arrays{
//     public static void main(String[] args) {
//         int[] numbers = {4, 17, 45, 56, 78};
//         int index;

//         // Reading values from array
//         for(index = 0; index < 5; index++) {
//             System.out.println(numbers[index]);
//         }
//     }
// }



// printing
// 1 2 3
// 1 2 3
// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         int[][] numbers = new int[2][3];
//         int row, column;
//         // writing elements inside the array
//         for(row = 0; row < 2; row++){
//             for(column = 0; column < 3; column++){
//                 numbers[row][column] =  column + 1;
//             }
//         }
//         // Read elements from my array
//         for(row = 0; row < 2; row++){
//             for(column = 0; column < 3; column++){
//                 System.out.print(numbers[row][column] + " ");
//             }
//             System.out.println();
//         }
//     }
// }




// printing
// 1 2 3
// 2 3 4
// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         int[][] numbers = new int[2][3];
//         int row, column;
//         // writing elements inside the array
//         for(row = 0; row < 2; row++){
//             for(column = 0; column < 3; column++){
//                 numbers[row][column] =  row + column + 1;
//             }
//         }
//         // Read elements from my array
//         for(row = 0; row < 2; row++){
//             for(column = 0; column < 3; column++){
//                 System.out.print(numbers[row][column] + " ");
//             }
//             System.out.println();
//         }
//     }
// }




// printing
// 1 2 3 4 5 
// 6 7 8 9 10
// 11 12 13 14 15
// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         int[][] numbers = {  {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}  };
//         int row, column;
//         // writing elements inside the array
//         for(row = 0; row < 3; row++){
//             for(column = 0; column < 5; column++){
//                 System.out.print(numbers[row][column] + " ");
//             }
//             System.out.println();
//         }
//     }
// }




// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         int column;
//         int[][] numbers = new int [5][];
//         numbers[0] = new int[]{4, 8, 12, 34};
//         numbers[1] = new int[]{2, 8,};
//         numbers[2] = new int[]{9, 13, 23};
//         numbers[3] = new int[]{7};
//         numbers[4] = new int[]{1, 11, 21};

//         // Loop for traversing row 1
//         for(column = 0; column < 4; column++)
//         System.out.print(numbers[0][column]+ " ");
//         System.out.println();

//         // Loop for traversing row 2
//         for(column = 0; column < 2; column++)
//         System.out.print(numbers[0][column]+ " ");
//         System.out.println();

//         // Loop for traversing row 1
//         for(column = 0; column < 3; column++)
//         System.out.print(numbers[0][column]+ " ");
//         System.out.println();

//         // Loop for traversing row 1
//         for(column = 0; column < 4; column++)
//         System.out.print(numbers[0][column]+ " ");
//         System.out.println();
//     }
// }


// import java.util.Scanner;
// class Arrays {
//     public static void main(String[] args) {
//         String[] city = {"Delhi", "Dehradun", "Mohali", "Shimla", "Lucknow"};

//         // Read the values from 1-D array
//         for(String value : city)
//          System.out.println(value);
//     }
// }




// import java.util.Scanner;
// class Arrays {
//     public static void main(String[] args) {
//         String[] city = {"Delhi", "Dehradun", "Mohali", "Shimla", "Lucknow"};

//         // Read the values from 1-D array
//         for(String value : city)
//          System.out.println(value);

//          float[][] marks = { {24.5F, 78.2F, 67.3F}, {97.2F, 56F, 44.7F}, {89.2F, 80.6F, 71F}};
    
//         //  Read values from marks
//         for(float[] rows : marks){
//             for(float values : rows){
//                 System.out.print(values+ " ");
//             }
//             System.out.println();
//         }
//         }
// }



// Problem: I have values starting from 1 to a number 10. I need to find the only missing number.
// 1, 2, 3, 5, 6, 7, 8, 9, 10 -->4
// 1, 2, 3, 4, 5, 7, 8, 9, 10 -->6
// 1, 2, 3, 4, 5, 6, 7, 8, 10 -->9
// sum of n natural numbers = (n(n+1))/2
// sum of series till 10 - sum of actual series = missing number
// 55 - 51 = 4
// 55 - 49 = 6
// 55 - 46 = 9

// import java.util.Scanner;
// class Arrays{
//     public static void main(String[] args){
//         int sumOfSeries = (10*11)/2;
//         int actualSum = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value for n: ");
//         int[] series = {1, 2, 3, 5, 6, 7, 8, 9, 10};
//         for(int value : series) {
//             actualSum += value; //
//         }
//         System.out.println(sumOfSeries - actualSum);

//     }
// }

// Problem: Sum of matrix
// 3 4 5 
//  7 9 10
// -------
// 4 8 11
// 2 7 9
// -------
// 7 12 16
// 9 16 19

// import java.util.Scanner;
// class Arrays{
//     public static void main(String[] args) {
//         int[][] firstMatrix = {{3, 4,5}, {7, 9, 10}};
//         int[][] secondMatrix = {{4, 8, 11}, {2, 7, 9}};
//         int[][] result = new int[2][3];
//         for(int rows = 0; columns < 3; columns++){
//             result[rows][columns] = firstMatrix[rows][columns] + secondMatrix[rows][column];
//         }
//     }
//     for(int[] rows: result){
//         for(int value: rows)
//         System.out.print(value+ " ");
//     }
//         System.out.println();
//     }
// }
