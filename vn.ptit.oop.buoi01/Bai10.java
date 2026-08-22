import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap von goc (P): ");
        double p = sc.nextDouble();
        System.out.print("Nhap lai suat nam (r): ");
        double r = sc.nextDouble();
        System.out.print("Nhap so ky ghep lai/nam (n:) ");
        double n = sc.nextInt();
        System.out.print("Nhap so nam (t): ");
        double t = sc.nextInt();
        
        System.out.println("=".repeat(55));
        System.out.printf("|%-8s | %-20s | %-20s|%n", "   Nam" , "    So du dau ky" , "   So du cuoi ky");


        double soDuDau = p;
        for(int nam = 1; nam<=t; nam++){
            double soDuCuoi = p*Math.pow(1+r/n, n*nam);
            System.out.printf("|%-8d | %,20.2f | %,20.2f|%n", nam, soDuDau, soDuCuoi);
            soDuDau=soDuCuoi;
        }

        double fvTong = p*Math.pow(1+r/n, n*t);
        System.out.println("=".repeat(55));
        System.out.print("Gia tri tuong lai fv la: "+fvTong);
        sc.close();
        }
    }
