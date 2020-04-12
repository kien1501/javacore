package javacore3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của chuỗi: ");
        int n= sc.nextInt();
        int[] arr = new  int[n];
        float tb = 0;
        for (int i =0; i<n;i++){
            System.out.print("Nhập số thứ "+(i)+" : ");
            arr[i]= sc.nextInt();
        }
        int dem = 0;
        int tong =0;
//        Tính trung bình cộng các số lẻ ở vị trí chẵn
        for (int i = 0; i <arr.length ; i=i+2) {
            if (arr[i] % 2 != 0){
                tong = tong +arr[i];
                dem++;
                tb= (float) tong/dem;
            }
        }
        System.out.println("Trung bình các số lẻ ở vị chí chẵn là: "+tb);
//        Tìm số lớn nhất trong mảng vừa nhập
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>=max){
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng vừa nhập là: "+max);
//        Tìm vị trí các số nhỏ nhất trong mảng
        int min = arr[0];
        String str="";
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<=min){
                min = arr[i];
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == min){
                str = str +i+ " ";
            }
        }
        System.out.println("vị trí các số nhỏ nhất trong mảng: "+str);
//         Đếm các số chính phương có trong mảng
        int demSoCP = 0;
        for (int i = 0; i <arr.length ; i++) {
            int tem = (int)Math.sqrt(arr[i]);
                if (arr[i] == Math.pow(tem,2)){
                    demSoCP++;
                }
            }
        System.out.println("Số các số chính phương có trong mảng là: "+demSoCP);
//        Hiện thị các số nguyên tố có trong mảng lên màn hình
        String snt = "";
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] ==1 || arr[i] ==2 || arr[i] ==3){
                snt = snt + arr[i]+" ";
            }
            else {
                for (int j = 2; j < Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j != 0) {
                        snt = snt + arr[i] + " ";
                    }
            }
            }
        }
        System.out.println("Các số nguyên tố có trong mảng là: "+snt);
//         Thay thế các phần tử âm có trong mảng bằng giá trị 0
        //        Xóa các phần tử âm có trong mảng
        String soKhongAm ="";
        String khongAm ="";
        int [] arr1 = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]< 0){
                arr1[i] =0;
                soKhongAm = soKhongAm+ arr1[i]+" ";
            }else {
                arr1[i] = arr[i];
                soKhongAm = soKhongAm+ arr1[i]+" ";
                khongAm = khongAm + arr1[i] +" ";
            }
        }
        System.out.println("Các số không âm có trong mảng là: "+soKhongAm);
        System.out.println("Các số dương có trong mảng là: "+khongAm);
//         Sắp xếp mảng đã nhập theo thứ tự giảm dần
        int tem = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] > arr[j]){
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
