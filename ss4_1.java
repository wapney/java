import java.util.Scanner;

public class ss4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng");
        int[] arr = new int[5];





        for (int i = 0; i < 5; i++) {
            System.out.print("Gía trị "+ (i+1) +": " );
            arr[i] = sc.nextInt();

        }

        selection_sort(arr);

        for (int value : arr) {
            System.out.print(value+" ");
        }

    }
    public static void selection_sort(int[]arr ){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int max = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

        }


    }
}
