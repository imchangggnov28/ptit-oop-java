package vn.ptit.oop.buoi06;

import java.util.EnumMap;

/**
 * Lớp kiểm thử chạy chương trình minh họa cho Bài 6.3.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
public class EnumTest {

    /**
     * Phương thức main kiểm thử tất cả các yêu cầu đề bài.
     * 
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        System.out.println("=== 1. KIỂM THỬ ENUM PLANET ===");
        double earthWeight = 60.0; // Khối lượng 60kg trên Trái Đất
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        System.out.printf("Khối lượng vật thể trên Trái Đất: %.2f kg%n", earthWeight);
        System.out.println("Trọng lượng của vật thể trên các hành tinh khác:");

        // Sử dụng values() và ordinal()
        for (Planet p : Planet.values()) {
            System.out.printf("- [%d] Hành tinh %-8s: Trọng lượng = %10.2f N | Gia tốc trọng trường = %.2f m/s²%n",
                    p.ordinal(), p.name(), p.surfaceWeight(mass), p.surfaceGravity());
        }

        // Sử dụng valueOf()
        System.out.println("\nTìm kiếm hành tinh bằng string tên với valueOf():");
        Planet pSearch = Planet.valueOf("MARS");
        System.out.printf("Hành tinh tìm thấy: %s (Bán kính: %.1f km)%n", pSearch, pSearch.getRadius() / 1000);


        System.out.println("\n=== 2. KIỂM THỬ ENUM GRADE (KHOẢNG ĐIỂM VÀ MÔ TẢ TIẾNG VIỆT) ===");
        double[] testScores = { 9.2, 7.5, 6.0, 4.5, 2.0 };
        for (double score : testScores) {
            Grade g = Grade.fromScore(score);
            System.out.printf("Điểm: %4.1f => Điểm chữ: %s | Mô tả: %-22s | Trạng thái: %s%n",
                    score, g.name(), g.getDescription(), (g.isPassed() ? "ĐẠT (Pass)" : "KHÔNG ĐẠT (Fail)"));
        }


        System.out.println("\n=== 3. SỬ DỤNG ENUMMAP THỐNG KÊ KẾT QUẢ SINH VIÊN ===");
        // Tạo EnumMap với khóa là các hằng số Grade
        EnumMap<Grade, Integer> gradeDistribution = new EnumMap<>(Grade.class);
        
        // Khởi tạo số lượng sinh viên cho từng điểm chữ
        for (Grade g : Grade.values()) {
            gradeDistribution.put(g, 0);
        }

        // Giả lập danh sách điểm của một lớp học
        double[] classScores = { 8.8, 9.0, 7.2, 7.8, 8.0, 5.8, 6.2, 4.0, 3.5, 1.5, 9.5, 6.8 };
        for (double score : classScores) {
            Grade g = Grade.fromScore(score);
            gradeDistribution.put(g, gradeDistribution.get(g) + 1);
        }

        System.out.println("Phân bố điểm chữ trong lớp học (Dùng EnumMap):");
        gradeDistribution.forEach((grade, count) -> {
            System.out.printf("Điểm chữ %s [%s]: %d sinh viên%n",
                    grade, grade.getDescription(), count);
        });
    }
}