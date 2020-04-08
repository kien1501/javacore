package javacore2;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class HomeWork2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int sum =0;
        int sum2 =0;
        int sum3 =0;
        float average;
        int n = sc.nextInt();
        int a =0;
        int b = 0;
        System.out.println("Thực hiện với for");
        for (int i = 0; i <=n; i++) {
            sum +=i;
            if (i ==n ){
                average = (float)sum/n;
                System.out.println("Tổng Là: "+sum);
                System.out.println("TBC Là: "+average);
            }
        }
        System.out.println("Thực hiện với while");
        while (n>=a){
            sum2+=a;
            if (a==n){
                average = (float)sum2/n;
                System.out.println("Tổng Là: "+sum2);
                System.out.println("TBC Là: "+average);
            }
            a++;
        };
        System.out.println("Thực hiện với do while");
        do {
            sum3 +=b;
            if (b==n){
                average = (float)sum3/n;
                System.out.println("Tổng Là: "+sum3);
                System.out.println("TBC Là: "+average);
            }
            b++;
        }while (b<=n);
    }
}
