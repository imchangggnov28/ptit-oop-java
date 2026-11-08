/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Cài đặt Invoice và Point bằng Record bất biến trong Java modern.
 */
package vn.ptit.oop.buoi04;

/**
 * Record biểu diễn hóa đơn bất biến.
 *
 * @param partNumber Mã sản phẩm
 * @param description Mô tả sản phẩm
 * @param quantity Số lượng
 * @param price Đơn giá
     */
public record InvoiceRecord(String partNumber, String description, int quantity, double price) {
    /**
     * Compact constructor kiểm tra tính hợp lệ dữ liệu khởi tạo.
     */
    public InvoiceRecord {
        if (quantity < 0) quantity = 0;
        if (price < 0.0) price = 0.0;
    }

    /**
     * Tính tổng số tiền hóa đơn.
     * @return Thành tiền (số lượng * đơn giá)
     */
    public double amount() {
        return quantity * price;
    }
}