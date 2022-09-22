public class Test_9_21 {
    public static void bubble(int arr[],int sz){
        int tmp;
        for (int i = 0; i < sz-1; i++) {
            for (int j = 0; j < sz-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    public static void selSort(int arr[]){
        if(arr==null&&arr.length<2){
            return ;
        }
        int tmp;
        int left=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {

                if(arr[left]>arr[j+1]){
                    left=j+1;
                }
            }
            tmp=arr[i];
            arr[i]=arr[left];
            arr[left]=tmp;
        }

    }
    public static void printArr(int arr[],int sz){
        for (int i = 0; i < sz; i++) {
            System.out.print( arr[i]);
        }
    }
    public static void main(String[] args) {
        int []arr={1,5,6,8,1,2,0,3,2};
        int sz= arr.length;
        selSort(arr);
//        bubble(arr,sz);
        printArr(arr,sz);
    }
}
