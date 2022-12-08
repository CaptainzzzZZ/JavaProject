package Collections;

import java.util.HashSet;
import java.util.Objects;

class Employee{
    private String  name;
    private String salary;
    private MyDate birth;

    public Employee(String name, String salary, MyDate date) {
        this.name = name;
        this.salary = salary;
        this.birth = date;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public MyDate getBirth() {
        return birth;
    }

    public void setBirth(MyDate date) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "名字" + name  +
                ", 工资" + salary  +
                ", 生日" + birth  +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName()) && Objects.equals(getBirth(), employee.getBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirth());
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return this.year+"-"+this.month+"-"+this.day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;
        MyDate myDate = (MyDate) o;
        return getYear() == myDate.getYear() && getMonth() == myDate.getMonth() && getDay() == myDate.getDay();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getMonth(), getDay());
    }
}
public class Hashset_ {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<Object>();
        MyDate date = new MyDate(1980, 1, 1);
        Employee lzz1 = new Employee("lzz", "5555", date);
        HashSet hashSet1 = new HashSet<Object>();
        hashSet1.add(lzz1);
        hashSet1.add(new Employee("lzz","6666",new MyDate(2000,2,2)));
        hashSet1.add(new Employee("lzz","7777",new MyDate(2000,2,2)));
        hashSet1.add(new Employee("lzz","6666",new MyDate(1980,1,1)));
        hashSet1.add(new Employee("lzz","8888",new MyDate(2000,3,3)));


        System.out.println(hashSet1);
    }
}
