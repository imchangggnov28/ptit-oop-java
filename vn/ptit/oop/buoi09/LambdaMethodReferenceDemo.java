/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Bài 9.1 - Chuyển đổi từ Anonymous Class sang Lambda Expression và Method Reference 
 *        cho Comparator, Runnable, Predicate, kèm ví dụ minh họa 4 dạng method reference.
 */
package vn.ptit.oop.buoi09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Lớp minh họa Bài 9.1: Chuyển đổi linh hoạt giữa Anonymous Class, Lambda và Method Reference.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
public class LambdaMethodReferenceDemo {

    /**
     * Phương thức main chạy các ví dụ chuyển đổi và 4 dạng method reference.
     * 
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Nam", "An", "Bình", "Châu"));

        System.out.println("=== 1. SO SÁNH VỚI COMPARATOR ===");
        
        // 1.1 Dùng Anonymous Class truyền thống
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        
        // 1.2 Chuyển sang Lambda Expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        // 1.3 Chuyển sang Method Reference (Class::instanceMethod)
        Collections.sort(names, String::compareTo);
        System.out.println("Danh sách sau khi sắp xếp: " + names);


        System.out.println("\n=== 2. SO SÁNH VỚI RUNNABLE ===");
        
        // 2.1 Dùng Anonymous Class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable chạy bằng Anonymous Class");
            }
        };
        r1.run();

        // 2.2 Dùng Lambda Expression
        Runnable r2 = () -> System.out.println("Runnable chạy bằng Lambda Expression");
        r2.run();

        // 2.3 Dùng Method Reference (Class::staticMethod)
        Runnable r3 = LambdaMethodReferenceDemo::myStaticTask;
        r3.run();


        System.out.println("\n=== 3. SO SÁNH VỚI PREDICATE ===");
        
        // 3.1 Dùng Anonymous Class
        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };

        // 3.2 Dùng Lambda Expression
        Predicate<String> p2 = s -> s.isEmpty();

        // 3.3 Dùng Method Reference (Class::instanceMethod)
        Predicate<String> p3 = String::isEmpty;
        System.out.println("Kiểm tra chuỗi '' có trống không (dùng p3.test): " + p3.test(""));


        System.out.println("\n=== 4. MINH HỌA 4 DẠNG METHOD REFERENCE ===");

        // Dạng 1: Class::staticMethod (Gọi phương thức tĩnh)
        // Thay vì lambda: s -> Integer.parseInt(s)
        Function<String, Integer> parser = Integer::parseInt;
        int parsedNumber = parser.apply("2026");
        System.out.println("1. Class::staticMethod -> Kết quả parse: " + parsedNumber);

        // Dạng 2: object::instanceMethod (Gọi phương thức của một đối tượng cụ thể)
        // Thay vì lambda: s -> System.out.println(s)
        Consumer<String> printer = System.out::println;
        printer.accept("2. object::instanceMethod -> Xin chào Hoàng Thị Huyền Trang (N24DCCN083)!");

        // Dạng 3: Class::instanceMethod (Gọi phương thức của đối tượng tham gia gọi hàm không cần chỉ định tường minh)
        // Thay vì lambda: (s1, s2) -> s1.compareToIgnoreCase(s2)
        Comparator<String> ignoreCaseComp = String::compareToIgnoreCase;
        int compResult = ignoreCaseComp.compare("java", "JAVA");
        System.out.println("3. Class::instanceMethod -> Kết quả so sánh không phân biệt hoa thường: " + compResult);

        // Dạng 4: Class::new (Constructor Reference - Tham chiếu constructor)
        // Thay vì lambda: () -> new ArrayList<>()
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> dynamicList = listSupplier.get();
        dynamicList.add("Java 21 LTS");
        System.out.println("4. Class::new -> Khởi tạo thành công Collection mới: " + dynamicList);
    }

    /**
     * Phương thức tĩnh mẫu hỗ trợ cho ví dụ Method Reference dạng Class::staticMethod.
     */
    public static void myStaticTask() {
        System.out.println("Runnable chạy bằng Method Reference (Class::staticMethod)");
    }
}