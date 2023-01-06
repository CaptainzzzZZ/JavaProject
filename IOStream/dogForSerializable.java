package IOStream;

import java.io.Serializable;

public class dogForSerializable implements Serializable {
    private String name;
    private int age;
    private String color;
    private static final long serialVersionUID = -1L;//提高版本兼容性 新加属性时不会背叛别为一个新的类 而是另一个版本

    public dogForSerializable(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public dogForSerializable() {
    }

    @Override
    public String toString() {
        return "dogForSerializable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
