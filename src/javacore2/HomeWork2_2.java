package javacore2;

import java.util.Scanner;

public class HomeWork2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển n: ");
        int n = sc.nextInt();
        String str ="";
        while (n>0){
            if (n%2==0){
                str = "0" + str;
            }else {
                str = "1"+str;
            }
            n=n/2;
        }
        System.out.print(str);
    }
}
