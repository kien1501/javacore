package javacore4.docbao;

public class Danhmuc {
    private String tenDanhMuc;
    private int ms;

    public Danhmuc() {
    }

    public Danhmuc(String tenDanhMuc, int ms) {
        this.tenDanhMuc = tenDanhMuc;
        this.ms = ms;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }
}
