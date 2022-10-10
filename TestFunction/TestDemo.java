package TestFunction;

public class TestDemo {
    public static void main(String[] args) {
        Father f1=new Father("123456");
        Father f2=new Father("addad0",35,"987654");
        f1.setName("dad");
        f1.setAge(38);
        f1.printInfo();
        f2.printInfo();


    }
}
