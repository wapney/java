import java.util.Scanner;

public class ss4_3 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Kích thước của mảng là 4: ");
         int [] arr = new int[4];

         for(int i = 0; i < arr.length; i++){

             while (!sc.hasNextInt()){
                 System.out.println("hãy nhận các số nguyên");
                 sc.nextInt();
             }
             arr[i] = sc.nextInt();

         }
         bubble_sort(arr);

         System.out.print("Mảng sau khi đã được sắp xếp: ");
         for(int value :arr){
             System.out.print(value+ "");
         }


    }
     public static void bubble_sort(int arr[]) {
         for (int i = 0; i < arr.length - 1; i++) {
             for (int j = i; j < arr.length - i - 1; j++) {
                 if (arr[j] < arr[j + 1]) {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }
             }
         }

     }
}
