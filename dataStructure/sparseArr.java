package dataStructure;

import java.io.*;

public class sparseArr {
    public static void main(String[] args) throws IOException {
        int[][] ints = new int[5][5];
        ints[2][1]=1;
        ints[4][0]=2;
        int sum=0;
        for (int[] row :ints) {
            for (int col :row) {
                if (col!=0){
                    sum++;
                }
                System.out.print(col+"  ");
            }
            System.out.println();
        }
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0]=5;
        sparseArr[0][1]=5;
        sparseArr[0][2]=sum;
        int count=1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (ints[i][j]!=0){
                    sparseArr[count][0]=i;
                    sparseArr[count][1]=j;
                    sparseArr[count][2]=ints[i][j];
                    count++;
                }
            }
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("e:\\sparseArr.txt"));
        for (int[] row :sparseArr) {
            for (int col :row) {
                System.out.print(col+" ");
                bufferedWriter.write(col+" ");
            }
            System.out.println();
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
