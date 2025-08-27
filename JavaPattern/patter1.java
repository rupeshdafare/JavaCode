
package JavaPattern;

public class patter1 {


    // ******
    // *    *
    // *    *
    // *    *
    // *    *
    // *    *
    // ******

    public static void main(String[] args) {
        // pattern 1
        int row=6;
        int col=6;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                if(i==0||j==0||i==row-1||j==col-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }
    }

    
}