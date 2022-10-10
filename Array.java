import java.util.Arrays;

/**
 * Arrays.常用方法
 * toString() copyOf() binarySearch()
 * equals(arr1,arr2)  fill(arr,[2,5),val)
 * copyOfRange(arr1,[2,5))
 * sort(arr)
 */
public class Array {
    public static void printArr(int []arr){
        for (int x: arr) {
            System.out.print(x);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void swap(int arr[]){
        int tmp=arr[0];
        arr[0]=arr[1];
        arr[1]=tmp;
    }
    public static int[] transform(int arr2[]){
        int []ret=new int[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            ret[i]=arr2[i]*2;
        }
        return ret;
    }
    public static int[] copyArr(int arr[]){
        int [] newarr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i]=arr[i];
        }
        return  newarr;
    }
    public static int Binary_search(int arr[],int key){
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid=(left+right)>>>1;//等于除2
            if(arr[mid]<key){
                left=mid+1;
            }
            else if(arr[mid]>key){
                right=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static boolean isUp(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[i+1]){
                return true;
            }
        }
        return false;

    }
    public static  void printArr2(int arr[][]){
        //打印二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for ( int [] tmp :arr  )  {
            for (int x: tmp) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int []arr1={3,6,9,12,15,18,20};
        boolean ret = isUp(arr1);

        int [][]arr2 = {{1,2,3},{4,5,6}};
        printArr2(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.deepToString(arr2));
        int [][]arr3=new int[2][];//////不规则二维数组//必须指定行！！
        arr3[0]=new int[]{1,2,3};
        arr3[1]=new int[]{0,1,2,3};
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.deepToString(arr3));
    }
    public static void main2(String[] args) {
        int []arr1={3,6,9,12,15,18,20};
        int []arr2={1,2,3,4,5,6};
        int ret = Binary_search(arr1,18);
        System.out.println("找到了下表为："+ret);
        System.out.println(Arrays.binarySearch(arr1,18));
        System.out.println(Arrays.equals(arr1, arr2));
        Arrays.fill(arr1,2,5,0);
        System.out.println(Arrays.toString(arr1));
        int []destArr1=Arrays.copyOfRange(arr1,2,5);
        System.out.println(Arrays.toString(destArr1));
        Arrays.sort((arr1));//  快速排序
        System.out.println(Arrays.toString(arr1));


    }
    public static void  main1(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr3 = new int[2];
        arr3[0] = 1;
        arr3[1] = 2;
        printArr(arr1);
        String ret = Arrays.toString(arr1);
        System.out.println(ret);
        //三种遍历数组的方式
        printArr(arr3);
        swap(arr3);
        printArr(arr3);
        int[] arr4 = transform(arr2);//数组的变换
        ret = Arrays.toString(arr4);
        System.out.println(ret);
        int[] arr5=copyArr(arr1);    //数组的拷贝
        ret = Arrays.toString(arr5);
        System.out.println(ret);
    ////本地方法的数组拷贝
        int []newcopy = new int[arr1.length];
        System.arraycopy(arr1,0,newcopy,0,arr1.length);
        System.out.println("本地方法System.arraycopy拷贝"+Arrays.toString(newcopy));
        newcopy=Arrays.copyOf(newcopy,arr1.length);
        System.out.println("方法Arrays.copyOf拷贝"+Arrays.toString(newcopy));
        newcopy=arr1.clone();
        System.out.println("方法arr1.clone()拷贝"+Arrays.toString(newcopy));
        //这四种都浅拷贝 修改拷贝数组之后会影响原数组元素
        //浅拷贝是指对对象引用的复制。引用指向的元素修改会影响原数组元素
    }
}
