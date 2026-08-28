import java.util.Scanner;

public class ss4_4{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = sc.nextInt();

        if(size <=0){
            System.out.println("Kích thước rỗng");
            return;
        }
        int[] arr = new int [size];
        for(int i = 0 ; i < size ; i++){
            System.out.println("Gía trị của mảng " +(i+1) + ": ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Mảng ban đầu là: ");
        for(int value : arr){
            System.out.print(value +" ");
        }
        System.out.println();
        for(int i = 0 ; i < size /2 ; i++){
            int temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }
        System.out.println("Mảng khi đảo ngược là: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}