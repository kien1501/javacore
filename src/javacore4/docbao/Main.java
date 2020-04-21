package javacore4.docbao;

import javacore4.sinhvien.Student;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Baibao> list = new ArrayList<>();
        int chon;
        do {
            showMenu();
            System.out.print("Chọn số: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    System.out.println("Số tin cần thêm cần thêm: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Baibao bb = new Baibao();
                        System.out.println("Nhập vào thông tin thứ: " + (i + 1));
                        bb.nhap();
                        list.add(bb);
                    }
                    break;
                }
                case 2:{
                    for (int i = 0; i < list.size() ; i++) {
                        System.out.println(list.get(i).getTieuDe()+ " " + list.get(i).getTheLoai());
                    }
                    break;
                }
                case 3:{
                    for (int i = 0; i < list.size() ; i++) {
                        System.out.println(list.get(i).getNoiDung());
                    }
                    break;
                }
                case 4:{
                    System.out.println("Nhập tiêu đề cần xóa: ");
                    String str =sc.nextLine();
                    sc.nextLine();
                    for (int i = 0; i < list.size() ; i++) {
                        if (list.get(i).getTieuDe() == str){
                            list.remove(i);
                        }else {
                            System.out.println("Không có tiêu đề này");
                        }
                    }
                    break;
                }
                case 5:{
                    System.out.println("Nhập tiêu đề cần xóa: ");
                    String theLoai =sc.nextLine();
                    sc.nextLine();
                    for (int i = 0; i < list.size() ; i++) {
                        if (list.get(i).getTieuDe() == theLoai){
                            System.out.println(list.get(i));
                        }else {
                            System.out.println("Không có thể loại cần tìm");
                        }
                    }
                    break;
                }
                case 6:{
                    Date max = list.get(0).getNgayDang();
                    for (int i = 1; i <list.size() ; i++) {
                            if (max.compareTo(list.get(i).getNgayDang()) < 0){
                                max =list.get(i).getNgayDang();
                            }
                    }
                    for (int i = 0; i < list.size() ; i++) {
                        if (max.compareTo(list.get(i).getNgayDang()) == 0){
                            System.out.println(list.get(i));
                        }
                    }
                    break;
                }
                default:
                    System.out.println("Nhập lại: ");
            }
        }
        while (chon != 7);
    }
                public static void showMenu(){
                System.out.println("1. Thêm bài báo: ");
                System.out.println("2. Danh sách các tin: ");
                System.out.println("3. Nội dung bài báo: ");
                System.out.println("4. Xóa tin theo tiêu đề: ");
                System.out.println("5. Tìm bài báo theo thể loại: ");
                System.out.println("6. Tin mới: ");
                System.out.println("7. Đóng: ");
            }
        }
