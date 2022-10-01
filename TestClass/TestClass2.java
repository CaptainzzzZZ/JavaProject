package TestClass;

public class TestClass2 {
    public static void main(String[] args) {
        Stu s2=new Stu();//没写就是default 可以作用在整个包；
        s2.name="lzzz";//此处只不可以访问private的age；


    }
}
