/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Bài 6.3 - Định nghĩa các Enum nâng cao Planet và Grade có thuộc tính, constructor, 
 *        phương thức tính toán, constant-specific body, và sử dụng EnumMap.
 */
package vn.ptit.oop.buoi06;

import java.util.EnumMap;

/**
 * Enum đại diện cho các hành tinh trong Hệ Mặt Trời.
 * Chứa thông tin về khối lượng (kg) và bán kính (m), cùng các phương thức tính trọng lực bề mặt 
 * và trọng lượng của một vật thể trên hành tinh đó.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.900e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    // Hằng số hấp dẫn vũ trụ (m^3 kg^-1 s^-2)
    public static final double G = 6.67300E-11;

    private final double mass;   // Tính bằng Kilogram (kg)
    private final double radius; // Tính bằng Mét (m)

    /**
     * Constructor private khởi tạo hành tinh với khối lượng và bán kính.
     * 
     * @param mass Khối lượng hành tinh (kg)
     * @param radius Bán kính hành tinh (m)
     */
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    /**
     * Lấy khối lượng hành tinh.
     * 
     * @return Khối lượng dạng double (kg)
     */
    public double getMass() {
        return mass;
    }

    /**
     * Lấy bán kính hành tinh.
     * 
     * @return Bán kính dạng double (m)
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Tính gia tốc trọng trường trên bề mặt hành tinh: g = G * mass / radius^2.
     * 
     * @return Gia tốc trọng trường (m/s^2)
     */
    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    /**
     * Tính trọng lượng của một vật thể trên hành tinh này theo khối lượng vật thể trên Trái Đất.
     * 
     * @param otherMass Khối lượng của vật thể (kg)
     * @return Trọng lượng vật thể (N - Newton)
     */
    public double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}

/**
 * Enum đại diện cho Điểm chữ (Grade) trong hệ thống tín chỉ.
 * Chứa thông tin khoảng điểm tương ứng, mô tả tiếng Việt và sử dụng 
 * Constant-specific class bodies để đánh giá xem mức điểm đó có đạt (Pass) hay không.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
enum Grade {
    A(8.5, 10.0, "Xuất sắc / Giỏi") {
        @Override
        public boolean isPassed() {
            return true;
        }
    },
    B(7.0, 8.4, "Khá") {
        @Override
        public boolean isPassed() {
            return true;
        }
    },
    C(5.5, 6.9, "Trung bình") {
        @Override
        public boolean isPassed() {
            return true;
        }
    },
    D(4.0, 5.4, "Trung bình yếu") {
        @Override
        public boolean isPassed() {
            return true;
        }
    },
    F(0.0, 3.9, "Yếu / Kém (Học lại)") {
        @Override
        public boolean isPassed() {
            return false;
        }
    };

    private final double minScore;
    private final double maxScore;
    private final String description;

    /**
     * Constructor private cho Grade.
     * 
     * @param minScore Điểm cận dưới
     * @param maxScore Điểm cận trên
     * @param description Mô tả tiếng Việt
     */
    Grade(double minScore, double maxScore, String description) {
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.description = description;
    }

    public double getMinScore() {
        return minScore;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Phương thức trừu tượng kiểm tra sinh viên có đạt môn học với điểm này không.
     * Được ghi đè bởi từng hằng số (Constant-specific class body).
     * 
     * @return true nếu qua môn, false nếu tạch môn
     */
    public abstract boolean isPassed();

    /**
     * Phương thức static quy đổi từ điểm số thực (thang 10) sang Grade tương ứng.
     * 
     * @param score Điểm số học phần (0.0 - 10.0)
     * @return Đối tượng Grade phù hợp
     */
    public static Grade fromScore(double score) {
        for (Grade g : values()) {
            if (score >= g.minScore && score <= g.maxScore) {
                return g;
            }
        }
        throw new IllegalArgumentException("Điểm không hợp lệ: " + score);
    }
}
