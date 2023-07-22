/**
 * Main
 */
public class P_0_1__Triangle {

  public static void main(String[] args) {
     int n = 5;
     

     for(int i = 1; i<=n; i++)
     {
     
      for(int j = 1; j <=i; j++)
      {
         int sum = i+j;
                              // In this pattern we observe when i+j is even we print 1 otherwise 0
          if((sum&1) == 0){  // to check even we can use num & 1 or num %2 ....the & method is way faster because it handles directly in bits.
            System.out.print(1+" ");
         }
         else{   //odd
             System.out.print(0+" ");
         }
      }
      
      
      System.out.println();
     }
  }
}