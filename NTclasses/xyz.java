//23/07/2022 DSA Revesion Classes
import javafx.util.pair;
import java.util.ArrayList;

public static void main(String[] args) {
    int[] input = {6, 18, 15, 17, 22, 34, 56, 41, 8, 5, 11};
    ArrayList<pair<Integer, Integer>> result = new ArrayList<>();
    for(int i= 0; i < input.length; i++){
        for(int j= 0; j< input.length ; j++){
            if(input[i]+input[j] == 49)
            result.add(new pair<>(input[i], input[j]));
            }
    }
    System.out.println(result);
}
