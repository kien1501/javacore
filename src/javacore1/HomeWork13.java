package javacore1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n= sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i =1;i <=n;i++){
            for (int j = 1; j <=10 ; j++) {
                list.add(i + " x "+j+ " = " + i*j);
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
