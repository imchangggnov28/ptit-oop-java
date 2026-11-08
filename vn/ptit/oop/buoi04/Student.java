/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Lớp Student ghi đè chuẩn xác equals, hashCode và toString theo MSSV duy nhất.
 */
package vn.ptit.oop.buoi04;

import java.util.Objects;

/**
 * Lớp đối tượng Sinh viên.
 */
public class Student {
    private String mssv;
    private String name;

    /**
     * Khởi tạo đối tượng Student.
     * @param mssv Mã số sinh viên
     * @param name Họ và tên sinh viên
     */
    public Student(String mssv, String name) {
        this.mssv = mssv;
        this.name = name;
    }

    /**
     * Lấy mã số sinh viên.
     * @return Mã số sinh viên
     */
    public String getMssv() { return mssv; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(mssv, student.mssv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mssv);
    }

    @Override
    public String toString() {
        return "Student{mssv='" + mssv + "', name='" + name + "'}";
    }
}
