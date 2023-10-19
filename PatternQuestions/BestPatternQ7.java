/*Floyd's Traingle:1
                   2  3
                   4  5  6
                   7  8  9  10
                   11 12 13 14 15  */
   
public class BestPatternQ7 {
  public class Main{
public static void main(String[] args) {

   int n= 5;   int m = 1;
     for(int i=1 ;i<=n  ;i++ ) {
        for(int j=1 ;j<=i ;j++){
  
  System.out.print(m+" ");  

        //and here the most important thing
               m++;
      }
  System.out.println();
    }
}
 } 
}
