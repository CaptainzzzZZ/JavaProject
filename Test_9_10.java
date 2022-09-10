public class Test_9_10 {
//    public static void main(String[] args) {
//        int i;
//        int j;
//        int temp;
//        int []arr={3,5,6,2,4,8};
//        for(i=0;i< arr.length-1;i++) {
//            for (j=0;j< arr.length-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        for(i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }

    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,8,9};
        int key=6;
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]>key)
                right=mid-1;
            else if (arr[mid]<key) {
                left=mid+1;
            }
            else{
                System.out.println("找到了下标是"+mid);
                break;
            }
        }
    }

//    public static void main(String[] args) {
//        int max=Integer.MAX_VALUE+1;//最大值+1变成最小值
//        System.out.println(max);
//    }
}
