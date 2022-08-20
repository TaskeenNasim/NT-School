import java.util.*;

class Complexicity {
    public static void main(String[] args){
        int GCD = 1;
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        int min = number1 > number2 ? number2 :number1;
        while(min >= 2) {
            if(number1 % min == 0 && number2 % min ==0) {
                GCD = min;
                break;
            }
            min--;
        }
        System.out.println("GCD("+number1+", "+number2+") = " + GCD);


    }
}