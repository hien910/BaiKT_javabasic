package entity;

import constant.Type;

import java.util.Scanner;

public class NhanVien extends Person {
    private int id;
    private static int id_auto =1000;
    private String ngayKy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getId_auto() {
        return id_auto;
    }

    public static void setId_auto(int id_auto) {
        NhanVien.id_auto = id_auto;
    }

    public String getNgayKy() {
        return ngayKy;
    }

    public void setNgayKy(String ngayKy) {
        this.ngayKy = ngayKy;
    }

    public NhanVien() {
        this.id = id_auto;
        id_auto++;
    }

    @Override
    public String toString() {
        return "nhanVien{" +
                "id=" + id +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", ngayKy='" + ngayKy + '\'' +
                '}';
    }
    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhập ngày ký hợp đồng");
        this.setNgayKy(new Scanner(System.in).nextLine());
    }
}
