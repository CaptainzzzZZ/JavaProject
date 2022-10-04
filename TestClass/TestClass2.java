package TestClass;

public class TestClass2 {
    public static void main(String[] args) {
        Stu s2=new Stu("cpt","2021012711111");//没写就是default 可以作用在整个包；
        s2.name="lzzz";//此处只不可以访问private的age；// 后写的替换前面的 后面优先级高
        s2.printInfo();

    }
}
