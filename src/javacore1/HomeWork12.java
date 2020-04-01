package javacore1;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào số b: ");
        int b =sc.nextInt();
        System.out.println(a+" +"+" b" + " = "+(a+b));
        System.out.println(a+" -"+" b" + " = "+(a-b));
        System.out.println(a+" x"+" b" + " = "+(a*b));
        System.out.println(a+" /"+" b" + " = "+(a/b));
        System.out.println(a+" mod" +" b" + " = "+(a%b));
    }
}
