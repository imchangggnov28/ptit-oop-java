import java.util.Scanner;
import java.util.Arrays;
public class Bai10{
   public static void Tong(int[][] matrix){
     int rows = matrix.length, cols = matrix[0].length;
     System.out.print("Tổng các hàng: ");
     for(int i=0;i<rows; i++){
       int sum = 0;
        for(int j=0; j<cols;j++){
           sum+=matrix[i][j];
        }
        System.out.printf("  Tổng hàng %d là: %d\n",i+1,sum);
     }
     System.out.printf("Tổng các cột: ");
     for(int i =0; i<cols;i++){
       int sum = 0;
       for(int j=0;j<rows;j++){
         sum+=matrix[j][i];
       }
       System.out.printf("  Tổng cột %d là: %d\n",i+1,sum);
     }
   }
   public static int[][] MaTranChuyenVi(int[][] matrix){
     int m = matrix.length, n = matrix[0].length;
     int[][] newMatrix = new int[n][m];
     for(int i = 0; i<m; i++){
       for(int j = 0; j<n; j++){
         newMatrix[j][i]=matrix[i][j];
       }
     }
     return newMatrix;
   }
   public static int[][] Nhan2MaTran(int[][] a, int[][] b){
     int m = a.length, n = a[0].length, q = b[0].length;
     if(n!=b.length){
      throw new IllegalArgumentException("Không thực hiện nhân 2 ma trận được do số cột của ma trận thứ nhất k bằng số hàng của ma trận thứ 2");
     }
     int[][] ketQua = new int[m][q];
     for(int i = 0;i<m;i++){
       for(int j = 0;j<q;j++){
         for(int k = 0;k<n;k++){
           ketQua[i][j]+=a[i][k]*b[k][j];
         }
       }
     }
     return ketQua;
   }
   public static boolean MaTranDoiXung(int[][] matrix){
     int m = matrix.length, n = matrix[0].length;
     if(m!=n){
       return false;
     }
     else{
       for(int i = 0;i<m;i++){
         for(int j=0; j<n;j++){
           if(matrix[i][j]!=matrix[j][i]) return false;
         }
       }
       return true;
     } 
   }
   public static int[][] inputMatrix(Scanner sc, String name) {
        System.out.print("Nhập số hàng của ma trận " + name + ": ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột của ma trận " + name + ": ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Nhập các phần tử của ma trận " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%s[%d][%d] = ", name, i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
   public static void InMaTran(int[][] matrix) {
     for (int[] rows : matrix) {
        System.out.println(Arrays.toString(rows));
     }
   } 
   public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("NHẬP MA TRẬN A:");
        int[][] A = inputMatrix(sc, "A");
        System.out.println("\nNHẬP MA TRẬN B:");
        int[][] B = inputMatrix(sc, "B");
       System.out.println("Ma tận A:");
       InMaTran(A);
       System.out.println("\nMa trận B:");
       InMaTran(B);
       System.out.println("Tổng trên hàng/ cột của A:");
       Tong(A);
       System.out.println("Ma trận chuyển vị của A là:");
       InMaTran(MaTranChuyenVi(A));
       System.out.println("Tích 2 ma trận A và B là: ");
       InMaTran(Nhan2MaTran(A,B));
       System.out.printf("A là ma trận đối xứng? %b",MaTranDoiXung(A));
   }
}