// 2.while loops Example

// public class Loops {
    
//         public static void main(String[] args){
//             int input = 1;
//             while(input <= 10) {
//                 if(input % 2 == 0)
//                 System.out.println(input);

//                 input++; //+=input, input = input + 1
//             }
            
//         }    
// }


// 3.Nested while loop

// public class Loops {
    
//     public static void main(String[] args){
//         int input = 1;
//         while(input <= 10) {
//             if(input % 2 == 0)
//             System.out.println(input);

//             input++; //+=input, input = input + 1
//         }
        
//     }    
// }


// 4.do-while loop

// public class Loops {
    
//         public static void main(String[] args){
//             int input = 1;
//             do{
//                 if(input % 2 == 0)
//                 System.out.println(input);
    
//                 input++; //+=input, input = input + 1
//             }while(input <= 10);
            
//         }    
//     }



// 5.

// public class Loops {
//     public static void main(String[] args){
//                     int input = 1;
//                     do{
//                         System.out.println("Executing. . .");
//                         if(input % 2 == 0)
//                              System.out.println(input);
            
//                         input++; //+=input, input = input + 1
//                     }while(input <= 10);
                    
//                 }    
//             }
        

// Q:- Untill and unless user inputs n or N, keep printing to the user message "Let's play".
// @do loop
// import java.util.Scanner;
// public class Loops{
//     public static void main(String[] args){
//         char input;
//         do{
//             Scanner scanner = new Scanner(System.in);
//             input = scanner.next().charAt(0);
//             System.out.println("Let's play");
//         }while(input != 'n' && input != 'N');
//     }
// }

// @while loops
// import java.util.Scanner;

// import javax.lang.model.util.SimpleElementVisitor14;
// public class Loops{
//     public static void main(String[] args){
//         char input;
//         do {
//                 Scanner scanner = new Scanner(System.in);
//                 input = scanner.next().charAt(0);
//                 if(input != 'n' && input !='N')
//                        System.out.println("Let's play.");
//                 else
//                        System.out.println("Its over!");
                       
     
//         }while(input != 'n' && input != 'N');
// }
// }


// import java.util.Scanner;
// // import javax.lang.model.util.SimpleElementVisitor14;
// public class Loops{
//     public static void main(String[] args){
//         char input;
//         do {
//                 Scanner scanner = new Scanner(System.in);
//                 input = scanner.next().charAt(0);
//                 if(input != 'n' && input !='N')
//                        System.out.println("Let's play.");
//                 else{
//                        System.out.println("Its over!");
//                        break;
//         }
//         }while(true);
// }
// }


// @continue Statement
// import java.util.Scanner;
// // import javax.lang.model.util.SimpleElementVisitor14;
// public class Loops{
//     public static void main(String[] args){
//         for(int input = 1; input <= 10; input++){
//             if(input % 2!= 0)

//             // if(input % 2== 0)

//                     continue;
//             System.out.println(input);
        
//         }
// }
// }


// @Switch Statement

// import java.util.Scanner;
// // import javax.lang.model.util.SimpleElementVisitor14;
// public class Loops{
//     public static void main(String[] args){
//         String input = "May";
//             // int input = 2;
//         //  int input = 24;//Default statement will work
//          switch(input) {
//             // case 1: System.out.println("January");
//             // case 2: System.out.println("Februray");
//             // case 3: System.out.println("March");
//             // case 4: System.out.println("April");
//             // case 5: System.out.println("May");
//             // case 6: System.out.println("June");
//             // case 7: System.out.println("July");
//             // case 8: System.out.println("August");
//             // case 9: System.out.println("September");
//             // case 10: System.out.println("October");
//             // case 11: System.out.println("November");
//             // case 12: System.out.println("December");



//             case "January":{ System.out.println(1);
//                         break;
//                     }
//             case "Febrary": {System.out.println(2);
//                         break;
//                     }
//             case "March": {System.out.println(3);
//                         break;
//                     }
//              case "April": {System.out.println(4);
//                         break;
//                     }        
//              case "May": {System.out.println(5);
//                         break;
//                     }
//              case "June": {System.out.println(6);
//                         break;
//                     }
//              case "July": {System.out.println(7);
//                         break;
//                     }
//              case "August": {System.out.println(8);
//                         break;
//                     }
//              case "September": {System.out.println(9);
//                         break;
//                     }
//              case "October": {System.out.println(10);
//                         break;
//                     }
//              case "Noverber": {System.out.println(11);
//                         break;
//                     }
//              case "December": {System.out.println(12);
//                         break;
//                     }




import java.util.Scanner;
// import javax.lang.model.util.SimpleElementVisitor14;
public class Loops{
    public static void main(String[] args){
        // String input = "May";
            int input = 2;
        //  int input = 24;//Default statement will work
         switch(input) {
            
            case 1:{ System.out.println("January");
                        break;
                    }
            case 2: {System.out.println("Februray");
                        break;
                    }
            case 3: {System.out.println("March");
                        break;
                    }
            case 4:{ System.out.println("April");
                        break;
                    }
            case 5: { System.out.println("May");
                        break;
                    }
            case 6: { System.out.println("June");
                        break;
                    }
            case 7: { System.out.println("July");
                        break;
                    }
            case 8: { System.out.println("August");
                        break;
                    }
            case 9: { System.out.println("September");
                        break;
                    }
            case 10: { System.out.println("October");
                        break;
                    }
            case 11: { System.out.println("November");
                        break;
                    }
            case 12: { System.out.println("December");
                       break;
                    }
        default : System.out.println("Not a valid month");

         } 
}
}


// // Checking compatible 
// import java.util.Scanner;
// class Loops{
//     public static void main(String[] args) {
//         // String input = "20L"; // run default statement

//         String input = "17L";
//         switch(input) {
//             case "17L": {System.out.println("true");
//                             break;
//                         }
//              default : System.out.println("false");
//         }
//     }
// }




