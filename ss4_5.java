import java.util.Scanner;

public class ss4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng");
        int row =  sc.nextInt();
        System.out.println("Nhập số cột");
        int col =  sc.nextInt();
        System.out.println("Nhập các phần tử cho mảng(theo hàng): ");


        int arr[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();


            }

        }
        for (int i = 0; i < row; i++) {
            System.out.print("Hàng " + (i + 1) + ": ");

            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        int even_number = 0;
        int odd_number = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                if(arr[i][j] %2==0){
                    even_number +=arr[i][j];

                }else{
                    odd_number +=arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số chẵn là : " + even_number);
        System.out.println("Tổng các số lẻ là : " + odd_number);



    }
}
