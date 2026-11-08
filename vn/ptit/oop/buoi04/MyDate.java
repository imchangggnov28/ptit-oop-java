/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Lớp MyDate biểu diễn ngày tháng năm tự cài đặt và chuyển đổi sang LocalDate.
 */
package vn.ptit.oop.buoi04;

import java.time.LocalDate;

/**
 * Lớp đại diện cho ngày, tháng, năm cơ bản.
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    private static final int[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * Khởi tạo MyDate với các thành phần ngày, tháng, năm.
     *
     * @param day Ngày trong tháng
     * @param month Tháng trong năm
     * @param year Năm
     */
    public MyDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        }
    }

    /**
     * Kiểm tra xem năm truyền vào có phải năm nhuận không.
     *
     * @param year Năm cần kiểm tra
     * @return {@code true} nếu là năm nhuận
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Kiểm tra tính hợp lệ của ngày tháng năm.
     *
     * @param d Ngày
     * @param m Tháng
     * @param y Năm
     * @return {@code true} nếu bộ (d, m, y) tạo thành một ngày hợp lệ
     */
    public static boolean isValidDate(int d, int m, int y) {
        if (y < 1 || m < 1 || m > 12 || d < 1) return false;
        int maxDays = DAYS_IN_MONTH[m];
        if (m == 2 && isLeapYear(y)) maxDays = 29;
        return d <= maxDays;
    }

    /**
     * Chuyển trạng thái MyDate sang ngày kế tiếp.
     */
    public void nextDay() {
        int maxDays = DAYS_IN_MONTH[month];
        if (month == 2 && isLeapYear(year)) maxDays = 29;

        day++;
        if (day > maxDays) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    /**
     * Định dạng hiển thị chuỗi ngày tháng dạng dd/MM/yyyy.
     * @return Chuỗi ngày đã định dạng
     */
    public String displayDate() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    /**
     * Chuyển đổi đối tượng MyDate sang đối tượng java.time.LocalDate.
     * @return Đối tượng {@link LocalDate} tương ứng
     */
    public LocalDate toLocalDate() {
        return LocalDate.of(year, month, day);
    }
}
