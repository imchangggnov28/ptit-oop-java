import java.util.Scanner;
public class Bai7 {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap can nang: ");
    double weight = sc.nextDouble();
    System.out.print("Nhap chieu cao: ");
    double heightInMet = sc.nextDouble();
    if (heightInMet <= 0 || weight <= 0) {
    System.out.println("Chieu cao va can nang phai lon hon 0.");
    sc.close();
    return;}
    double bmi = weight/(heightInMet*heightInMet);
    String phanLoai;
        if (bmi < 18.5) {
            phanLoai = "Gầy (Thiếu cân)";
        } else if (bmi < 23.0) {
            phanLoai = "Bình thường";
        } else if (bmi < 25.0) {
            phanLoai = "Thừa cân (Tiền béo phì)";
        } else if (bmi < 30.0) {
            phanLoai = "Béo phì độ I";
        } else {
            phanLoai = "Béo phì độ II";
        }
    String xuatTT = """
            BMI cua ban la: %.2f
            Phan loai BMI: %s
            """.formatted(bmi, phanLoai);
    System.out.print(xuatTT);
    sc.close();
}
}
