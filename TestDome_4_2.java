package InterfaceClass;

public class TestDome_4_2 {
    public static void main(String[] args) {
        Dog d1=new Dog("lzzz");
        Animal a1=new Dog("zzzl");
        Feeder f1=new Feeder("jack");
        f1.introduce();
    }
}
 abstract class Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  Animal(String name){
        this.name=name;
    }
    public abstract void shout();
    public abstract void eat();

}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }

    @Override
    public void eat() {
        System.out.println("我是狗我爱吃骨头");
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }

    @Override
    public void eat() {
        System.out.println("我是狗我爱吃鱼");
    }
}
class Feeder{
    private String name;
    public Feeder(String name){
        this.name=name;
    }
    public void introduce(){
        System.out.println("我是饲养员 "+this.name);
    }
    public void feed(Animal a){
    a.eat();
    a.shout();
    }
}