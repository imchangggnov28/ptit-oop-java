/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Mô hình mượn trả sách thư viện sử dụng LocalDate và ChronoUnit để tính phí trễ hạn.
 */
package vn.ptit.oop.buoi04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Lớp chứa các mô hình quản lý thư viện giai đoạn 1.
 */
public class LibraryManagementStage1 {

    /**
     * Đại diện cho thông tin tài sản sách.
     */
    public static class BookItem {
        private String id;
        private String title;
        private boolean isBorrowed;

        /**
         * Khởi tạo đối tượng sách.
         * @param id Mã sách
         * @param title Tên sách
         */
        public BookItem(String id, String title) {
            this.id = id;
            this.title = title;
            this.isBorrowed = false;
        }

        /** @return Mã sách */
        public String getId() { return id; }
        /** @return {@code true} nếu sách đang được mượn */
        public boolean isBorrowed() { return isBorrowed; }
        /** @param borrowed Trạng thái mượn sách */
        public void setBorrowed(boolean borrowed) { isBorrowed = borrowed; }
    }

    /**
     * Đại diện cho thông tin độc giả/thành viên.
     */
    public static class Member {
        private String memberId;
        private String name;

        /**
         * Khởi tạo đối tượng thành viên.
         * @param memberId Mã thành viên
         * @param name Họ và tên
         */
        public Member(String memberId, String name) {
            this.memberId = memberId;
            this.name = name;
        }
    }

    /**
     * Biểu diễn phiếu mượn sách.
     */
    public static class Loan {
        private BookItem book;
        private Member member;
        private LocalDate borrowDate;
        private LocalDate dueDate;

        /**
         * Tạo phiếu mượn sách.
         * @param book Sách cần mượn
         * @param member Độc giả mượn
         * @param borrowDate Ngày mượn
         * @param loanDays Số ngày được mượn tối đa
         */
        public Loan(BookItem book, Member member, LocalDate borrowDate, int loanDays) {
            this.book = book;
            this.member = member;
            this.borrowDate = borrowDate;
            this.dueDate = borrowDate.plusDays(loanDays);
            book.setBorrowed(true);
        }

        /**
         * Tính toán khoản phí phạt trả quá hạn.
         * @param returnDate Ngày thực tế trả sách
         * @return Số tiền phạt (5,000 VNĐ / ngày trễ)
         */
        public double calculateLateFee(LocalDate returnDate) {
            if (returnDate.isAfter(dueDate)) {
                long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
                return daysLate * 5000.0;
            }
            return 0.0;
        }
    }
}