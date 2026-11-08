import java.util.Scanner;
public class Bai2{
    public static boolean isPrime(int n){
        if (n < 2)return false;
        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n%i == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(int a, int b){
        if (a==0 || b==0) return 0;
        return ((long)(Math.abs(a)/gcd(a,b)))*Math.abs(b);
    }

    public static long factorial (int n){
        if (n < 0) {
            throw new IllegalArgumentException ("Khong the tinh duoc giai thua cua so am");
        }
        long result = 1;
        for(int i = 2; i<=n; i++){
            result*=i;
        }
        return result;
    }

    public static int reverseNumber(int n){
        int reverse = 0;
        while(n!=0){
            int digit = n%10;
            reverse =reverse*10 +digit;
            n/=10;
        }
        return reverse;
    }
    public static boolean isPalindromeNumber(int n){
        if(n<0) return false;
        if (n==reverseNumber(n)) return true;
        return false;
    }

    public static long sumDigits(int n){
        n = Math.abs(n);
        int sum = 0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
        return sum;
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Co phai la so nguyen to?"+isPrime(n));
        System.out.printf("\nGiai thua cua %d la: %d", n,factorial(n));
        System.out.printf("\nSo dao cua %d la: %d",n,reverseNumber(n));
        System.out.print("\nCo phai la so doi xung? "+isPalindromeNumber(n));
        System.out.printf("\nTong cac chu so cua %d la: %d", n, sumDigits(n));
        System.out.print("\nNhap 2 so a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        System.out.printf("UCLN cua %d va %d la: %d",a,b,gcd(a,b));
        System.out.printf("\nBCNN cua %d va %d la: %d", a, b, lcm(a,b));    
    }
}