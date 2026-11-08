/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Bài 6.2 - Phiên bản 1: Cài đặt bài toán Shape sử dụng Lớp trừu tượng (Abstract Class).
 */
package vn.ptit.oop.buoi06.Bai2;

/**
 * Lớp trừu tượng đại diện cho hình học (Phiên bản 1).
 * Quản lý trạng thái tên hình (name) và màu sắc (color), có constructor và các phương thức trừu tượng/cụ thể.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
public abstract class Shape1 {
    // Trạng thái (Fields / Instance Variables) - Lớp trừu tượng có thể lưu trữ trạng thái có thể thay đổi
    private String name;
    private String color;

    /**
     * Khởi tạo một đối tượng hình học với tên và màu sắc.
     * 
     * @param name Tên hình học
     * @param color Màu sắc
     */
    public Shape1(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * Lấy tên của hình.
     * 
     * @return Tên hình
     */
    public String getName() {
        return name;
    }

    /**
     * Lấy màu sắc của hình.
     * 
     * @return Màu sắc
     */
    public String getColor() {
        return color;
    }

    /**
     * Phương thức trừu tượng tính diện tích.
     * 
     * @return Diện tích dạng double
     */
    public abstract double getArea();

    /**
     * Phương thức trừu tượng tính chu vi.
     * 
     * @return Chu vi dạng double
     */
    public abstract double getPerimeter();

    /**
     * Phương thức cụ thể in thông tin chi tiết về hình.
     */
    public void displayInfo() {
        System.out.printf("Shape1 [%s, Màu: %s] -> Diện tích: %.2f | Chu vi: %.2f%n",
                name, color, getArea(), getPerimeter());
    }
}

/**
 * Lớp Hình tròn mở rộng từ lớp trừu tượng Shape1.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
class Circle1 extends Shape1 {
    private double radius;

    /**
     * Khởi tạo hình tròn.
     * 
     * @param color Màu sắc
     * @param radius Bán kính
     */
    public Circle1(String color, double radius) {
        super("Hình tròn", color);
        this.radius = Math.max(0, radius);
    }

    /**
     * Tính diện tích hình tròn.
     * 
     * @return Diện tích = PI * r^2
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Tính chu vi hình tròn.
     * 
     * @return Chu vi = 2 * PI * r
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}