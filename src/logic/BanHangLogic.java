package logic;

import entity.BanHang;
import entity.Hang;
import entity.HangHoa;
import entity.NhanVien;

import java.util.Scanner;

public class BanHangLogic {
    private static HangLogic hangLogic;
    private static NhanVienLogic nhanVienLogic ;
    private static  BanHang[] banHangs = new BanHang[1000];
    private static final BanHangLogic banHangLogic = new BanHangLogic(nhanVienLogic, hangLogic);

    public BanHangLogic(NhanVienLogic nhanVienLogic, HangLogic hangLogic) {
       this.hangLogic = hangLogic;
       this.nhanVienLogic = nhanVienLogic;
    }


    public static void setBanHangs() {
        if (codulieuchua()){
            System.out.println("chưa có thông tin, vui long nhập lại");
        }
        System.out.println("Có bao nhiêu nhân viên bán hàng");
        int numNhanVien = new Scanner(System.in).nextInt();
        for (int i = 0; i < numNhanVien; i++) {
            System.out.println("nhập thông tin cho nhân viên thứ " + (i + 1));
            System.out.print("nhập id của nhân viên: ");
            int nhanVienId;
            NhanVien nhanVien = null;
            do {
                nhanVienId = new Scanner(System.in).nextInt();
                nhanVien = nhanVienLogic.searchIdNhanVien(nhanVienId);
                if (nhanVien == null) {
                    System.out.println("Không tồn tại nhân viên có id: " + nhanVienId + " ,vui lòng nhập lại id: ");
                }
            } while (nhanVien == null);

            System.out.println("nhân viên bán bao nhiêu mặt hàng");
            int numHang ;

            do {
                numHang =new Scanner(System.in).nextInt();
                if (numHang>0&& numHang<6){
                    break;
                }
                System.out.println("Nhân viên chỉ bán tối đa 5 mặt hàng");
            }while (true);

            HangHoa[] hangHoas = new HangHoa[numHang];
            int count= 0;

            for (int j = 0; j < numHang; j++) {
                System.out.println("Thông tin cho mặt hàng thứ "+(j+1));
                System.out.print("nhập id của mặt hàng: ");
                int hangId ;
                Hang hang= null;
                do{
                    hangId =new Scanner(System.in).nextInt();
                    hang = hangLogic.searchIdHang(hangId);
                    if (hang == null){
                        System.out.println("Không tồn tại mặt hàng có id: " + hangId + " ,vui lòng nhập lại id: ");
                    }

                }while (hang == null);
                System.out.println("Nhập số lượng bán được:");
                int quantity;
                do {
                    quantity = new Scanner(System.in).nextInt();
                    if (quantity>0 ){
                        break;
                    }
                    System.out.println("số lượng bán được phải >0");
                }while (true);
                HangHoa hangHoa = new HangHoa(quantity, hang);
                hangHoas[count]=hangHoa;
                count++;

                BanHang banHang = new BanHang( nhanVien, hangHoas);
                saveBanHang(banHang);
            }
            showBanHang();

        }

    }
    private static void showBanHang() {
        for (int i = 0; i < banHangs.length; i++) {
            if (banHangs[i]!=null){
                System.out.println(banHangs[i]);
            }
        }
    }

    private  static void saveBanHang(BanHang banHang) {
        for (int i = 0; i < banHangs.length; i++) {
            if (banHangs[i]== null){
                banHangs[i]= banHang;
                break;
            }
        }
    }
    private static boolean codulieuchua() {
        for (int i = 0; i < hangLogic.getHangs().length; i++) {
            if (hangLogic.getHangs()[i] != null) {
                return false;
            }
        }
        for (int i = 0; i <nhanVienLogic.getNhanViens().length; i++) {
            if (nhanVienLogic.getNhanViens()[i] != null) {
                return false;
            }
        }
        return true;
    }

    public static void sortByName() {
        if (codulieuchua()){
            System.out.println("chưa có thông tin");
        }
        for (int i = 0; i < banHangs.length -1; i++) {
            if (banHangs[i]==null){
                break;
            }
            for (int j = i+1; j < banHangs.length; j++) {
                if (banHangs[j]!= null &&
                banHangs[i].getNhanVien().getName().compareToIgnoreCase(banHangs[j].getNhanVien().getName())>0){
                    BanHang temp = banHangs[i];
                    banHangs[i] = banHangs[j];
                    banHangs[i] = temp;
                }
            }
        }
    }

    public static void sortByItem() {
    }
}