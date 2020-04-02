package javacore2;

import java.util.Scanner;

public class HomeWork2_3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhập giới hạn: ");
        int n = sc.nextInt();
        System.out.println("Bội số của 3 Là: ");
        for (int i = 0; i <n ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nBội số của 5 Là: ");
        for (int i = 0; i < n; i++) {
            if (i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nBội số của 3 và 5 Là: ");
        for (int i = 0; i < n; i++) {
            if (i%5==0 && i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
