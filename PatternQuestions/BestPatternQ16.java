//Inverted Half Pyramid
        import java.util.*;
  
public class HW15 {
    public class Main{
        public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number:") ;       int n =sc.nextInt();
                int i,j;
     
for(i=n ; i>=1 ; i--){
     for(j=1; j<=i ; j++ ){
        
        System.out.print(n-i+1);
       
     }
        System.out.println();
}  

}
    }
}
