import java.util.Scanner;
public class Bai9{
   public static String MaHoa(String x, int k){
     StringBuilder ketQua = new StringBuilder();
     for (char ch : x.toCharArray()){
       if(Character.isUpperCase(ch)){
         int t=((ch - 'A' + k )%26 +26)%26 +'A';
         ketQua.append((char)(t));
       }
       else if(Character.isLowerCase(ch)){
         int t = ((ch - 'a' + k)%26 + 26)%26 +'a';
         ketQua.append((char)(t));
       }
       else ketQua.append(ch);
     }
     return ketQua.toString();
   }
   public static String GiaiMa(String x, int k){
     return MaHoa(x,-k);
   }
  public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Nhap chuoi muon ma hoa/giai ma: ");
     String x = sc.nextLine();
     System.out.print("Nhap key: ");
     int k = sc.nextInt();
     System.out.printf("Chuoi %s sau khi ma hoa la: %s\n",x,MaHoa(x,k));
     System.out.printf("Chuoi %s sau khi giai ma la: %s",x,GiaiMa(x,k));
   }
}