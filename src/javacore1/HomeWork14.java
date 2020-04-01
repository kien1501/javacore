package javacore1;

import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        long n = sc.nextLong();
        System.out.print("Nhập vào a: ");
        long a = sc.nextLong();
        long t =0;
        String str = "";
        String str1 = "";
        long k = 0;
        for (int i = 1; i <= a; i++) {
            str += n;
            str1 += str + " + ";
            k = Long.parseLong(str);
            t+= k;
        }
        System.out.println("Tổng " + str1.substring(0,  str1.length() - 3) +" = " +t);
    }
}
