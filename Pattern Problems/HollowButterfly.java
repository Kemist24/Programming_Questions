/**
 * Main
 */
public class HollowButterfly {

  public static void main(String[] args) {
     int n = 5;
     
     

    
      for(int i=1; i<=n; i++)
     {
      for(int j=1; j<=i; j++)
      {
         if(j==1 || j==i){
               System.out.print("*");
         }
         else{
               System.out.print(" ");
         }
         
      }
      int spaces = 2*(n-i);
      for(int j=1; j<=spaces; j++)
      {
         System.out.print(" ");
      }
      for(int j=1; j<=i; j++)
      {
         if(j==1 || j==i){ // when j ==1 or j == i print * else print space
               System.out.print("*");
         }
         else{
               System.out.print(" ");
         }
      }

      System.out.println();
     }
     for(int i=n; i>=1; i--)
     {
      for(int j=1; j<=i; j++)
      {
         if(j==1 || j==i){
               System.out.print("*");
         }
         else{
               System.out.print(" ");
         }
      }
      int spaces = 2*(n-i);
      for(int j=1; j<=spaces; j++)
      {
         System.out.print(" ");
      }
      for(int j=1; j<=i; j++)
      {
         if(j==1 || j==i){
               System.out.print("*");
         }
         else{
               System.out.print(" ");
         }
      }

      System.out.println();
     }
      
      
      
     
  }

}