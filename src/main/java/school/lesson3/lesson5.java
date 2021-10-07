package school.lesson3;

public class lesson5 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(i == 0 ? n : " ");
            for (int k = n-i-1; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

}
