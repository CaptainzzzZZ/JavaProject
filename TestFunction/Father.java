package TestFunction;

public class Father {
    private String name;
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

}
