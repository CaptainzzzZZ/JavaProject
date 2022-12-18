package Collections;

import java.util.LinkedHashSet;
import java.util.Objects;

class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name+"价格"+this.price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getPrice() == car.getPrice() && Objects.equals(getName(), car.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }
}
public class Linkedhashset_ {
    public static void main(String[] args) {
        LinkedHashSet<Object> objectLinkedHashSet = new LinkedHashSet<>();
        objectLinkedHashSet.add(new Car("lixiang",18));
        objectLinkedHashSet.add(new Car("weilai",25));
        objectLinkedHashSet.add(new Car("wuling",4));
        objectLinkedHashSet.add(new Car("wuling",4));
        System.out.println(objectLinkedHashSet);
    }
}
