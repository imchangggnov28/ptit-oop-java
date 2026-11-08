/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Bài 6.2 - Phiên bản 2: Cài đặt bài toán Shape sử dụng Interface có Default Method.
 */
package vn.ptit.oop.buoi06.Bai2;

/**
 * Giao diện đại diện cho hình học (Phiên bản 2).
 * Không có trạng thái instance (chỉ có hằng số public static final), không có constructor.
 * Sử dụng default method để cung cấp triển khai mặc định cho displayInfo().
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
public interface Shape2 {
    
    /**
     * Phương thức trừu tượng tính diện tích.
     * 
     * @return Diện tích dạng double
     */
    double getArea();

    /**
     * Phương thức trừu tượng tính chu vi.
     * 
     * @return Chu vi dạng double
     */
    double getPerimeter();

    /**
     * Phương thức trừu tượng lấy tên hình.
     * 
     * @return Tên hình
     */
    String getName();

    /**
     * Default method hiển thị thông tin hình học.
     * Lớp cài đặt không bắt buộc phải ghi đè phương thức này.
     */
    default void displayInfo() {
        System.out.printf("Shape2 [%s] -> Diện tích: %.2f | Chu vi: %.2f%n",
                getName(), getArea(), getPerimeter());
    }
}

/**
 * Lớp Hình tròn cài đặt interface Shape2.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
class Circle2 implements Shape2 {
    private String color;
    private double radius;

    /**
     * Khởi tạo hình tròn phiên bản 2.
     * 
     * @param color Màu sắc
     * @param radius Bán kính
     */
    public Circle2(String color, double radius) {
        this.color = color;
        this.radius = Math.max(0, radius);
    }

    @Override
    public String getName() {
        return "Hình tròn (" + color + ")";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}