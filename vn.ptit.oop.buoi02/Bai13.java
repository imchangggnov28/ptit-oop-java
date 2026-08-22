import java.util.Scanner;
public class Bai13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien khach dua(VND): ");
        long tienKhachDua = sc.nextLong();
        System.out.print("Nhap gia mon hang(VND): ");
        long giaMonHang = sc.nextLong();
        int[] menhGia = {500000, 200000, 100000, 50000, 20000, 10000, 5000, 2000, 1000};
        if(tienKhachDua<giaMonHang){
            System.out.printf("Khach dua thieu %d",giaMonHang-tienKhachDua);
        }
        else if(tienKhachDua==giaMonHang){
            System.out.print("Khach dua du tien.Khong can thoi!");
        }
        else{
            System.out.printf("Tien thoi: %d\n",tienKhachDua-giaMonHang);
            long tienDu = tienKhachDua-giaMonHang;
            //quy doi tien thoi ra menh gia cu the:
            for(int menhGiaHienTai : menhGia){
                int soTo = (int)(tienDu/menhGiaHienTai);
                if(soTo!=0){
                    System.out.printf("%d : %d to.\n",menhGiaHienTai, soTo);
                    tienDu = tienDu % menhGiaHienTai;
                }
            }
        }
        sc.close();
    }
}