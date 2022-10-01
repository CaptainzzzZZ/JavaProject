package TestClass;
class Stu{
    String name;//不写默认是default,,作用域是这个包
    private  int age;//只能在这个类中作用
    protected String sex;//protected修饰的成员（下文中的成员统一指代
    // 字段和方法）允许同包下的类和不同包的子类访问。
    public void run(){//可以在此工程下的所有包；；前提是他的类是public
        System.out.println("go go");
    }
    void getName(String name){
        this.name=name;
        System.out.println(name);
    }

}
public class TestClass1 {
    public static void main(String[] args) {
        Stu s1=new Stu();
        s1.name="zz";
//        s1.age=18;//因为他是private;
        s1.run();
        s1.getName("lzz");//直接替换上面的name；

    }

}
