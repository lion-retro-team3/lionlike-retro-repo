package Day_0828;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("kang","010-111-1111");
        phoneBook.put("kim","010-222-2222");
        phoneBook.put("hong","010-333-3333");

        System.out.println(phoneBook.get("kang"));

        Set<String> keys = phoneBook.keySet();
        System.out.println(keys);

        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key +":"+phoneBook.get(key));
        }
        System.out.println("==================================");
        for(String key:keys){
            System.out.println(key +":"+phoneBook.get(key));
        }
        System.out.println("==================================");
        for (Map.Entry<String,String> entry:phoneBook.entrySet()){
            System.out.println(entry.getKey() +"::" +entry.getValue());
        }


    }
}