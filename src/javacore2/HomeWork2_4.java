package javacore2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài chuỗi: ");
        int n = sc.nextInt();
        List<Integer>list = new ArrayList<>();
        int a = 0;
        int b = 1;
        list.add(a);
        list.add(b);
        for (int i = 2; i <n ; i++) {
            int c = a+b;
            a=b;
            b=c;
            list.add(b);
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }


    }
}
