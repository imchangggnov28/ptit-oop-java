/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Áp dụng sealed interface kết hợp Switch pattern matching trong Java 21.
 */
package vn.ptit.oop.buoi05;

/**
 * Interface Sealed giới hạn các lớp triển khai cụ thể.
 */
public sealed interface SealedShape permits CircleRecord, RectangleRecord {
    /**
     * Phương thức tính diện tích.
     * @return Diện tích
     */
    double area();
}

/** Record Circle thực thi SealedShape */
record CircleRecord(double radius) implements SealedShape {
    @Override public double area() { return Math.PI * radius * radius; }
}

/** Record Rectangle thực thi SealedShape */
record RectangleRecord(double w, double h) implements SealedShape {
    @Override public double area() { return w * h; }
}

/**
 * Lớp hỗ trợ tính toán bằng switch pattern matching.
 */
class SwitchPatternDemo {
    /**
     * Tính diện tích dựa vào Pattern Matching switch của Java 21.
     *
     * @param shape Hình học cần tính
     * @return Diện tích tương ứng
     */
    public static double calculate(SealedShape shape) {
        return switch (shape) {
            case CircleRecord c -> Math.PI * c.radius() * c.radius();
            case RectangleRecord r -> r.w() * r.h();
        };
    }
}