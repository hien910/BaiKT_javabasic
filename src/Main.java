import logic.BanHangLogic;
import logic.HangLogic;
import logic.NhanVienLogic;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final NhanVienLogic nhanVienLogic=new NhanVienLogic();
    private static final HangLogic hangLogic = new HangLogic();
    private static final BanHangLogic banHangLogic = new BanHangLogic(nhanVienLogic, hangLogic);
    public static void main(String[] args) {
        while (true){
            printMenu();
            int chooseFuntion = chooseFunction();
            switch (chooseFuntion){
                case 1:
                    hangLogic.inputHang();
                    hangLogic.showHang();
                    break;
                case 2:
                    nhanVienLogic.inputNhanVien();
                    nhanVienLogic.showNhanVien();
                    break;
                case 3:
                    banHangLogic.setBanHangs();
                    break;
                case 4:
                    banHangLogic.sortByName();
                    break;
                case 5:
                    banHangLogic.sortByItem();
                    break;
                case 6:
                    break;
                case 7:
                    return;

            }

        }

    }

    private static void printMenu() {
        System.out.println("--------------------------");
        System.out.println("1. Nhập danh sách mặt hàng mới, in ra danh sách");
        System.out.println("2. Nhập danh sách nhân viên mới, in ra danh sách");
        System.out.println("3. Nhập bảng danh sách bán hàng, in ra danh sách");
        System.out.println("4. Sắp xếp danh sách Bảng danh sách bán hàng theo tên nhân viên và in ra danh sách");
        System.out.println("5. Sắp xếp danh sách Bảng danh sách bán hàng theo nhóm mặt hàng và in ra danh sách");
        System.out.println("6. Lập bẳng kế doanh thu cho mỗi nhân viên và in ra danh sách");
        System.out.println("7. Thoát");
    }
    private static int chooseFunction() {
        System.out.println("Xin mời lựa chọn chức năng: ");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 7) {
                break;
            }
            System.out.println("Chức năng không hợp lệ, vui long chọn lại");
        } while (true);
        return functionChoice;
    }
}