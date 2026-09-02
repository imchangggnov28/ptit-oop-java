import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SortSearchBenchmark {

    // 1. Bubble Sort (Nổi bọt)
    public static void bubbleSort(int[] arr) {
        long comparisons = 0;
        long swaps = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) break; // Tối ưu: dừng sớm nếu mảng đã xong
        }

        System.out.printf("%-18s | So sánh: %,12d | Hoán vị: %,12d%n", 
                          "Bubble Sort", comparisons, swaps);
    }

    // 2. Selection Sort (Chọn trực tiếp)
    public static void selectionSort(int[] arr) {
        long comparisons = 0;
        long swaps = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }

        System.out.printf("%-18s | So sánh: %,12d | Hoán vị: %,12d%n", 
                          "Selection Sort", comparisons, swaps);
    }

    // 3. Insertion Sort (Chèn trực tiếp)
    public static void insertionSort(int[] arr) {
        long comparisons = 0;
        long shifts = 0; // Đếm số phép dịch chuyển (tương đương nửa phép hoán vị)
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    shifts++;
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }

        System.out.printf("%-18s | So sánh: %,12d | Hoán vị: %,10d%n", 
                          "Insertion Sort", comparisons, shifts);
    }

    // 4. Binary Search (Tìm kiếm nhị phân)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int comparisons = 0;

        while (left <= right) {
            comparisons++;
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.printf("Binary Search (%d): Tìm thấy tại chỉ số %d sau %,d lần so sánh.%n", 
                                  target, mid, comparisons);
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.printf("Binary Search (%d): Không tìm thấy sau %,d lần so sánh.%n", 
                          target, comparisons);
        return -1;
    }
     // Đo thời gian Chạy
    public static void timeRunning(String taskName, Runnable task) {
        long startTime = System.nanoTime();
        task.run(); 
        long endTime = System.nanoTime();
        double durationMs = (endTime - startTime) / 1e6;
        System.out.printf("============Thời gian chạy thực tế: %.2f ms%n", durationMs);
    }
    public static void main(String[] args) {
        int N = 10000;
        Random rand = new Random(100); // Seed cố định để kết quả các mảng sao chép giống hệt nhau

        int[] originalArray = new int[N];
        for (int i = 0; i < N; i++) {
            originalArray[i] = rand.nextInt(100_000);
        }

        System.out.println("=== 1. KẾT QUẢ ĐO ĐẠC SẮP XẾP MẢNG 10.000 PHẦN TỬ NGẪU NHIÊN ===");
        
        // Chạy thử nghiệm trên các bản sao mảng độc lập
        timeRunning("BubbleSort", () -> bubbleSort(originalArray.clone()));
        timeRunning("SelectionSort", () -> selectionSort(originalArray.clone()));
        timeRunning("InsertionSort", () -> insertionSort(originalArray.clone()));

        // Đo Arrays.sort 
        System.out.println("Array.sort");
        int[] javaSortArr = originalArray.clone();
        timeRunning("",() -> Arrays.sort(javaSortArr));
        //BinarySearch:
        System.out.println("\n=== 2. THỬ NGHIỆM TÌM KIẾM NHỊ PHÂN (BINARY SEARCH) ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn tìm: ");
        int num = sc.nextInt();
        binarySearch(javaSortArr, num);
    }
}