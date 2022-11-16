public class Pattern28 {
    public static void main(String[] args) {

        int cols = 5;
        int rows = 7;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j==0)
                    System.out.printf("%d \t", i+1);
                if(i<=rows/2){
                     if(j>0 && j<=i)
                    System.out.printf("%d \t", (i+1)*(j+1));}

                else if (i>rows/2-1)
                    if(j<rows-i && j>0)
                        System.out.printf("%d \t", (i+1)*(j+1));
            }
            System.out.println();


            }
        }
    }
