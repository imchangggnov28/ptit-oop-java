import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long tich = a*b*c;
    long tong = a+b+c;
    String xuatDL = """
            Tich: %d
            Tong: %d
            """.formatted(tich,tong);
System.out.println(xuatDL);
sc.close();
}}
