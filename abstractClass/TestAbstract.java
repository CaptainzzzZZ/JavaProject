package abstractClass;

public class TestAbstract {

    public static void main(String[] args) {
        Car car=new Benz("856",100);//此时时向上转型
        System.out.println(car.getSize());//此时car这个引用变量调用的方法是子类继承或覆盖的方法
//        car.printId()                   // 此时car这个父类引用变量不可以调用子类独有的方法
        ///先 向上转型 再 向下转型 就可以访问子类自己的独有方法了
        Benz benz=(Benz) car;//此处为向下转型
        System.out.println(car.getId());
    }
}
