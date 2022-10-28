import java.util.Arrays;

public class TestArrayList {
    private int []elem;
    private int size;
    private static final int capacity=10;
    private boolean isFull(){
//        if(this.size==this.elem.length){
//            return true;
//        }
//        return false;
        return this.size==this.elem.length;
    }

    public TestArrayList() {
        this.elem = new int[capacity];
        this.size = 0;
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
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.elem[i]+" ");
        }
    }
    public int findList(int num){
        for (int i = 0; i < this.size; i++) {
            if(this.elem[i]==num){
                return i;
            }
        }
        return -1;
    }
    public void popList(int pos) {
        for (int i = pos; i < this.size - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.size--;
    }
    public void modifyList(int pos,int num){
        this.elem[pos]=num;
    }
    public static void main(String[] args) {
        TestArrayList arrlist=new TestArrayList();
        arrlist.insert(0,11);
        arrlist.insert(0,22);
        arrlist.insert(0,33);
        arrlist.insert(0,44);
        int pos=arrlist.findList(44);
        arrlist.popList(pos);
        arrlist.modifyList(pos,55);

        arrlist.printList();
    }
}
