/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Hệ thống quản lý lương đa hình cho các loại nhân viên (Salaried, Hourly, Commission, BasePlusCommission).
 */
package vn.ptit.oop.buoi05;

/**
 * Lớp trừu tượng biểu diễn nhân viên chung trong hệ thống.
 */
public abstract class Employee {
    private String firstName;
    private String lastName;

    /**
     * Khởi tạo thông tin cơ bản cho nhân viên.
     * @param firstName Tên nhân viên
     * @param lastName Họ nhân viên
     */
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Lấy tên nhân viên.
     * @return Tên nhân viên
     */
    public String getFirstName() { return firstName; }

    /**
     * Lấy họ nhân viên.
     * @return Họ nhân viên
     */
    public String getLastName() { return lastName; }

    /**
     * Tính thu nhập của nhân viên (phương thức trừu tượng).
     * @return Thu nhập thực nhận
     */
    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}

/** Nhân viên hưởng lương cố định theo tuần */
class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = Math.max(0.0, weeklySalary);
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}

/** Nhân viên hưởng lương theo giờ (Overtime >40h x1.5) */
class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, double wage, double hours) {
        super(firstName, lastName);
        this.wage = Math.max(0.0, wage);
        this.hours = (hours >= 0.0 && hours <= 168.0) ? hours : 0.0;
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }
}

/** Nhân viên hưởng hoa hồng theo doanh số */
class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, double grossSales, double commissionRate) {
        super(firstName, lastName);
        this.grossSales = Math.max(0.0, grossSales);
        this.commissionRate = (commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0;
    }

    public double getGrossSales() { return grossSales; }
    public double getCommissionRate() { return commissionRate; }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
}

/** Nhân viên hưởng lương cơ bản cộng hoa hồng */
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, grossSales, commissionRate);
        this.baseSalary = Math.max(0.0, baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = Math.max(0.0, baseSalary);
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}