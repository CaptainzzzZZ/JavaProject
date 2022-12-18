package Collections;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import  java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
@SuppressWarnings({"all"})
public class ArrList {
    public static void main2(String[] args) {
        ArrayList arrList = new ArrayList();
        for (int i = 0; i < 15; i++) {
                 arrList.add(i);
        }
    }
    public static void main(String[] args) {
        ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new Dog("zz",22));
        arrayList.add(new Dog("欢欢",8));
        arrayList.add(new Dog("大黄",6));
        for (Object o :arrayList) {
            System.out.println(o);
        }
        System.out.println();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        ArrayList list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("123");
        list.add("456");
        list.add("78910");
        list.add("lzz");

        System.out.println("交换前默认顺序"+list);
        Collections.swap(list,2,3);
        System.out.println("交换后"+list);
        Collections.rotate(list,3);
        System.out.println("交换后"+list);
        Collections.sort(list);
        System.out.println("自然排序后" + list);
        Collections.reverse(list);
        System.out.println("逆序"+list);
        Collections.shuffle(list);
        System.out.println("随即顺序"+list);
//        Collections.fill(list,1);
//        System.out.println("fill完"+list);
        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println(dest+"\n"+list);
        Object a=Collections.min(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("最短字符串"+a);
        System.out.println(Collections.indexOfSubList(list, dest));
        System.out.println(Collections.lastIndexOfSubList(list, dest));
        System.out.println(Collections.binarySearch(list, "123"));
        Collections.replaceAll(list,"123","yiersan");
        System.out.println(list);


    }
}
class Dog{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
