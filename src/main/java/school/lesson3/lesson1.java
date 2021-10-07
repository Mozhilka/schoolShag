package school.lesson3;

public class lesson1 {
    public static void main(String[] args) {
    for(int i = 0; i < 9; i++) {
        for (int j = 9; j > 0; j--)
            System.out.print(i < j ? " " : "*");

        System.out.println();
       }
    }
}
