//Pascal's Triangle

import java.util.*;

public class HW13{
     //To calculate Factorial
 
public static int CalFacto(int n){
         int facto =1; 
for(int i=n; i>=1 ; i--){
        facto=facto*i;
    }
    //We can also use recursion instead of loops.
     return facto;
 }

    public class Main{
        public static void main(String[] args){
Scanner sc = new Scanner(System.in);

     System.out.print("Enter Positive integral(<=15) number:");   int n =sc.nextInt();
                 sc.close();
    int i,j;   
 
for(i=1 ; i<=n ;i++){
  //space
    int space=n-i;
     for(j=1 ; j<=space ; j++) { 
         System.out.print(" ");
    }
for(j=1 ; j<=i ; j++){
       //defining variables for Number in Pascal's Triangle    
    int x =CalFacto(i-1);   int y =CalFacto(j-1);    int a = CalFacto(i-j);
         System.out.print(x/(a*y)+" ");

}
         System.out.println();

}
    

    
    
                      
        }
    }   
}
