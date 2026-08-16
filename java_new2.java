

public static void main(String[]args) {

    // bài 1
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Nhap So bat ky: ");
//    int n =sc.nextInt();
//
//    if(n==0){
//        System.out.println("So 0 khong phai chan va le");
//    }else if(n%2==0){
//        System.out.println("So chan: "+n);
//    }else {
//        System.out.println("So le: " +n);
//    }
//
//    sc.close();

    // bài 2
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Nhap so tu 1->7: ");
//    int n =sc.nextInt();
//
//    switch(n){
//        case 1:
//            System.out.println("Thu 2");
//            break;
//        case 2:
//            System.out.println("Thu 3");
//            break;
//        case 3:
//            System.out.println("Thu 4");
//            break;
//        case 4:
//            System.out.println("Thu 5");
//            break;
//        case 5:
//            System.out.println("Thu 6");
//            break;
//        case 6:
//            System.out.println("Thu 7");
//            break;
//        case 7:
//            System.out.println("Chu nhat");
//            break;
//        default:
//            System.out.println("So khong hop le");

//    }
//    sc.close();

    // bài 3
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Nhap vao mot so nguyen duong: ");
//    int n = sc.nextInt();
//    int sum = 0;
//
//    for (int i = 1; i <= n; i++) {
//        if (n > 0) {
//            sum += i;
//        }
//    }
//    if (n < 0) {
//        System.out.println("So khong hop le");
//    } else {
//        System.out.println("Ket qua la: " + sum);
    //}
    //bài 4
//    int age = 0 ;
//    Scanner sc= new Scanner(System.in);
//    System.out.println("hay nhap tuoi cua ban: ");
//    age = sc.nextInt();
//
//    while(age <= 0){
//        System.out.println("Tuoi khong hop le");
//        System.out.println("vui long nhap lai");
//        age = sc.nextInt();
//    }
//    System.out.println("tuoi cua ban la: "+

    // bài 5

//    Scanner sc=new Scanner(System.in);
//    System.out.println("hay nhap thang: ");
//    int month = sc.nextInt();
//
//    switch(month){
//        case 1:
//            System.out.println("co 31 ngay");
//            break;
//        case 2:
//            System.out.println("co 28 hoac 29 ngay");
//            break;
//        case 3:
//            System.out.println("co 31 ngay");
//            break;
//        case 4:
//            System.out.println("co 30 ngay");
//            break;
//        case 5:
//            System.out.println("co 31 ngay");
//            break;
//        case 6:
//            System.out.println("co 30 ngay");
//            break;
//        case 7:
//            System.out.println("co 31 ngay");
//            break;
//        case 8:
//            System.out.println("co 31 ngay");
//            break;
//        case 9:
//            System.out.println("co 30 ngay");
//            break;
//        case 10:
//            System.out.println("co 31 ngay");
//            break;
//        case 11:
//            System.out.println("co 30 ngay");
//            break;
//        case 12:
//            System.out.println("co 31 ngay");
//            break;
//        default:
//            System.out.println("thang khong hop le");
//    }
      // bài 6
//      Scanner sc=new Scanner(System.in);
//      System.out.println("nhap vao so nguyen duong: ");
//      int n = sc.nextInt();
//
//      n = Math.abs(n);
//
//      int sum = 0;
//
//      if(n==0){
//          sum=0;
//      }else{
//          while(n>0){
//              sum +=n%10;
//              n/=10;
//          }
//      }
//    System.out.println("ket qua la: "+sum);

    //bài 7
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Nhap canh a:");
//    int a =  sc.nextInt();
//    System.out.println("Nhap canh b:");
//    int b = sc.nextInt();
//    System.out.println("Nhap canh c:");
//    int c = sc.nextInt();
//
//    int sum = a+b+c;
//    int ab = a+b;
//    int ac = a+c;
//    int bc = b+c;
//
//    if(ab > c & bc > a & ac >b ) {
//        System.out.println("tam giac hop le");
//        if(a == b && b == c){
//            System.out.println("tam giac deu");
//        }else if (a==b || a==c||c==b) {
//            System.out.println("tam giac can");
//        } else if (a*a +b*b == c*c ||
//                   a*a +c*c == b*b ||
//                   c*c +b*b == a*a) {
//            System.out.println("tam giac vuong");
//
//        }else {
//            System.out.println("tam giac thuong");
//        }
//    }else {
//        System.out.println("ba canh khong tao thanh tam giac");
//    }



}