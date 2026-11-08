/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Lớp trừu tượng Shape và các lớp con Circle, Rectangle thực thi tính toán diện tích, chu vi.
 */
package vn.ptit.oop.buoi05;

/**
 * Lớp trừu tượng cho các hình học.
 */
public abstract class Shape {
    /**
     * Tính diện tích hình.
     * @return Diện tích kiểu double
     */
    public abstract double area();

    /**
     * Tính chu vi hình.
     * @return Chu vi kiểu double
     */
    public abstract double perimeter();

    /**
     * In ra mô tả diện tích và chu vi của hình hiện tại.
     */
    public void describe() {
        System.out.printf("%s - Diện tích: %.2f, Chu vi: %.2f%n",
                getClass().getSimpleName(), area(), perimeter());
    }
}

/** Hình tròn kế thừa lớp trừu tượng Shape */
class Circle extends Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    @Override public double area() { return Math.PI * radius * radius; }
    @Override public double perimeter() { return 2 * Math.PI * radius; }
}

/** Hình chữ nhật kế thừa lớp trừu tượng Shape */
class Rectangle extends Shape {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override public double area() { return width * height; }
    @Override public double perimeter() { return 2 * (width + height); }
}