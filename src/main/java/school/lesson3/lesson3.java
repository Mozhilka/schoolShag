package school.lesson3;

public class lesson3 {
    public static void main(String[] args) {
        int count=9;
        for(int i = 0; i<count; ++i) {
            for (int j = 0; j < i; ++j)
                System.out.print("*");
            System.out.println();
        }
    }
}

