package javacore2;

import java.util.Scanner;

public class HomeWork2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        int b = 0;
        for (int i = 0; i < str.length() ; i++) {
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            b = (int) (b + a*Math.pow(2,str.length()-(i+1)));
        }
        System.out.println("Số cần tìm là: "+b);
    }
}
