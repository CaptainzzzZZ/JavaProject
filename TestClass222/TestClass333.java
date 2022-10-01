package TestClass222;

//import TestClass.Stu;
import TestClass.Stu2222;

public class TestClass333 {
    public static void main(String[] args) {
//        Stu s3=new Stu();//因为Stu是default的只能在自己的包中被访问
        Stu2222 s3333=new Stu2222();//此时可以访问是因为Stu2222是一个public的类
        //想要访问其它类中的对象  首先这个类的等级要高于他的对象等级！
        s3333.name="lllzzz";//先要访问到Stu2222中的name不仅类要是public
        //他的对象也必须是public
    }
}
