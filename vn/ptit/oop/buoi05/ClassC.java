package vn.ptit.oop.buoi05;

/**
 * Lớp con ClassC kế thừa ClassB và chứa hàm main thử nghiệm thứ tự.
 */
public class ClassC extends ClassB {
    static { System.out.println("3. Static block ClassC"); }
    { System.out.println("8. Instance block ClassC"); }
    public ClassC() {
        super();
        System.out.println("9. Constructor ClassC");
    }

    /**
     * Hàm main chạy thử nghiệm thứ tự khởi tạo.
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        System.out.println("--- Khởi tạo đối tượng ClassC ---");
        new ClassC();
    }
}
