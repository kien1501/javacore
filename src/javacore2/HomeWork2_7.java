package javacore2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeWork2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển n: ");
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        int k =0;
        while (n!=0){
            if (n%16 <= 9){
                list.add(""+n%16);
            }else if (n%16 == 10){
                list.add("A");
            }else if (n%16 == 11){
                list.add("B");
            }else if (n%16 == 12){
                list.add("C");
            }else if (n%16 == 13){
                list.add("D");
            }else if (n%16 == 14){
                list.add("E");
            }else {
                list.add("F");
            }
            k++;
            n/=16;
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i));
        }
    }
}
