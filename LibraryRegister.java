import java.util.HashSet;
import java.util.Scanner;

class UserName{
    private String name;
    private String password;
    private String birth;
    private String tel;
    private String email;

    public UserName() { }
    public UserName(String name, String password, String birth, String tel, String email) {
        this.name = name;
        this.password = password;
        this.birth = birth;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "用户名"+this.name+"  密码"+this.password+"  出生日"+this.birth+"  电话"+this.tel+"  邮箱"+this.email;
    }
}

public class LibraryRegister {
    public static void add(){
        Scanner scanner = new Scanner(System.in);
        UserName userName = new UserName();
        HashSet<Object> hashSet = new HashSet<>();

        String str;
        System.out.println("请输入用户名：");
        str=scanner.next();
        userName.setName(str);
        System.out.println("请输入密码：");
        str= scanner.next();
        while(true){
            System.out.println("请确认密码");
            if (str.equals(scanner.next())){
                userName.setPassword(str);
                break;
            }
            else {
                System.out.println("两次密码不一致，请重新输入");
            }
        }
        while(true){
            System.out.println("请输入出生日期，格式为yyyy-MM-dd");
            str= scanner.next();
            if(str.matches("^([1-9]\\d{3}-)(([0]{0,1}[1-9]-)|([1][0-2]-))(([0-3]{0,1}[0-9]))$")){
                userName.setBirth(str);
                break;
            }
            else {
                System.out.println("格式错误，请重新输入");
            }
        }
        while(true){
            System.out.println("请输入电话");
            str= scanner.next();
            if(str.matches("1[0-9]{10}")){
                userName.setTel(str);
                break;
            }
            else {
                System.out.println("格式错误，请重新输入");
            }
        }
        while(true){
            System.out.println("请输入Email");
            str= scanner.next();
            if(str.matches("\\w+@\\w{2,5}\\.com")){
                userName.setEmail(str);
                break;
            }
            else {
                System.out.println("Email格式错误，请重新输入");
            }
        }

        if(hashSet.add(userName)==false){
            System.out.println("用户存在注册失败");
        }

        else{
            System.out.println("注册成功");
            for (Object o :hashSet) {
                System.out.println(o.toString());
            }

        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("--------1.注册账号--------");
            System.out.println("--------0.退出--------");
            if(scanner.nextInt()==1){
                add();
                break;
            }
            else
                break;
        }
    }
}
