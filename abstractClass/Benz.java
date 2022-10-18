package abstractClass;

public class Benz extends Car {
    public Benz(String id,int size){
        super(id,size);
    }
    @Override
    public  void printInfo(){
        System.out.println(getId());
        System.out.println(getSize());
    }
    public void printId(){
        System.out.println(getId());
    }
}
