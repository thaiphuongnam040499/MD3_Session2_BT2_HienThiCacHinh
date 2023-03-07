public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("In Hinh Chu Nhat");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("In Hinh Tam Giac");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
