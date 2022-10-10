package TestFunction;

public class Son extends Father{
    //这里的Son继承了Father的所有属性
    //也可以自己重新创建属性//也就是重写
    @Override
    public void printInfo(){
        super.printInfo();
        //上面是调用父类的方法
        //下面是重写
        System.out.println("上面是爸爸");
//        System.out.println("我是儿子，我的年龄是"+age+);//这里的age用不了是因为在Father里是private
        System.out.println("我是儿子我的年龄是 "+getAge()+" 我的名字是 "+getName());
        System.out.println(id);
    }
    public Son(String id){
        super(id);
    }
    public Son(String name,int age,String id){
        super(name, age, id);
    }
    public Son(){
        //当你没写构造方法时他会自己给你一个空的构造方法
        //只要你自己开始写了一个当需要创建一个空对象时你就需要自己写一个空的构造方法
        super();
    }
    public static void main(String[] args) {
        Son s1=new Son("654321");
        Son s2=new Son("sonn",16,"123321");
        Son s3=new Son();

        s1.setAge(18);
        s1.setName("son");
        s1.printInfo();
        s2.printInfo();

    }

}
