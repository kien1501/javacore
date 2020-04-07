package javacore3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] arr1 = new int[n];
        arr1[0]=1;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ "+(i+1)+" :");
            arr[i]= sc.nextInt();
        }
        for (int i = 1; i <n ; i++) {

                if (arr[i]== arr[i-1]+1){
                    arr1[i]= arr1[i-1]+1;
                }else {
                    arr1[i]=0;
                }
        }
//        for (int item: arr1
//             ) {
//            System.out.print(item +"  ");
//        }
        System.out.print(Arrays.toString(arr1));
        int max = 0;
        for (int i = 0; i <arr1.length ; i++) {
            if (arr1[i] >= max){
                max = arr1[i];
            }
        }
        System.out.println("\nĐộ dài chuỗi con liên tục dài nhất là: "+ max);

    }
}
