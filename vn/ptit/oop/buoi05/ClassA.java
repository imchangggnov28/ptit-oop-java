/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Minh họa thứ tự thực thi của static block, instance block và constructor trong chuỗi kế thừa A -> B -> C.
 */
package vn.ptit.oop.buoi05;

/** Lớp cha A trong chuỗi kế thừa */
class ClassA {
    static { System.out.println("1. Static block ClassA"); }
    { System.out.println("4. Instance block ClassA"); }
    public ClassA() { System.out.println("5. Constructor ClassA"); }
}