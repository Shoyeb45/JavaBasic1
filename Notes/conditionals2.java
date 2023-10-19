//Even or odd

import java.util.*;
public class conditionals2 {
    public class Main{
        public static void main (String[] args){
Scanner sc = new Scanner(System.in);
 System.out.print("Enter any integer number:");    int a = sc.nextInt();
sc.close();
 if (a%2 == 0){
    System.out.print("Entered number is even");
  } else{
    System.out.print("Entered number is odd");
  }

        }
        
    }
}
