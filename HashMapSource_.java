package Map_;

import java.util.HashMap;
import java.util.Objects;

class Book{
    private int num;

    public Book(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
public class HashMapSource_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,"111");
        hashMap.put(2,"222");
        hashMap.put(3,"333");
        hashMap.put(4,"444");
        //1.put()、putval()底层源码
        /*
        public V put(K key, V value) {
            return putVal(hash(key), key, value, false, true);
                                                                            //hash()返回key的hash值
        }

        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;                    //如果table长度为零那就用resize()扩容第一次扩容为16；

                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);       //如果当前节点是空，那就直接newnode放进去；
                else {
                    Node<K,V> e; K k;
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;                                  //如果当前要进去的keyhash==原来hash并且他们两个的key值还相同那就放不进去  转到下面把value替换
                    else if (p instanceof TreeNode)             //如果当前节点的链表已经树化 那就直接执行树的操作
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {
                        for (int binCount = 0; ; ++binCount) {  //
                            if ((e = p.next) == null) {
                                p.next = newNode(hash, key, value, null);    //如果当前key和链表每一个都不相同那就再last接上一个newnode
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);                  //table>=64&&链表大于8就会树化成为一颗红黑树
                                break;
                            }
                            if (e.hash == hash &&                          //如果当前key和链表有相同那就去下面替换
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;                            //替换
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                if (++size > threshold)
                    resize();                                            //table大小如果大于阈值（x*0.75）就会直接扩容
                afterNodeInsertion(evict);
                return null;
            }
         */
        HashMap hashMap1 = new HashMap();
        for (int i = 0; i < 100; i++) {
            hashMap1.put(new Book(i),i);
        }

        //2.treeifyBin()树化成红黑树的底层源码
        /*
        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
            treeifyBin(tab, hash);
            break;
        if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
            resize();
            //如果链表长度大于8并且table长度resize到了64就会触发树化
         */

    }
}
