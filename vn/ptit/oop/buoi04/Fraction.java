/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Lớp Phân số (Fraction) bất biến hỗ trợ các phép toán đại số cơ bản.
 */
package vn.ptit.oop.buoi04;

/**
 * Lớp đại diện cho phân số bất biến (Immutable Fraction).
 */
public final class Fraction {
    private final int numerator;
    private final int denominator;

    /**
     * Khởi tạo đối tượng phân số và tự động rút gọn.
     *
     * @param numerator Tử số
     * @param denominator Mẫu số (phải khác 0)
     * @throws IllegalArgumentException nếu mẫu số bằng 0
     */
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0.");
        }
        int g = gcd(Math.abs(numerator), Math.abs(denominator));
        int sign = (denominator < 0) ? -1 : 1;
        this.numerator = (numerator / g) * sign;
        this.denominator = Math.abs(denominator) / g;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    /**
     * Cộng phân số hiện tại với một phân số khác.
     * @param f Phân số cần cộng
     * @return Phân số mới là tổng hai phân số
     */
    public Fraction add(Fraction f) {
        return new Fraction(this.numerator * f.denominator + f.numerator * this.denominator,
                this.denominator * f.denominator);
    }

    /**
     * Trừ phân số hiện tại cho một phân số khác.
     * @param f Phân số bị trừ
     * @return Phân số mới là hiệu hai phân số
     */
    public Fraction subtract(Fraction f) {
        return new Fraction(this.numerator * f.denominator - f.numerator * this.denominator,
                this.denominator * f.denominator);
    }

    /**
     * Nhân phân số hiện tại với một phân số khác.
     * @param f Phân số nhân
     * @return Phân số mới là tích hai phân số
     */
    public Fraction multiply(Fraction f) {
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }

    /**
     * Chia phân số hiện tại cho một phân số khác.
     * @param f Phân số chia
     * @return Phân số mới là thương hai phân số
     */
    public Fraction divide(Fraction f) {
        return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
    }

    @Override
    public String toString() {
        if (denominator == 1) return String.valueOf(numerator);
        return numerator + "/" + denominator;
    }
}