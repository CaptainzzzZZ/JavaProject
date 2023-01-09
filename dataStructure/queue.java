package dataStructure;

public class queue {
    public static void main(String[] args) {

    }
}
class circleQueue{
    private int capacity;
    private int[] arr=new int[capacity];
    private int front=0;//就指向第一个位置
    private int rear=0;//指向队尾后一个

    public circleQueue(int capacity) {
        this.capacity = capacity;
    }

    public void addQueue(){}
    public int getQueue() {return arr[front];}
    public void popQueue(){}
    public int sizeQueue(){return (front+capacity-rear)%capacity;}


}
