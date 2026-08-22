import java.util.Scanner;
public class Bai7 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
         do{
            System.out.println("=====================MENU=====================");
            System.out.println("| 0-Thoat | 1-Cong | 2-Tru | 3-Nhan | 4-Chia |");
            System.out.print("Hay nhap lua chon cua ban!...");
            while (!sc.hasNextInt()) {
                 System.out.print("Nhập sai! Vui lòng nhập số: ");
                 sc.next(); // Xả bộ đệm rác
             }
            choice = sc.nextInt();
            if(choice >=1 && choice <=4){
                System.out.println("Nhap 2 so a va b: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                switch (choice) {
                    case 1-> System.out.printf("Tong = %.2f\n",a+b);
                    case 2-> System.out.printf("Hieu = %.2f\n", a-b);
                    case 3-> System.out.printf("Tich = %.2f\n", a*b);
                    default->{if(b==0){System.out.println("Loi! b phai la mot so khac 0");}
                            else{System.out.printf("Thuong = %.2f\n", a/b);}}
                }
            }
         }while (choice!=0);
         sc.close();
      } 
}
