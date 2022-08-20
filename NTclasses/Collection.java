// @ArrayList
// import java.util.ArrayList;

// public class Collection {
//     public static void main(String[] args) {
//         ArrayList<Integer> myArrayList = new ArrayList<>();
//         myArrayList.add(1); //Index 0
//         myArrayList.add(2); //Index 1
//         myArrayList.add(3); //Index 2
//         myArrayList.add(4); //Index 3
//         myArrayList.add(5); //Index 4
//         System.out.println("Removed value: " + myArrayList.remove(2));
//         // myArrayList.add(2,6); //Insert value at index 2
//         // myArrayList.clear();
//         System.out.println("Size of my array List: " + myArrayList.size());
//         // System.out.println(myArrayList.size());
//         System.out.println("Now Printing Values: ");
//         myArrayList.remove(2);
//         for(Integer value: myArrayList) {
//             System.out.println(value);
//         }
//         System.out.println(myArrayList.contains(1)); //true
//         System.out.println(myArrayList.contains(5)); //false

//     }
// }


// @HashSet
import java.util.HashSet;

public class Collection {
    public static void main(String[] args) {
        HashSet<Float> myHashSet = new HashSet<>();
        myHashSet.add(1.1f);
        myHashSet.add(2.1F);
        myHashSet.add(3.1F);
        myHashSet.add(4.1F);
        myHashSet.add(5.1F);
        myHashSet.add(6.6F);
        myHashSet.add(5.1F);

        myHashSet.remove(2.1f);
        System.out.println("Size of my hash set: " + myHashSet.size());
        System.out.println("Printing values now:");
        for(Float value: myHashSet) {
            System.out.println(value);
        }
    }
}
