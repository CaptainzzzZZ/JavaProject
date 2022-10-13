package TestFunction;

public class TestDemo {
    public static void main(String[] args) {
        Father f1=new Father("123456");
        Father f2=new Father("qiang",35,"987654");
        Father f3=new Father();
        f1.setName("dad");
        f1.setAge(38);
        f1.printInfo();
        f2.printInfo();
        System.out.println(f1);


    }
}
