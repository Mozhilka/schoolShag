package school.lesson3;

public class lesson2 {
    public static void main(String[] args) {
        for (int i=1;i<9;i++){
            for (int j=1;j<9;j++){
                if (i==j-1){
                    break;
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

