import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        list1.add("one");
        list1.add("two");
        list1.add("eight");
        list1.add("three");
        list1.add("five");
        list1.remove("eight");
        list1.set(3,"four");
        System.out.println(list1.size());
        System.out.println(list1);
        ArrayList list2=new ArrayList<>();
        list2.add("red");
        list2.add("blue");
        list2.add("yellow");
        list1.addAll(0,list2);
        System.out.println(list1);
        System.out.println(list1.subList(2,5));
        list1.remove(list1);
        Object[] str=list1.toArray();
        for (Object x:str) {
            System.out.println(x);
        }
        list1.clear();
        System.out.println(list1);

    }
}
