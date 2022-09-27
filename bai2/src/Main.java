import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        *************MENU*****************
//        1. Nhập thông tin sinh viên
//        2. Hiển thị thông tin sinh viên
//        3. Tính tuổi sinh viên
//        4. Thoát

        Scanner sc = new Scanner(System.in);
        String maSV = "";
        String tenSV = "";
        boolean sex = true;
        int age =0;
        String queQuan = "";



        do{
            System.out.println("********************MENU******************");
            System.out.println("1. Nhập thông tin của sinh viên ");
            System.out.println("2. Hiển thị thông tin sinh viên ");
            System.out.println("3. Tính tuổi sinh viên ");
            System.out.println("4. Thoát");

            int chon = Integer.parseInt(sc.nextLine());


            switch (chon){
                case 1:

                    System.out.println("hay nhap ma sinh vien: ");
                    maSV = sc.nextLine();

                    System.out.println("hay nhap ten sinh vien: ");
                    tenSV = sc.nextLine();

                    System.out.println("hay nhap gioi tinh: ");
                    sex = Boolean.parseBoolean(sc.nextLine());

                    System.out.println("Hãy nhập năm sinh của bạn: ");
                    age =Integer.parseInt(sc.nextLine());

                    System.out.println("hay nhap quê quán: ");
                    queQuan = sc.nextLine();

                    break;
                case 2:
                    System.out.println("Mã sinh viên : "+maSV+"       Tên Sinh viên :"+tenSV+"      Giới Tính: "+sex);
                    System.out.println( "age :"+age+  "    quê quán: "+queQuan);
                    break;
                case 3:


                    System.out.println("tuổi tính năm nay của bạn là: "+ (2022 - age)+" tuổi");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("xin vui lòng nhập từ 1-4");
            }


        }while (true);
    }
}