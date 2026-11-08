/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Bài 6.1 - Định nghĩa interface Payable, cài đặt trên Invoice và Employee, tính tổng chi phí thanh toán bằng mảng Payable[].
 */
package vn.ptit.oop.buoi06;

/**
 * Giao diện đại diện cho bất kỳ đối tượng nào có thể tính toán chi phí cần phải thanh toán.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
interface Payable {
    /**
     * Lấy số tiền thực tế phải chi trả cho đối tượng này.
     * 
     * @return Số tiền thanh toán dạng double
     */
    double getPaymentAmount();
}

/**
 * Lớp Hóa đơn triển khai interface Payable.
 */
class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    /**
     * Khởi tạo đối tượng Hóa đơn.
     * 
     * @param partNumber Mã sản phẩm/linh kiện
     * @param partDescription Mô tả sản phẩm
     * @param quantity Số lượng
     * @param pricePerItem Đơn giá
     */
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = Math.max(0, quantity);
        this.pricePerItem = Math.max(0.0, pricePerItem);
    }

    public String getPartNumber() { return partNumber; }
    public String getPartDescription() { return partDescription; }
    public int getQuantity() { return quantity; }
    public double getPricePerItem() { return pricePerItem; }

    /**
     * Tính tổng số tiền hóa đơn cần thanh toán.
     * 
     * @return Số tiền bằng số lượng nhân đơn giá
     */
    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("Invoice[PartNo=%s, Desc=%s, Qty=%d, Price=%.2f]", 
                partNumber, partDescription, quantity, pricePerItem);
    }
}

/**
 * Lớp trừu tượng Nhân viên triển khai interface Payable.
 */
abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Khởi tạo thông tin cơ bản cho nhân viên.
     * 
     * @param firstName Tên nhân viên
     * @param lastName Họ nhân viên
     * @param socialSecurityNumber Mã số định danh / Căn cước
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    @Override
    public String toString() {
        return String.format("%s %s (SSN: %s)", firstName, lastName, socialSecurityNumber);
    }
}

/**
 * Lớp Nhân viên hưởng lương cố định theo tuần triển khai đầy đủ getPaymentAmount().
 */
class SalariedEmployee extends Employee {
    private double weeklySalary;

    /**
     * Khởi tạo nhân viên hưởng lương theo tuần.
     * 
     * @param firstName Tên
     * @param lastName Họ
     * @param ssn Mã số định danh
     * @param weeklySalary Lương tuần
     */
    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = Math.max(0.0, weeklySalary);
    }

    public double getWeeklySalary() { return weeklySalary; }
    public void setWeeklySalary(double weeklySalary) { this.weeklySalary = Math.max(0.0, weeklySalary); }

    /**
     * Thực thi phương thức từ interface Payable.
     * 
     * @return Lương tuần của nhân viên
     */
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("SalariedEmployee[%s, WeeklySalary=%.2f]", super.toString(), weeklySalary);
    }
}