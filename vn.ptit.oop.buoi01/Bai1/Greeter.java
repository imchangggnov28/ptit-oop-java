/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
package Bai1;
public record Greeter(String name) {
    public void greet() {
        System.out.println("Hello, " + name);
    } 
}
