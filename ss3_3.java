import java.util.Scanner;

public class ss3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice ;

        int employee = 0;
        int sum = 0;
        int max_salary = 0;
        int min_salary = 500000000;
        int bonus =0;
        int total_bonus = 0;
        do{
            System.out.println("============MENU===========");
            System.out.println("1.Nhập lương nhân viên");
            System.out.println("2.Hiển thị thông tin");
            System.out.println("3.Tính tổng lương nhân viên");
            System.out.println("4.Thoát");
            System.out.println("Lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    while(true){
                        System.out.println("----Nhập lương nhân viên (Nhập -1 để kết thúc)----");
                        System.out.println("Nhập lương: ");
                        if(!sc.hasNextInt()){
                            sc.nextLine();
                            System.out.println("Vui lòng nhập chữ số");
                        }
                        int salary = sc.nextInt();

                        if(salary == -1){
                            System.out.println("Chương trình kết thúc");
                            break;
                        }
                        if(salary < 0 || salary > 500000000){
                            System.out.println("Hãy nhập lương từ 0-500000000");
                            continue;

                        }
                        if(salary < 5000){
                            System.out.println("Phân loại lương: Thấp");
                            bonus = salary * 5 / 100;
                        }else if(salary < 15000 ){
                            System.out.println("Phân loại lương : Trung bình thấp");
                            bonus = salary * 10 / 100;
                        }else if(salary < 50000){
                            System.out.println("Phân loại lương : Trung bình");
                            bonus = salary * 15 / 100;
                        }else if(salary < 100000){
                            System.out.println("Phân loại lương : Trung bình cao");
                            bonus = salary * 20 / 100;
                        }else{
                            System.out.println("Phân loại lương : Cao");
                            bonus = salary * 25 / 100;
                        }
                        total_bonus+=bonus;
                        employee ++;
                        sum += salary;
                        if (salary > max_salary) {
                            max_salary = salary;
                        }
                        if (salary < min_salary) {
                            min_salary = salary;
                        }

                    }
                    break;
                    case 2:

                        if (employee ==0){
                            System.out.println("Chưa có nhân viên nào");
                            break;
                        }
                        int average = sum / employee;
                        System.out.println("Số nhân viên đã nhập: " + employee);
                        System.out.println("Lương trung bình: "+average);
                        System.out.println("Lương cao nhất:"+max_salary);
                        System.out.println("Lương thấp nhất: "+min_salary);
                        System.out.println("Tổng tiền lương: "+sum);
                    break;
                    case 3:
                        System.out.println("Tổng tiền thưởng nhân viên: " + total_bonus);
                        break;
                    case 4:
                        System.out.println("Kết thúc chương trình");
                        break;
                    default:
                        System.out.println("lựa chọn không hợp lệ");

            }



        }while(choice !=4);
    }
}