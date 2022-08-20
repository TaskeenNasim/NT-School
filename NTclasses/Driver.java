// 1.For Loops
class Driver{
    public static void main(String[] args){
        boolean flag = false;
        for(int input = 1; input <= 10; input++){

            for(int value = 2; value < input-1; value++){

            if(input %  value == 0){
                System.out.println(input + "is Not Prime");
                flag = true;
            }
        }
        if(flag)
        System.out.println(input + "is prime.");
        flag = false;
    }
}
}
