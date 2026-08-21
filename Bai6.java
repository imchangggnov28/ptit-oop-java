import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Tong a+b = "+(a+b));
        System.out.println("Hieu a-b = "+(a-b));
        System.out.println("Tich a*b = "+(a*b));
        if (b==0){
            System.out.println("Thuong a/b khi b = 0 la: "+(a/b));
            System.out.println("Phan du cua a/b khi b=0 la: "+(a%b));
        }
        else{
            System.out.println("Thuong a/b khi b khac 0 la: "+(a/b));
            System.out.println("Phan du cua a/b khi b khac 0 la: "+(a%b));
        }
        System.out.println("Luy thua a^b ="+Math.pow(a, b));
        sc.close();
    }
}
