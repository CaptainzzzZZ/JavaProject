package InterfaceClass;

public class IntfaceDome {
    public static void main(String[] args) {
        interImpl inter1=new interImpl();
        inter1.bark();
        System.out.println(interImpl.age);
    }
}

interface dog{
    public abstract void eat();
    public abstract void bark();
    int age=4;       //默认加上了public static final 成为一个静态常量
}
interface cat{
    void eat();
    void bark();
}
interface animal extends dog,cat{
    //eat();bark();
    void sleep();
}
class interImpl implements animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉 猫吃鱼");
    }

    @Override
    public void bark() {
        System.out.println("狗旺旺，猫咪咪");
    }
    public void sleep(){
        System.out.println("狗呼呼，猫噜噜");
    }
}
