package TestClass;

public class Stu2222 {//public的类可以被任何文件下的工程访问
    public  String name;
    int age;
    private void walk(){
        System.out.println("121 121");
    }
    public Stu2222(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {

    }
}
