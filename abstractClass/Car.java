package abstractClass;

public abstract class Car {
    private String id;
    private int size;
    public Car(String id,int size){
        this.size=size;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public abstract void printInfo();
}
