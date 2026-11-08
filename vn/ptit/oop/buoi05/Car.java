/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Cây kế thừa hệ thống các phương tiện ô tô (Car, Truck, Ford, Sedan) và tính giá bán đa hình.
 */
package vn.ptit.oop.buoi05;

/**
 * Lớp ô tô gốc biểu diễn thông tin chung của xe.
 */
public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    /**
     * Khởi tạo thông số cơ bản cho xe ô tô.
     * @param speed Tốc độ xe
     * @param regularPrice Giá niêm yết
     * @param color Màu xe
     */
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    /**
     * Lấy giá bán khuyến mãi thực tế của xe.
     * @return Giá bán khuyến mãi
     */
    public double getSalePrice() {
        return regularPrice;
    }

    /**
     * Lấy giá niêm yết ban đầu.
     * @return Giá gốc
     */
    public double getRegularPrice() { return regularPrice; }
}

/** Xe tải kế thừa từ ô tô */
class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        return getRegularPrice() * (weight > 2000 ? 0.90 : 0.80);
    }
}

/** Xe Ford kế thừa từ ô tô */
class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}

/** Xe Sedan kế thừa từ ô tô */
class Sedan extends Car {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        return getRegularPrice() * (length > 20 ? 0.95 : 0.90);
    }
}
