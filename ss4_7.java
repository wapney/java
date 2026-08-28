import java.util.Arrays;
import java.util.Scanner;

public class ss4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử của mảng: ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Mảng không hợp lệ");
            return;
        }

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int []result =  removeDuplicate(arr);

        if(result.length == 0){
            System.out.println("Không có phần tử nào duy nhất trong mảng ");
        }else {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]+ " ");
            }

        }

    }
    public  static int [] removeDuplicate(int[] arr){
        int [] temp = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            boolean isDuplicate = false;

            for(int j = 0; j < count; j++){
                if(arr[i]==temp[j]){
                    isDuplicate = true;
                    break;
                }

            }
            if(!isDuplicate){
                temp[count] = arr[i];
                count++;
            }

        }
        // tạo mảng có kích thước chính xác
        int [] result = new int [count];
        for(int i = 0; i < count; i++){
            result[i] = temp[i];
        }
        return result;

    }
}
