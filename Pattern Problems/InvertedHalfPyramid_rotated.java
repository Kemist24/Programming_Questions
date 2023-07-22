/**
 * Main
 */
public class InvertedHalfPyramid_rotated {

  public static void main(String[] args) {
     int n = 4;
   

     for(int i = 1; i<=n; i++)
     {
      for(int j = 1; j<=n-i; j++) // n-i spaces hongi har row me
      {
         System.out.print(" ");
      }
      for(int j = 1; j <=i; j++) // i stars honge har row me
      {
         System.out.print("*"); 
      }
      System.out.println();
     }
  }
}