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
        String str = "";
//        List<String> list = new ArrayList<>();
        int k =0;
        while (n!=0){
            if (n%16 <= 9){
                str = str +n%16;
//                list.add(""+n%16);
            }else if (n%16 == 10){
                str = str +"A";
//                list.add("A");
            }else if (n%16 == 11){
                str = str +"B";
//                list.add("B");
            }else if (n%16 == 12){
                str = str +"C";
//                list.add("C");
            }else if (n%16 == 13){
                str = str +"D";
//                list.add("D");
            }else if (n%16 == 14){
                str = str +"E";
//                list.add("E");
            }else {
                str = str +"F";
//                list.add("F");
            }
            k++;
            n/=16;
        }
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());
//        for (int i = list.size()-1; i >=0 ; i--) {
//            System.out.print(list.get(i));
//        }
    }
}
