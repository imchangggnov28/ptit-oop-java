/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Ghi đè toString và equals bằng super.toString(), so sánh đối tượng sử dụng getClass() đảm bảo tính đối xứng.
 */
package vn.ptit.oop.buoi05;

import java.util.Objects;

/**
 * Lớp nhân viên cơ sở ghi đè equals và hashCode dựa trên ID duy nhất.
 */
public class EmployeeTree {
    private String id;
    private String name;

    /**
     * Khởi tạo EmployeeBase.
     * @param id Mã nhân viên
     * @param name Tên nhân viên
     */
    public EmployeeTree(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // Dùng getClass() thay vì instanceof để đảm bảo tính đối xứng (symmetry) nghiêm ngặt giữa các lớp con
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTree that = (EmployeeTree) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("EmployeeBase[ID=%s, Name=%s]", id, name);
    }
}

/**
 * Lớp con Manager kế thừa EmployeeBase và mở rộng toString dùng super.
 */
class Manager extends EmployeeTree {
    private String department;

    /**
     * Khởi tạo Manager.
     * @param id Mã quản lý
     * @param name Tên quản lý
     * @param department Phòng ban quản lý
     */
    public Manager(String id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%s, Department=%s", super.toString(), department);
    }
}