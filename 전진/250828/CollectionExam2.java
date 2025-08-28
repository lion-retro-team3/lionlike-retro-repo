package Day_0828;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class CollectionExam2 {
    public static void main(String[] args) {
        //list,set,map 5개씩 입력/출력

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("List 출력:");
        for (String item : list) {
            System.out.println("- " + item);
        }


        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("\nSet 출력:");
        for (int num : set) {
            System.out.println("- " + num);
        }


        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 85);
        map.put("Bob", 92);
        map.put("Charlie", 78);
        map.put("Diana", 90);
        map.put("Ethan", 88);

        System.out.println("\nMap 출력:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());


        }
    }
}
