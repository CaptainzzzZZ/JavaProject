package TestFunction;

public class Son extends Father{
    //这里的Son继承了Father的所有属性
    //也可以自己重新创建属性//也就是重写
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("上面是爸爸");
//        System.out.println("我是儿子，我的年龄是"+age+);//这里的age用不了是因为在Father里是private
        System.out.println("我是儿子我的年龄是 "+getAge()+" 我的名字是 "+getName());
        System.out.println(id);
    }
    public Son(String id){
        super(id);
    }
    public static void main(String[] args) {
        Son s1=new Son("654321");
        s1.setAge(18);
        s1.setName("son");
        s1.printInfo();

    }

}
