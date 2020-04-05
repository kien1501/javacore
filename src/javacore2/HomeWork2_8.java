package javacore2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = sc.nextInt();
        System.out.print("Nhập vào số k: ");
        int k = sc.nextInt();
        int a = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=k ; i++) {
            list.add(n);
        }
        for (int i = 0; i <list.size() ; i++) {
            a= a+ list.get(i);
        }
        System.out.println(a);
    }
}
