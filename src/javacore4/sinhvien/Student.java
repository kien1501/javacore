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

    public Student(String id, String name, int age, String email, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gpa = gpa;
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

    public void setAddress(String email) {
        this.email = email;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
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
        email = sc.nextLine();
        System.out.println("Nhập vào điểm của sinh viên: ");
        gpa = Float.parseFloat(sc.nextLine());
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
