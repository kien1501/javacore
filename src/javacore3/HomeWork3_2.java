package javacore3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HomeWork3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng 1: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập vào số thứ "+(i+1)+" :");
            list.add(sc.nextInt());
        }
        System.out.println("Nhập vào độ dài mảng 2: ");
        int m = sc.nextInt();
        for (int i = 0; i <m ; i++) {
            System.out.println("Nhập vào số thứ "+(i+1)+" :");
            list1.add(sc.nextInt());
        }
        result.addAll(list);
        result.addAll(list1);
        System.out.println(list.toString());
        System.out.println(list1.toString());
        Collections.sort(result);
        System.out.println(result.toString());
    }
}
