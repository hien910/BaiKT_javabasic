package logic;

import entity.Hang;
import entity.NhanVien;

import java.util.Scanner;

public class NhanVienLogic {
    private static NhanVien[] nhanViens = new NhanVien[100];

    public static NhanVien[] getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public static void inputNhanVien(){
        System.out.println("Nhập số lượng nhân viên mới:");
        int numberNhanVien =  new Scanner(System.in ).nextInt();
        for (int i = 0; i < numberNhanVien; i++) {
            System.out.println("nhập thông tin cho nhân viên thứ" +(i+1));
            NhanVien nhanVien = new NhanVien();
            nhanVien.inputInfo();
            saveNhanVien(nhanVien);
        }
    }
    private static void saveNhanVien(NhanVien nhanVien){
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i]== null){
                nhanViens[i]=nhanVien;
                break;
            }
        }
    }
    public static void showNhanVien(){
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i]!= null){
                System.out.println(nhanViens[i]);
            }
        }
    }
    public NhanVien searchIdNhanVien(int id){
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i].getId()==id){
                return nhanViens[i];
            }
        }
        return null;
    }
}
