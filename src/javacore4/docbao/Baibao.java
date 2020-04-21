package javacore4.docbao;

import java.util.Date;
import java.util.Scanner;

public class Baibao {
    private String tieuDe, noiDung, theLoai, tacGia;
    private Date ngayDang;
    public Baibao() {
    }


    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Date getNgayDang() {
        return ngayDang;
    }

    public void setNgayDang(Date ngayDang) {
        this.ngayDang = ngayDang;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tiêu đề: ");
        tieuDe = sc.nextLine();
        System.out.println("Nhập nội dung bai viết: ");
        noiDung = sc.nextLine();
        System.out.println("Nhập tên tác giả: ");
        tacGia = sc.nextLine();
        System.out.println("Nhập thể loại bài viết: ");
        theLoai = sc.nextLine();
        ngayDang = new Date();

    }
    public void hienThi(){
    System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Baibao{" +
                "tieuDe='" + tieuDe + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", ngayDang=" + ngayDang.toString() +
                '}';
    }
}
