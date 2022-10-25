public class TestDomePolym {
    public static void main(String[] args) {
        Animal a=new Cat("蓝猫");
        Feeder feeder=new Feeder("Jack");
        Food food=new Fish("小鱼干");
        feeder.show(a,food);
        Cat cat=(Cat)a;
        cat.printInfo();
    }
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void eat(Food food);
    public abstract void shout();
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void eat(Food food){
        System.out.println("我为的小动物是"+this.getName()+" 她吃的是 "+food.getFood(food));
    }
    public void shout(){
        System.out.println("咪咪咪");
    }
    public void printInfo(){
        System.out.println("我是一个额外的方法，我只能向下转型后被调用");
    }
}
interface Food{
    String getFood(Food food);
}
class Fish implements Food{
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFood(Food food) {
        return this.name;
    }
}
class Feeder{
    private  String name;

    public Feeder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(Animal a,Food food){
        System.out.println("我为的小动物是"+a.getName()+" 她吃的是 "+food.getFood(food));
        a.eat(food);
    }
}
