import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // bai 1
        System.out.println("Hello , Java");

        // bai 2
        String name = "Nguyen van A";
        int age = 20;
        String address = "Hai Phong";

        System.out.printf("Toi Ten la %s , toi %d tuoi , hien tai toi song o %s.%n ",name,age,address);

        // bai 3
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Nhap ban kinh hinh tron : ");
//
//        double banKinh = sc.nextDouble();
//        double dienTich = Math.PI * banKinh* banKinh;
//
//        System.out.println(dienTich);
//        sc.close();
//
        // bai 4
//        int a =  10;
//        int b =  5;
//
//        int tong = a+b ;
//        int hieu = a-b ;
//        int tich = a*b ;
//        int thuong = a/b;
//        int du = a%b;
//        System.out.println("Tong 2 so a + b = " + tong);
//        System.out.println("hieu 2 so a - b = " + hieu);
//        System.out.println("tich 2 so a * b = " + tich);
//        System.out.println("thuong 2 so a / b = " + thuong);
//        System.out.println("du 2 so a % b = " + du);

        // bai 5
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhap tu cua a: ");
//        int a = sc.nextInt();
//
//        System.out.println("Nhap mau cua b: ");
//        int b = sc.nextInt();
//
//        System.out.println("Nhap mau cua c: ");
//        int c = sc.nextInt();
//
//        System.out.println("Nhap mai cua d: ");
//        int d = sc.nextInt();
//
//        int tuTong = a * d +b *c ;
//        int mauTong = b*d ;
//
//        System.out.println("Ket qua la: " +tuTong+ " /" + mauTong);

        // bai 6

        float width ;
        float height ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Chieu Rong: ");
        width = sc.nextFloat();

        System.out.println("Chieu Dai: ");
        height = sc.nextFloat();

        float area = width*height;
        float circumference = 2*(width+height);

        System.out.println("Area is "+area);
        System.out.println("Circumference is "+circumference);


    }
}