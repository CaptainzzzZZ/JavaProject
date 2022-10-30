
class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class TestSingleList {
    public Node head;
    public void addFristList(int val){
        Node newnode = new Node(val);
        if(this.head==null){
            this.head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void  addBackList(int val){
        Node newnode=new Node(val);
        if(this.head==null){
            this.head=newnode;
            return ;
        }
        Node cur=this.head;
        while(this.head.next!=null){
            this.head=this.head.next;
        }
        this.head.next=newnode;
        this.head=cur;
    }
    public void insertList(Node pos,int val){
        Node newnode=new Node(val);
        newnode.next=pos.next;
        pos.next=newnode;

    }
    public void printList(){

        Node cur=this.head;
        while(cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }
    public void popFristList(){
        if(this.head==null){
            return ;
        }
        if(this.head.next==null){
            this.head=null;
        }
        this.head=this.head.next;
    }
    public void popBackList(){
        if(this.head==null){
            return ;
        }
        if(this.head.next==null){
            this.head=null;
        }
        Node cur=this.head;
        Node next=this.head.next;
        while(next.next!=null){
            cur=cur.next;
            next=next.next;
        }
        cur.next=null;
    }
    public void eraseList(Node pos){
        if(pos==null){
            return ;
        }
        if(pos==head){
            this.head=this.head.next;
            return;
        }
        Node cur=head;
        while (cur.next != pos) {
                cur = cur.next;
        }
        if(pos.next==null){
            cur.next=null;
        }
        else{
            cur.next=pos.next;

        }
    }
    public Node findList(int val){
        if(this.head==null){
            return null;
        }
        Node cur=this.head;
        while(cur!=null){
            if(cur.val==val){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    public int sizeList(){
        if(this.head==null){
            return 0;
        }
        Node cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public void modifyList(Node pos ,int val){
        if(pos==null){
            return ;
        }
        Node cur=this.head;
        while(cur!=pos){
            cur=cur.next;
        }
        cur.val=val;
    }
    public static void main(String[] args) {
        TestSingleList sl=new TestSingleList();
        sl.addFristList(11);
        sl.addFristList(22);
        sl.addFristList(33);
        sl.addFristList(44);
        sl.addFristList(55);
        sl.addFristList(66);
        Node pos=sl.findList(44);
        sl.modifyList(pos,444);
        sl.printList();
        System.out.println(sl.sizeList());
    }
}
