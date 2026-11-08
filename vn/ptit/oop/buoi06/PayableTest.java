package vn.ptit.oop.buoi06;

/**
 * Lớp kiểm thử tạo mảng Payable[] chứa cả Invoice và Employee để tính tổng chi phí.
 */
public class PayableTest {

    /**
     * Phương thức main khởi chạy bài kiểm thử.
     * 
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        // Tạo mảng kiểu Payable chứa các đối tượng thuộc cả Invoice và Employee
        Payable[] payableObjects = new Payable[] {
            new Invoice("01234", "Màn hình Dell 27 inch", 2, 3750000.0),
            new Invoice("56789", "Bàn phím cơ Logitech", 5, 1200000.0),
            new SalariedEmployee("Trang", "Hoàng Thị Huyền", "N24DCCN083-E01", 15000000.0),
            new SalariedEmployee("An", "Nguyễn Văn", "N24DCCN083-E02", 12000000.0)
        };

        System.out.println("=== CHI TIẾT DANH SÁCH THANH TOÁN (PAYABLE OBJECTS) ===");
        double totalPayment = 0.0;

        for (Payable currentPayable : payableObjects) {
            double amount = currentPayable.getPaymentAmount();
            totalPayment += amount;
            
            System.out.printf("%nĐối tượng: %s%n", currentPayable.toString());
            System.out.printf("Số tiền phải chi: %,.2f VNĐ%n", amount);
        }

        System.out.println("\n=======================================================");
        System.out.printf("TỔNG CHI PHÍ PHẢI CHI: %,.2f VNĐ%n", totalPayment);
    }
}