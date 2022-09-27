/**
 *
 */
public class Array {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();

    }
    public static int getMaxArr(int arr[]){
        int max=0;
        for (int i = 0; i < arr.length;i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void bubbleSort(int arr[]){
        int tmp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={9,5,6,3,4,5,0,1};//arr变量在栈上（这个地址拿不到）{对象}在堆上
        printArr(arr);
        int max=getMaxArr(arr);
        System.out.println("max="+max);
        bubbleSort(arr);
    }
}
