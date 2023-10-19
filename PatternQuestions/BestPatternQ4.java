//inverted half pyramid (rotated by 180 degree)
public class BestPatternQ4 {
   public class Main{
public static void main(String[] args){
  int n =4;
//To nested loops - one for space and one for star

  for(int i=1;i<=n;i++) {
   //space
for(int j =1 ;j<=n-i ;j++){
   System.out.print(" ");
}  
for(int j =1;j<=i;j++){
   System.out.print("*");

}  System.out.println();

   }

}    
   } 
}
