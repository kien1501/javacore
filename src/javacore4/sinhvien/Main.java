package javacore4.sinhvien;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int choose;
        do {
            showMenu();
            System.out.println("choose");
            choose = sc.nextInt();
            switch (choose){
                case 1:{
                    System.out.println("Số lượng sinh viên cần thêm: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n ; i++) {
                        Student student = new Student();
                        student.input();
                        list.add(student);
                    }
                }
                break;
                case 2:{
                    for (Student item:list
                         ) {
                        System.out.println(item);
                    }
                }
                break;
                case 3:{
                    Student min = new Student();
                    for (int i = 1; i <list.size() ; i++) {
                        for (int j = 0; j <i ; j++) {
                        if (list.get(i).getGpa() <list.get(j).getGpa()) {
                            min = list.get(i);
                            list.set(i,list.get(j));
                            list.set(j,min);
                        }
                        }
                    }
                    break;
                }
                case 4:
                    break;
                default:{
                    System.out.println("Nhập lại: ");
                }
            }
        }while (choose!=4);
    }
    public static void showMenu(){
        System.out.println("1.Nhập vào thông của sinh viên: ");
        System.out.println("2.Hiểm danh sách của sinh viên: ");
        System.out.println("3.Sắp sếp thông tin theo điểm: ");
        System.out.println("4.Đóng ");

    }
}
