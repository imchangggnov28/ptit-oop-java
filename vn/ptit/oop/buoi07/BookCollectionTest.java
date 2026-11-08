package vn.ptit.oop.buoi07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Lớp quản lý và kiểm thử chuyển đổi mảng sang ArrayList<Book> cùng lưu ý phương thức remove.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
public class BookCollectionTest {

    /**
     * Phương thức main chạy kiểm thử các chức năng ArrayList và giải thích remove.
     * 
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        // 1. Khởi tạo ArrayList<Book> thay cho mảng cố định Book[]
        List<Book> bookList = new ArrayList<>();

        // Thêm các cuốn sách (Thêm - add)
        bookList.add(new Book("Lập trình Java căn bản", "ISBN-001", "Nguyễn Văn A", "NXB Thống Kê", 2022, 120000));
        bookList.add(new Book("Cấu trúc dữ liệu và giải thuật", "ISBN-002", "Trần Văn B", "NXB Khoa Học", 2020, 95000));
        bookList.add(new Book("Lập trình Hướng đối tượng", "ISBN-003", "Hoàng Văn C", "NXB Giáo Dục", 2023, 150000));
        bookList.add(new Book("Cơ sở dữ liệu nâng cao", "ISBN-004", "Nguyễn Văn A", "NXB Thống Kê", 2021, 110000));
        bookList.add(new Book("Mạng máy tính", "ISBN-005", "Phạm Thị D", "NXB Bách Khoa", 2019, 85000));

        System.out.println("=== DANH SÁCH BAN ĐẦU (" + bookList.size() + " cuốn) ===");
        bookList.forEach(b -> System.out.println("- " + b.getBookInfo()));

        // 2. Tìm kiếm sách theo tác giả (Tìm - find)
        String targetAuthor = "Nguyễn Văn A";
        System.out.println("\n=== TÌM KIẾM SÁCH CỦA TÁC GIẢ: " + targetAuthor + " ===");
        for (Book b : bookList) {
            if (b.getAuthor().equalsIgnoreCase(targetAuthor)) {
                System.out.println("  Found: " + b.getName());
            }
        }

        // 3. Sắp xếp danh sách theo năm xuất bản tăng dần (Sắp xếp - sort)
        System.out.println("\n=== SẮP XẾP SÁCH THEO NĂM XUẤT BẢN TĂNG DẦN ===");
        bookList.sort(Comparator.comparingInt(Book::getYear));
        bookList.forEach(b -> System.out.println("- " + b.getName() + " (" + b.getYear() + ")"));

        // 4. Xoá sách khỏi danh sách (Xoá - remove)
        // Xoá theo đối tượng cụ thể
        Book bookToRemove = bookList.get(0); // Lấy cuốn đầu tiên sau khi sắp xếp
        bookList.remove(bookToRemove);
        System.out.println("\n=== SAU KHI XOÁ 1 CUỐN SÁCH (Còn lại: " + bookList.size() + " cuốn) ===");

        // 5. Duyệt danh sách (Duyệt - iterate)
        System.out.println("Duyệt danh sách bằng vòng lặp for-each:");
        for (Book b : bookList) {
            System.out.println("  -> " + b.getName());
        }

        // 6. GIẢI THÍCH LƯU Ý VỀ remove(index) vs remove(object) (Đặc biệt với List<Integer>)
        System.out.println("\n=== GIẢI THÍCH LƯU Ý KHI DÙNG list.remove() ===");
        System.out.println("Trong ArrayList, phương thức remove bị nạp chồng (overloaded) thành 2 phiên bản chính:");
        System.out.println("  1. remove(int index): Xoá phần tử tại vị trí chỉ số (index).");
        System.out.println("  2. remove(Object o): Xoá phần tử khớp với đối tượng được truyền vào.");
        System.out.println("\nVí dụ với List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));");
        System.out.println("  - numbers.remove(1);  -> Sẽ hiểu '1' là CHỈ SỐ (index 1), do đó nó xoá phần tử 20 (ở index 1), chứ KHÔNG PHẢI xoá giá trị số 1.");
        System.out.println("  - Để xoá chính xác GIÁ TRỊ số 1 thay vì chỉ số, ta bắt buộc phải ép kiểu hoặc dùng Integer.valueOf(1):");
        System.out.println("    -> numbers.remove(Integer.valueOf(1)); hoặc numbers.remove((Integer) 1);");
    }
}
