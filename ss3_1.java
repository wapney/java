import java.util.Scanner;

public  class ss3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten khach hang: ");
        String name = sc.nextLine();

        System.out.println("Ten san pham: ");
        String product = sc.nextLine();

        System.out.println("Gia san pham: ");
        double price = sc.nextDouble();

        System.out.println("So luong: ");
        double quantity = sc.nextDouble();

        System.out.println("Da co the thanh vien chua(true/false): ");
        boolean membership = sc.nextBoolean();

        double amount = price * quantity;

        double discount = 0 ;
        if (membership) {
            discount = amount * 0.10;
        }

        double vat = amount * 0.08;

        double total = amount - discount + vat;

        System.out.println("khach hang: " + name);
        System.out.println("san pham: " + product);
        System.out.println("gia san pham: " + price);
        System.out.println("so luong: " + quantity);
        System.out.println("thanh tien: "+amount);
        System.out.println("gia giam: "+discount);
        System.out.println("vat : "+vat);
        System.out.println("tong thanh toan: "+total);













    }
}