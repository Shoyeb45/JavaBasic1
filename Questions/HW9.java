//programme for checking prime number

import java.util.*;

public class HW9 {
    public class Main{
        public static void main(String[] args){
Scanner sc = new Scanner (System.in);
System.out.print("Please enter a number to check it is prime or not:");  int n =sc.nextInt();
   boolean p = true;
   for(int i=2;i<=n/2;i++){
    if(n % i ==0){
        p=false;
        break;
    }
}
   if (p){
    if(n==1){
        System.out.println("Neither prime nor composite");
    } else {
        System.out.println("Prime number");
    } 
}
    else{
        System.out.println("not a prime number");
    
   }






sc.close();
 }
 
 }       

}
