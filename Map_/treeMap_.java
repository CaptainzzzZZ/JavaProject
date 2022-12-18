package Map_;

import java.util.Comparator;
import java.util.TreeMap;

public class treeMap_ {
    public static void main(String[] args) {
//        TreeMap<Object, Object> treeMap = new TreeMap<>();//默认的构造器 comparator是null 默认的构造器是自然排序是从小到大  TreeMap()使用其键的自然排序构造一个新的空树状图。
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo(((String)o2));//
            }
        });
        treeMap.put("d",1);
        treeMap.put("ab",1);
        treeMap.put("f",1);
        treeMap.put("b",2);
        treeMap.put("c",1);
        treeMap.put("e",1);
        System.out.println(treeMap);
    }
}
        ///treeMap底层源码
        /*
        1.有参TreeMap构造器传入实现了comparator的匿名内部类（对象），又传给了treemap的成员comparator
         public TreeMap(Comparator<? super K> comparator) {
            this.comparator = comparator;
        }
        2.put()
        public V put(K key, V value) {
                Entry<K,V> t = root;                      //跟hashMap一样把K-V封装成Node放入实现的内部类Entry
                if (t == null) {                           // 2.1第一次put 根节点为空
                    compare(key, key); // type (and possibly null) check  //检查KV是否为null
                    root = new Entry<>(key, value, null);      //new entry直接放入根节点
                    size = 1;
                    modCount++;
                    return null;
                }
                int cmp;
                Entry<K,V> parent;
                // split comparator and comparable paths
                Comparator<? super K> cpr = comparator;         //动态绑定到匿名内部类comparator
                if (cpr != null) {
                    do {
                        parent = t;
                        cmp = cpr.compare(key, t.key);
                        if (cmp < 0)
                            t = t.left;         //开始比较 根据实现的匿名内部类规则 负的放左子树正的放右子树
                        else if (cmp > 0)
                            t = t.right;
                        else
                            return t.setValue(value);
                                        //0的话treeSet直接放弃因为他的value是一个常量对象都一样 treeMap会将原来的value替换成新的

                    } while (t != null);
                }
                else {                                  //无参构造器  从小到大排序
                    if (key == null)
                        throw new NullPointerException();
                    @SuppressWarnings("unchecked")
                        Comparable<? super K> k = (Comparable<? super K>) key;
                    do {
                        parent = t;
                        cmp = k.compareTo(t.key);
                        if (cmp < 0)
                            t = t.left;
                        else if (cmp > 0)
                            t = t.right;
                        else
                            return t.setValue(value);
                    } while (t != null);
                }
                Entry<K,V> e = new Entry<>(key, value, parent);
                if (cmp < 0)
                    parent.left = e;
                else
                    parent.right = e;
                fixAfterInsertion(e);
                size++;
                modCount++;
                return null;
            }

         */