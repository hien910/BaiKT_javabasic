package entity;

import constant.Type;

import java.util.Scanner;

public class Hang implements Inputable{
    private int id;
    private static int id_auto =1000;
    private String  name;
    private Type type;
    private int price;
    private int quantity;


    public Hang() {
        this.id = id_auto;
        id_auto++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString() {
        return "Hang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public void inputInfo() {
        System.out.println("Nhập tên hàng");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập giá của hàng");
        this.setPrice(new Scanner(System.in).nextInt());
        System.out.println("Nhập số lượng ");
        this.setQuantity(new Scanner(System.in).nextInt());
        System.out.println("Nhập loại mặt hàng");
        System.out.println("Chọn 1 trong 4 loại sau:");
        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh ");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setType(Type.DIEN_TU);
                break;
            case 2:
                this.setType(Type.DIEN_LANH);
                break;
            case 3:
                this.setType(Type.MAY_TINH);
                break;
            case 4:
                this.setType(Type.THIET_BI_VAN_PHONG);
                break;
        }
    }
}
