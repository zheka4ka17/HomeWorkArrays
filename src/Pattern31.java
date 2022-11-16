public class Pattern31 {
    public static void main(String[] args) {


        int cols = 5;
        int rows = 5;


      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              if(j>=i){
                  System.out.print(rows-i);
              System.out.print(" ");}
              else if(j>0){
                  System.out.print(rows-j);
                  System.out.print(" ");}
              else System.out.print(rows+" ");}
              System.out.println(" ");
          }
      }
    }
