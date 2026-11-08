/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Lớp kiểm thử so sánh hoạt động của Shape1 (Abstract Class) và Shape2 (Interface).
 */
package vn.ptit.oop.buoi06.Bai2;

/**
 * Lớp chạy chương trình kiểm thử cho Bài 6.2.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
public class ShapeTest {
    
    /**
     * Phương thức main chạy kiểm thử cả 2 phiên bản.
     * 
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        System.out.println("=== THỬ NGHIỆM PHIÊN BẢN 1: ABSTRACT CLASS ===");
        Shape1 circle1 = new Circle1("Đỏ", 5.0);
        circle1.displayInfo();

        System.out.println("\n=== THỬ NGHIỆM PHIÊN BẢN 2: INTERFACE WITH DEFAULT METHOD ===");
        Shape2 circle2 = new Circle2("Xanh", 5.0);
        circle2.displayInfo();
    }
}