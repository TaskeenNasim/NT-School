//28/06/2022

// import java.util.ArrayList;
// public class Libraries{
//     public static void main(String[] args) {
//         ArrayList<Integer> myArrayList = new ArrayList<>();
//         myArrayList.add(1);
//         myArrayList.add(2);
//         myArrayList.add(3);
//         myArrayList.add(4);
//         myArrayList.add(5);
//         System.out.println("Removed value: "+ myArrayList.remove(index:2));
//         myArrayList.clear();
//         System.out.println("size of my array list: " + myArrayList);
//         System.out.println("size of my array List: ");
//         System.out.println("Now printing values: ");
//         System.out.println(myArrayList.size());
//         for(Integer value: myArrayList) {
//             System.out.println(value);
//         }
//         System.out.println(myArrayList.contains(4));
//     }
// }


import java.util.ArrayList;
public class Libraries{
    public static void main(String[] args) {
        HashSet<Float> myHashSet = new HashSet<>();
        myHashSet.add(1.1F);
        myHashSet.add(2.1F);
        myHashSet.add(3.1F);
        myHashSet.add(4.1F);
        myHashSet.add(5.1F);
        System.out.println("size of my hash set: " + myHashSet.size());
        System.out.println("Printing values now: ");
        for(float values : myHashSet){
            System.out.println(values);
        }
    }
}

