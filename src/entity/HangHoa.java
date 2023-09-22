package entity;

public class HangHoa {
    private int total;
    private Hang hang;

    @Override
    public String toString() {
        return "HangHoa{" +
                "total=" + total +
                ", hang=" + hang +
                '}';
    }

    public HangHoa(int total, Hang hang) {
        this.total = total;
        this.hang = hang;
    }

    public Hang getHang() {
        return hang;
    }

    public void setHang(Hang hang) {
        this.hang = hang;
    }
}
