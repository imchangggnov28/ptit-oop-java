/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Lớp Invoice biểu diễn hoá đơn bán hàng của linh kiện/sản phẩm.
 */
package vn.ptit.oop.buoi04.Bai2;

/**
 * Lớp đại diện cho hóa đơn cho một loại sản phẩm bán ra.
 */
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    /**
     * Khởi tạo hóa đơn mới với đầy đủ thông tin.
     *
     * @param partNumber Mã sản phẩm
     * @param partDescription Mô tả sản phẩm
     * @param quantity Số lượng mua
     * @param pricePerItem Đơn giá mỗi sản phẩm
     */
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    /**
     * Lấy mã sản phẩm.
     * @return Mã sản phẩm
     */
    public String getPartNumber() { return partNumber; }

    /**
     * Cập nhật mã sản phẩm.
     * @param partNumber Mã sản phẩm mới
     */
    public void setPartNumber(String partNumber) { this.partNumber = partNumber; }

    /**
     * Lấy mô tả sản phẩm.
     * @return Chuỗi mô tả sản phẩm
     */
    public String getPartDescription() { return partDescription; }

    /**
     * Cập nhật mô tả sản phẩm.
     * @param partDescription Mô tả mới
     */
    public void setPartDescription(String partDescription) { this.partDescription = partDescription; }

    /**
     * Lấy số lượng sản phẩm mua.
     * @return Số lượng sản phẩm
     */
    public int getQuantity() { return quantity; }

    /**
     * Cập nhật số lượng mua. Nếu âm sẽ gán bằng 0.
     * @param quantity Số lượng mua mới
     */
    public void setQuantity(int quantity) {
        this.quantity = Math.max(0, quantity);
    }

    /**
     * Lấy đơn giá mỗi sản phẩm.
     * @return Đơn giá sản phẩm
     */
    public double getPricePerItem() { return pricePerItem; }

    /**
     * Cập nhật đơn giá sản phẩm. Nếu âm sẽ gán bằng 0.0.
     * @param pricePerItem Đơn giá mới
     */
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = Math.max(0.0, pricePerItem);
    }

    /**
     * Tính tổng giá trị hóa đơn.
     * @return Tổng số tiền (số lượng * đơn giá)
     */
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("Invoice[Mã=%s, Mô tả=%s, Số lượng=%d, Đơn giá=%.2f, Thành tiền=%.2f]",
                partNumber, partDescription, quantity, pricePerItem, getInvoiceAmount());
    }
}