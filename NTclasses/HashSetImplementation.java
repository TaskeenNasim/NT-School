import java.util.HashSet;
public class HashSetImplementation {
    public static void main(String[] args){
        HashSet<Integer> myHashSet = new HashSet<>();
        myHashSet.add(9);
        myHashSet.add(10);
        myHashSet.add(56);
        myHashSet.add(9);
        myHashSet.add(9);
        myHashSet.add(56);
        for(int element: myHashSet) {
            System.out.println(element);
        }
    }
    
}
