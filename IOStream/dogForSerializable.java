package IOStream;

import java.io.Serializable;

public class dogForSerializable implements Serializable {
    private String name;
    private int age;
    private transient int len;// transient 是禁止序列化的关键字
    private static final long serialVersionUID = -1L;//提高版本兼容性 新加属性时不会背叛别为一个新的类 而是另一个版本

    public dogForSerializable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "dogForSerializable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
