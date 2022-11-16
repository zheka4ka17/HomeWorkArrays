public class Pattern25 {
    public static void main(String[] args) {
        int cols = 9;
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j== cols/2-i){
                    int x=0;
                    while(x<i+1){
                    System.out.print(i+1);
                System.out.print(" ");
                x++;}}
                else
                System.out.print(" ");

            }

            System.out.println();
        }
    }
}