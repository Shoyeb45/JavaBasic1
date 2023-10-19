//Adult or not 

import java.util.*;
public class conditionals1 {
     public class Main{
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
 System.out.print("Enter your age:");   int age = sc.nextInt();
 sc.close();  
    if(age>18){
        System.out.print("you are adult");
}    else{
    System.out.print("you are not adult");

    }
}
  }
}
