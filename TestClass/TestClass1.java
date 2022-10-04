package TestClass;
class Stu{
    //以下声明都是这个类中的属性
    public static String id;
    String name;//不写默认是default,,作用域是这个包
    private  int age;//只能在这个类中作用
    protected String sex;//protected修饰的成员（下文中的成员统一指代
    // 字段和方法）允许同包下的类和不同包的子类访问。
    public void run(){//可以在此工程下的所有包；；前提是他的类是public
//        public  name;//在属性中不可以自定义访问权限
        System.out.println("go go");
    }
    void getName(String name){
        this.name=name;
        System.out.println(name);
    }
    public  Stu(String name,int age){//构造方法 没有返回值类型 给类中属性初始化
        this.name=name;
        this.age = age;
    }
    public Stu(String name,String id){
        this.name=name;
        this.id=id;
    }
    public Stu(){
        //空类型 未初始化
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
    }
    static void printStuID(){
        System.out.println(id);
    }
}

public class TestClass1 {
    public static void main(String[] args) {
        Stu s1=new Stu("zzl",22);//s1就是新创建的对象
        s1.printInfo();
        Stu s3=new Stu("lzzzzzzz",26);
        s3.printInfo();
        Stu s2=new Stu("captainzzzzz","202101271111");     //对象s2赋值为空
        //对象中可以使用static的属性 但是static的方法或者对象只能使用static的属性
        s2.printInfo();
        Stu.printStuID();//直接输出s2给的id
        s1.name="zz";
//        s1.age=18;//因为他是private;
        s1.run();
        s1.getName("lzz");//直接替换上面的name；
//        static String lzz="sb";//在Java中不允许使用static修饰局部变量

    }

}
