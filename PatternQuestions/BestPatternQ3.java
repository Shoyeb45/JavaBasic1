//half pyramid problem(4*4)-(lower and inverted lower triangular matrix)
public class BestPatternQ3 {
    public class Main{
public static void main(String[] args){
 int n=4;
 
 for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
  if( i==j || i>j) {
    System.out.print("*");
  }
  else{
    System.out.print(" ");
  }
    }
    System.out.println(" ");
}
 
   //2nd way to run same the thing:defining upper limit for inner for loop code, i.e., i=j
 for(int i=1; i<=n ;i++){

    for(int j=1; j<=i ;j++){
      System.out.print("*");
    }
    System.out.println(" ");
 }
 System.out.println("Inverted");
   //inverted lower triangle matrix- we've use decreament operator and inverted the code 
   
for (int i=n;i>=1;i--){
   for (int j=1 ; j<=i ; j++ ){
    System.out.print("*");
   }
    System.out.println(" ");
  }
}
    }
  }