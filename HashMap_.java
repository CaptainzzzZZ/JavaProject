package Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class worker{
    private String id;
    private String salary;
    private String name;

    public worker(String salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public worker(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id"+this.id+"sal"+this.salary+"name"+this.name;
    }
}
public class HashMap_ {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(new worker("001"),new worker("5555","lzz"));
        hashMap.put(new worker("002"),new worker("3333","xxm"));
        hashMap.put(new worker("003"),new worker("6666","LZZZ"));
        Set<Map.Entry<Object, Object>> entrySet = hashMap.entrySet();
        for (Object entryset :entrySet) {
            Map.Entry entry=(Map.Entry)entryset;
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        Set<Object> keySet = hashMap.keySet();
        for (Object o :keySet) {
            System.out.println(o+"-"+hashMap.values());
        }
        Iterator it= keySet.iterator();



    }
}
