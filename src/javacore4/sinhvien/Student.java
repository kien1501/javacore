package javacore4.sinhvien;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String email;
    private float gpa;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@")&& !email.contains(" ")){
        this.email = email;
        return true;
        }else {
            System.out.println("Nhập lại: ");
            return false;
        }
    }

    public float getGpa() {
        return gpa;
    }

    public boolean setGpa(float gpa) {
        if (gpa >=0 && gpa <=10 ){
            this.gpa = gpa;
            return true;
        }else {
            System.out.println("Nhập lại: ");
            return false;
        }
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id của sinh viên: ");
        id = sc.nextLine();
        System.out.println("Nhập vào tên của sinh viên: ");
        name = sc.nextLine();
        System.out.println("Nhập vào tuổi của sinh viên: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào email của sinh viên: ");
        while (true){
            boolean check = setEmail(sc.nextLine());
            if (check){
                break;
            }
        }
        System.out.println("Nhập vào điểm của sinh viên: ");
        while (true){
            boolean check = setGpa(Float.parseFloat(sc.nextLine()));
            if (check){
                break;
            }
        }
//        gpa = Float.parseFloat(sc.nextLine());
    }
    public void display(){
        toString();
    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + email + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
