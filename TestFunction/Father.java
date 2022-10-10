package TestFunction;

//final关键字 放在类中类不可以被继承 放在方法方法不可以被调用 放在变量变量变成常量
public class Father {
    private String name= "000";
    private int age;
    String id;
    public String getName(){
        return this.name;
    }
    public int  getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;

    }
    public void printInfo(){
        System.out.println("这是爸爸");
        System.out.println("age="+age);
        System.out.println("name是"+name);
        System.out.println(id);
    }
    public Father(String id){
        this.id=id;
    }
    public Father(String name,int age,String id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public Father(){

    }

}
