package Map_;

import javafx.concurrent.Worker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Emp{
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "worker{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class HashMap_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,new Emp("lzz",50000,1));
        hashMap.put(2,new Emp("xxm",6000,2));
        hashMap.put(3,new Emp("zzz",1000,3));
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry=(Map.Entry)next;
            Emp emp=(Emp) entry.getValue();
            if(emp.getSal()>2000){
                System.out.println(emp);
            }
        }
        Set keySet = hashMap.keySet();
        for (Object key :keySet) {
            Emp emp2 =(Emp) hashMap.get(key);
            if (emp2.getSal()>2000){
                System.out.println(emp2);
            }
        }

    }


}