import java.util.HashMap;
public class HashMapImplementation {
    public static void main(String[] args){
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Bhavleen", "Singh");
        myHashMap.put("Taskeen", "Nasim");
        myHashMap.put("Dilshad", "Ansari");
        myHashMap.put("Shad", "Singh");
        System.out.println(myHashMap);
        System.out.println(myHashMap.keySet());
        System.out.println(myHashMap.values());
        System.out.println(myHashMap.get("Taskeen"));
    }

}