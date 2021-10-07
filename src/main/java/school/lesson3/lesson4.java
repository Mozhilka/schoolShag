package school.lesson3;

public class lesson4 {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j < 9; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= c; k++) {
                if (k % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
            c += 2;
        }
    }
}
