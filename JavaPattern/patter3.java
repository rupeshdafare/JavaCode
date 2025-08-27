package JavaPattern;

public class patter3 {
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * * * *
    // * * * * * * *
    // * * * * * * * *
    // * * * * * * * * *
    // * * * * * * * * * *
    // * * * * * * * * * * *

    public static void main(String[] args) {
        int row = 8;
        int col = 8;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j + i > row  && j - i < 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
