import java.util.Scanner;

public class ss4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên cho mảng là 5: ");
        int [] arr = new int[5];

        int  total = 0 ;



        for (int i = 0 ; i<arr.length ; i++){

            while(!sc.hasNextInt()){
                System.out.print("Hãy nhận vào số nguyên");
                sc.next();
            }
            arr[i] = sc.nextInt();
            total = total + arr[i];

        }
        System.out.println("Tổng các phần tử trong mảng là: "+total);



    }
}
