import java.util.Scanner;

public class ss3_2{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int choice;

        int total_student = 0;
        float total_point = 0;
        float min = 10;
        float max = 0;

        do {
            System.out.println("=======Meun======");
            System.out.println("1.Nhập điểm học viên");
            System.out.println("2.Hiển thị thống kê");
            System.out.println("3.Thoát");
            System.out.println("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("---Nhập điểm học viên (nhập -1 để dừng---)");
                        System.out.println("Nhập điểm: ");

                       // kiểm tra trứớc
                        if (!sc.hasNextFloat()) {
                            System.out.println("Vui lòng nhập số!");
                            sc.next();
                            continue;
                        }

                        float score = sc.nextFloat();


                        if (score == -1) {
                            break;
                        }
                        if (score < 0 || score > 10) {
                            System.out.println("Điểm không hợp lệ");
                            continue;
                        }


                        // tính số học viên
                        total_student++;
                        // tính tổng điểm
                        total_point += score;
                        // tìm điểm cao nhất
                        if (score < min) {
                            min = score;
                        }
                        //tìm điểm cao nhất
                        if (score > max) {
                            max = score;
                        }
                        // phân loại học lực
                        if (score < 5) {
                            System.out.println("Yếu");
                        } else if (score < 7) {
                            System.out.println("Trung bình");
                        } else if (score < 8) {
                            System.out.println("Khá");
                        } else if (score < 9) {
                            System.out.println("Giỏi");
                        } else {
                            System.out.println("Xuất sắc");
                        }

                    }
                    break ;
                case 2:
                    if(total_student == 0){
                        System.out.println("Chưa có dữ liệu");
                        break;
                    }
                    float average =  total_point / total_student;
                    System.out.println("Số lượng học viên là: "+total_student);
                    System.out.println("Điểm trung bình: "+average);
                    System.out.println("Điểm cao nhất: "+ max);
                    System.out.println("Điểm thấp nhất "+min);
                    break;
                case 3:
                    System.out.println("kết thúc chương trình");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ");

            }

        } while (choice != 3);
        sc.close();
    }

}