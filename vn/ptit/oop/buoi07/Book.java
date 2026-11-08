/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Bài 7.1 - Chuyển mảng Book[] sang ArrayList<Book> thực hiện các thao tác thêm, xoá, tìm, duyệt, sắp xếp
 *        và giải thích chi tiết lưu ý khi sử dụng phương thức remove(index) so với remove(object).
 */
package vn.ptit.oop.buoi07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Lớp đại diện cho một Cuốn sách (Book) với các thuộc tính cơ bản.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
class Book {
    private String name;
    private String isbn;
    private String author;
    private String publisher;
    private int year;
    private double price;

    /**
     * Khởi tạo đối tượng Book với đầy đủ thông tin.
     * 
     * @param name Tên sách
     * @param isbn Mã ISBN
     * @param author Tác giả
     * @param publisher Nhà xuất bản
     * @param year Năm xuất bản
     * @param price Giá sách
     */
    public Book(String name, String isbn, String author, String publisher, int year, double price) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    /**
     * Trả về chuỗi thông tin chi tiết của sách.
     * 
     * @return Chuỗi thông tin sách
     */
    public String getBookInfo() {
        return String.format("Book [Name='%s', ISBN='%s', Author='%s', Publisher='%s', Year=%d, Price=%,.2f]",
                name, isbn, author, publisher, year, price);
    }

    @Override
    public String toString() {
        return getBookInfo();
    }
}

