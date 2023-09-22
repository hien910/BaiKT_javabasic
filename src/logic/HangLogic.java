package logic;

import entity.Hang;
import entity.HangHoa;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HangLogic {
    private static Hang[] hangs = new Hang[100];
    private Hang hang;

    public Hang getHang() {
        return hang;
    }

    public HangLogic() {
        this.hang = hang;
    }

    public Hang[] getHangs() {
        return hangs;
    }

    public void setHangs(Hang[] hangs) {
        this.hangs = hangs;
    }

    public static void inputHang(){
        System.out.println("Nhập số lượng mặt hàng mới:");
        int numberHang =  new Scanner(System.in ).nextInt();
        for (int i = 0; i < numberHang; i++) {
            System.out.println("nhập thông tin cho mặt hàng thứ" +(i+1));
            Hang hang = new Hang();
            hang.inputInfo();
            saveHang(hang);
        }
    }
    private static void saveHang(Hang hang){
        for (int i = 0; i < hangs.length; i++) {
            if (hangs[i]== null){
                hangs[i]=hang;
                break;
            }
        }
    }
    public static void showHang(){
        for (int i = 0; i < hangs.length; i++) {
            if (hangs[i]!= null){
                System.out.println(hangs[i]);
            }
        }
    }
    public Hang searchIdHang(int id){
        for (int i = 0; i < hangs.length; i++) {
            if (hangs[i].getId()==id){
                return hangs[i];
            }
        }
        return null;
    }


}
