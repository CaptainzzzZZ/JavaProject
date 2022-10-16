package TestFunction;

//final关键字 放在类中类不可以被继承 放在方法方法不可以被调用 放在变量变量变成常量
public class Father {
    private String name= "000";
    private int age;
    String id;
    //自动填入alt+insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override//这里重写了  Object类的toString()方法
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
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
<<<<<<< HEAD
=======



>>>>>>> 0b7489d5eedc6d4f3cbb3e8d41db33ccc4a44762
}
