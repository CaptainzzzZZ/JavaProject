import java.util.*;


class Book{
    private String name;
    private String publish;
    private double price;
    private int number;

    public Book() {

    }

    public Book(String name, String publish, double price, int number) {
        this.name = name;
        this.publish = publish;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
public class LibraryManage {
    static ArrayList arrayList=new ArrayList();
    public static void menu(){
        System.out.println("欢迎使用图书库房管理系统，请选择要进行的操作");
        System.out.println("0.退出系统");
        System.out.println("1.商品入库");
        System.out.println("2.商品显示");
        System.out.println("3.删除商品");
    }
    public static void add(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            String flag="yes";
            System.out.println("你是否录入图书？");
            String flagIn= scanner.nextLine();
            if(flag.equals(flagIn)){
                System.out.println("请输入图书名称：");
                String name= scanner.nextLine();
                System.out.println("请输入图书出版社：");
                String publish= scanner.nextLine();
                System.out.println("请输入图书的价格：");
                double price= scanner.nextDouble();
                System.out.println("请输入图书的数量");
                int number = scanner.nextInt();
                arrayList.add(new Book(name,publish,price,number));
                break;
            }
            else {
                break;
            }
        }
    }
    public static void print(){
        Iterator<Book> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Book b=iterator.next();
            System.out.println(b.getName()+"..."+b.getPublish()+"..."+b.getPrice()+"元..."+b.getNumber()+"本");
        }

    }
    public static void del(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的编号");
        int index= scanner.nextInt();
        if (index<=arrayList.size()){
            arrayList.remove(index-1);
        }
        else {
            System.out.println("图书系统没有此编号");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do
        {
            menu();
            input= scanner.nextInt();
            switch (input){
                case 1:add();print();
                break;
                case 2:print();break;
                case 3:del();break;
            }
        }while(input!=0);
    }
}
