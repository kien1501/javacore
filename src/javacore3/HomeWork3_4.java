package javacore3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào số thứ "+(i+1)+" : ");
            arr[i]= sc.nextInt();
        }
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if (arr[i]== arr[j]){
                    arr[i] = 0;
                }
            }
        }
        for (int x:arr
             ) {
            System.out.print(x+" ");
        }
        int dem= 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] ==0){
                dem++;
            }
        }
        System.out.println("\nĐộ dài của chuỗi cần tìm là: " + (arr.length-dem));
    }
}
