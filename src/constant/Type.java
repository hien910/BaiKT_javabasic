package constant;

public enum Type {
    DIEN_TU("Điện tử"),
    DIEN_LANH("Điện lạnh"),
    MAY_TINH("Máy tính"),
    THIET_BI_VAN_PHONG("Thiết bị văn phòng");

    public String value;

    Type(String value) {
        this.value = value;
    }
}
