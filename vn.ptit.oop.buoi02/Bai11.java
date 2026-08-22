import java.util.Scanner;
import java.util.Random;
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean replay = true;
        int soNgauNhien = random.nextInt(100)+1;
        boolean win = false;
        while(replay){
            int LIMIT = 7;
            int soLanDoan = 0;
            while(soLanDoan < 7){
                soLanDoan++;
                System.out.print("Hay nhap so ma ban doan(1-100): ");
                int soDoan = sc.nextInt();
                if (soDoan == soNgauNhien){
                    System.out.println("Chuc mung! Ban da doan dung!");
                    win = true;
                    break;}
                else {
                    if(soDoan > soNgauNhien){System.out.println("Chua chinh xac! GOI Y: So bi mat nho hon.");}
                    else {System.out.println("Chua chinh xac! GOI Y: So bi mat lon hon.");}
                    System.out.println("Ban con "+ (LIMIT-soLanDoan)+"lan doan!");
                    }
                }
            if (!win){System.out.println("Ban da dat gioi han so lan doan! So bi mat la: "+soNgauNhien);}
            System.out.println("Ban co muon choi lai lan nua k?(y/n");
            char choice = sc.next().toLowerCase().charAt(0);
            replay = (choice == 'y');
            }
        System.out.print("Tro choi ket thuc. Cam on ban!");
        sc.close();
}
}