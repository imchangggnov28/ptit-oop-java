import java.util.Scanner;
public class Bai10 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap kich thuoc(n): ");
    int n = sc.nextInt();
// 1. Tam giác vuông
    System.out.println("Tam giac vuong");
    for (int i = 1; i <= n; i++) {
         System.out.println("*".repeat(i));
    }

// 2. Tam giác cân
     System.out.println("Tam giac can: ");
     for (int i = 1; i <= n; i++) {
         System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
     }

// 3. Kim tự tháp rỗng
     System.out.println("Kim tu thap rong: ");
     for (int i = 1; i <= n; i++) {
         if (i == 1) System.out.println(" ".repeat(n - 1) + "*");
         else if (i == n) System.out.println("*".repeat(2 * n - 1));
         else System.out.println(" ".repeat(n - i) + "*" + " ".repeat(2 * i - 3) + "*");
     }
// 4.Hinh thoi:
     System.out.println("Hinh thoi: ");
        //  In nua tren cua hinh thoi (bao gom hang o chinh giua):
        for (int i = 1; i <= n; i++) {
                System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1));
            }
        //  In nua duoi cua hinh thoi:
        for (int i=n-1; i >=1; i--) {
                System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1));
        }
// 5. Bàn cờ vua 8x8
     System.out.println("Ban co vua: ");
     for (int row = 0; row < 8; row++) {
         for (int col = 0; col < 8; col++) {
             System.out.print((row + col) % 2 == 0 ? "*" : " ");
         }
     System.out.println();
     }
     sc.close();
}
}
