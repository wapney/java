import java.util.Scanner;

public class ss4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        int n = sc.nextInt();
        int [] arr = new int [n];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        selection_sort(arr);

        System.out.print("Mảng sau khi sắp xếp theo thứ tự giảm dần: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nNhập số cần tìm: ");
        int target = sc.nextInt();
        int result_binarny = binarysearch(arr,target);
        int result_linear = lineasearch(arr,target);

        if(result_binarny==-1){
            System.out.println("Không tìm thấy: "+target);
        }else {
            System.out.println("Tìm kiếm tuyến tính: Phần tử " +target+" tại chỉ số: "+result_linear );
            System.out.println("Tìm kiếm nhị phân: Phần tử " +target+" tại chỉ số: "+result_linear);
        }
        if(result_binarny==-1){
            System.out.println("Không tìm thấy: "+target);
        }else {
            System.out.println("Tìm kiếm tuyến tính: Phần tử " +target+" tại chỉ số: "+result_binarny );
            System.out.println("Tìm kiếm nhị phân: Phần tử " +target+" tại chỉ số: "+result_binarny);
        }



    }
    public static void selection_sort (int [] arr){
        for(int i= 0 ;i<arr.length-1;i++){
            int max = i ;
            for (int j = i+1 ; j<arr.length ; j++){
                if(arr[j]>arr[max]){
                    max = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

        }

    }

    public static int binarysearch(int [] arr ,int target){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;

    }
    public static int lineasearch(int [] arr, int target){
        for(int i= 0 ;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
