public class Bai6 {
    public static void main (String[] args){ 
    System.out.println("=".repeat(50));
    System.out.printf("|%-48s|\n","          BANG NHAN LUY THUA 10");
    System.out.println("=".repeat(50));
    System.out.printf("|%-10s|%-11s|%-12s|%-12s|%n","     N","   10*N","  100*N","  1000*N");
    System.out.println("=".repeat(50));
    for (int i = 1; i<6; i++){
          System.out.printf("|%-10s|%-11s|%-12s|%-12s|%n",i,10*i,100*i,1000*i);
    }
    System.out.println("=".repeat(50));
}
}