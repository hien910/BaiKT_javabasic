package entity;

import java.util.Arrays;

public class BanHang {
    private NhanVien nhanVien;
    private HangHoa[] hangHoas;
    private int total;

    public BanHang(NhanVien nhanVien, HangHoa[] hangHoas) {
    }

    @Override
    public String toString() {
        return "BanHang{" +
                "nhanVien=" + nhanVien +
                ", hangHoas=" + Arrays.toString(hangHoas) +
                ", total=" + total +
                '}';
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public HangHoa[] getHangHoas() {
        return hangHoas;
    }

    public void setHangHoas(HangHoa[] hangHoas) {
        this.hangHoas = hangHoas;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
