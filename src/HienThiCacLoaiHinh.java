import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int choice;
            System.out.println("1.\tPrint the rectangle\n" +
                    "2.\tPrint the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "3.\tPrint isosceles triangle\n" +
                    "4.\tExit\n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("thoat chuong trinh");
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    }
}
