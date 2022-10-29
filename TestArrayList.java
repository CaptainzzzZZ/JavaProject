import java.util.Arrays;

public class TestArrayList {
    private int []elem;
    private int size;
    private static final int capacity=10;

    public TestArrayList() {
        this.elem = new int[capacity];
        this.size = 0;
    }
    private boolean isFull(){
//        if(this.size==this.elem.length){
//            return true;
//        }
//        return false;
        return this.size==this.elem.length;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public void insert(int pos,int num){
        //判断顺序表是否满
        if(isFull()){
            Arrays.copyOf(this.elem,this.elem.length*2);//顺序表扩容
        }
        if(pos>this.size||pos<0){
            return ;
        }
        if(this.size==0){
            this.elem[pos]=num;
        }
        for (int i = this.size-1; i >= pos; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=num;
        this.size++;
    }
    public void printList(){
//        for (int i = 0; i < this.size; i++) {
//            System.out.print(this.elem[i]+" ");
//        }
        System.out.println(Arrays.toString(this.elem));
    }
    public int findList(int num){
        for (int i = 0; i < this.size; i++) {
            if(this.elem[i]==num){
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos){
        if(elem==null){
            throw new RuntimeException("pos位置不合法");
        }
        if(pos<0||pos>=this.size){
            throw new RuntimeException("pos位置不合法");

        }
        return this.elem[pos];
    }

    public void popList(int pos) {
        for (int i = pos; i < this.size - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.size--;
    }
    public void modifyList(int pos,int num){
        if(elem==null){
            throw new RuntimeException("pos位置不合法");
        }
        if(pos<0||pos>=this.size){
            throw new RuntimeException("pos位置不合法");
        }
        this.elem[pos]=num;
    }
    public static void main(String[] args) {
        TestArrayList arrlist=new TestArrayList();
        arrlist.insert(0,44);
        arrlist.insert(0,11);
        arrlist.insert(0,22);
        arrlist.insert(0,33);

        int pos=arrlist.findList(44);
        arrlist.popList(pos);
        arrlist.printList();
    }
}
