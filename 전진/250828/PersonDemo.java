package Day_0828;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class PersonDemo {
    public static void main(String[] args) {
        //person을 여러 개
        //1. person 5개 생성
        Person Person1= new Person("진1","1","서울","010-1111-1111");
        Person Person2= new Person("진2","2","안산","010-2222-2222");
        Person Person3= new Person("진3","3","천안","010-3333-3333");
        Person Person4= new Person("진4","4","대전","010-4444-4444");
        Person Person5= new Person("진5","5","강릉","010-5555-5555");

        //2. list,set,map에 담기
        //list
        List<Person> personList = new ArrayList<>();
        personList.add(Person1);
        personList.add(Person2);
        personList.add(Person3);
        personList.add(Person4);
        personList.add(Person5);
        //set
        Set<Person> personSet = new HashSet<>();
        personSet.add(Person1);
        personSet.add(Person2);
        personSet.add(Person3);
        personSet.add(Person4);
        personSet.add(Person5);
        //map
        Map<String,Person> personMap = new HashMap<>();
        personMap.put(Person1.getIdNumber(),Person1);
        personMap.put(Person2.getIdNumber(),Person2);
        personMap.put(Person3.getIdNumber(),Person3);
        personMap.put(Person4.getIdNumber(),Person4);
        personMap.put(Person5.getIdNumber(),Person5);


    }
}
