/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Lớp Book biểu diễn thông tin chi tiết một cuốn sách trong thư viện.
 */
package vn.ptit.oop.buoi04;

/**
 * Biểu diễn thông tin sản phẩm sách.
 */
public class Book {
    private String name;
    private String isbn;
    private String author;
    private String publisher;
    private int year;
    private double price;

    /**
     * Khởi tạo đối tượng sách đầy đủ thông tin.
     *
     * @param name Tên sách
     * @param isbn Mã ISBN
     * @param author Tác giả
     * @param publisher Nhà xuất bản
     * @param year Năm xuất bản
     * @param price Giá bán
     */
    public Book(String name, String isbn, String author, String publisher, int year, double price) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    /**
     * Lấy tên tác giả.
     * @return Tên tác giả
     */
    public String getAuthor() { return author; }

    /**
     * Lấy năm xuất bản.
     * @return Năm xuất bản
     */
    public int getYear() { return year; }

    /**
     * Lấy thông tin tóm tắt cuốn sách.
     * @return Chuỗi mô tả đầy đủ thông tin sách
     */
    public String getBookInfo() {
        return String.format("Sách[ISBN=%s, Tên=%s, Tác giả=%s, NXB=%s, Năm=%d, Giá=%.2f]",
                isbn, name, author, publisher, year, price);
    }
}