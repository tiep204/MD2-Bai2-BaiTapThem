import javax.jws.soap.SOAPMessageHandlers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
        //        1. In ra các số chẵn và tính tổng trong khoảng 0...n
//        2. In ra các số lẻ và tính tổng trong khoảng 0...n
//        3. Kiểm tra n có phải số nguyên tố không
//        4. Kiểm tra n có phải số hoàn hảo không
//        5. In ra các số nguyên tố trong khoảng 0...n
//        6. In ra các ước số của n và tính tổng
//        7. Thoát

        Scanner sc = new Scanner(System.in);

        System.out.println("bạn hãy nhập số bất kỳ vào đây: ");
        int number = Integer.parseInt(sc.nextLine());
        int choiDe;
        boolean check;


        do {
            System.out.println("*******************MENU*************************");
            System.out.println("1. In ra các số chẵn và tính tổng trong khoảng 0...n ");
            System.out.println("2. In ra các số lẻ là tính tổng trong khoảng 0...n");
            System.out.println("3. Kiểm tra n có phải là số hoàn hảo không ");
            System.out.println("4. Kiểm tra n có phải là số nguyên tố không ");
            System.out.println("5. In ra các ước số của n và tính tổng ");
            System.out.println("6. In ra các số nguyên tố trong khoảng từ 0...n");
            System.out.println("7. Thoát");

            choiDe = sc.nextByte();
            int sum = 0;

            switch (choiDe) {
                case 1:
                    System.out.println("các số chẵn từ 0 đến " + number + " là: ");
                    for (int i = 0; i <= number; i++) {
                        if (i % 2 == 0) {
                            sum += i;
                            System.out.println(i);
                        }
                    }
                    System.out.println("");
                    System.out.println("tổng của các số chẵn là: " + sum);
                    break;
                case 2:

                    System.out.println("các số lẻ từ 0 đến" + number + " là: ");
                    for (int i = 0; i <= number; i++) {
                        if (i % 2 != 0) {
                            sum += i;
                            System.out.println(i);
                        }
                    }
                    System.out.println("");
                    System.out.println("tổng của các số lẻ là: " + sum);
                    break;
                case 3:
                    if (number >= 2) {
                        check = false;
                        ///tìm các ước của n từ 2 .... n-1
                        for (int i = 2; i < Math.sqrt(number); i++) {
                            if (number % i == 0) {
                                check = true;
                                break;
                            }
                        }
                        if (check) {
                            System.out.println(number + " là một số nguyên tố");
                        } else {
                            System.out.println(number + " không phải là số nguyên tố");
                        }
                    }
                    break;
                case 4:
                    System.out.println("");
                    for (int i = 1; i <= number / 2; i++) {
                        if (number % i == 0) {
                            sum += i;
                        }
                    }
                    if (sum == number) {
                        System.out.printf("%d là số hoàn hảo\n\n", number);
                    } else {
                        System.out.printf("%d không phải số hoàn hảo\n\n", number);
                    }
                    break;
                case 5:
                   /// duyệt các số từ 2 đến N
                    if (number>=2){
                        System.out.println("các số nguyên tố là: ");
                        for (int i = 2; i <= number ; i++) {
                            ////kiểm tra i có phải là số nguyên tố hay không?
                            check = false;
                            for (int j = 2; j < Math.sqrt(i) ; j++){
                                if (i%j == 0){
                                    //j là ước của i
                                    check = true;
                                    break;
                                }
                            }
                            if(!check){
                                ///
                                System.out.println(i);
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 6:
                   sum = 0;
                   System.out.println("các ước của "+number+ " là: ");
                   for (int i=1; i<=number; i++) {
                       if (number%i==0) {
                           ///i là ước của number
                           System.out.println(i);
                           sum +=i;
                       }
                   }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("xin vui lòng nhập từ 0-7");
            }
        } while (true);

    }
}