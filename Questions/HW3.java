//HW-3:Taking integral number as input and giving tha table of that number as output.
import java.util.*;

public class HW3 {
     public class Main{
        public static void main(String[] args){
Scanner sc=new Scanner(System.in);
   System.out.print("Enter a integral number to get table:"); int a=sc.nextInt();
System.out.print("Your choosen number is:");  System.out.println(a);   
    /*int a1 = a*1; 
    int a2 = a*2;
    int a3 = a*3;
    int a4 = a*4;
    int a5 = a*5;        
    int a6 = a*6;
    int a7 = a*7;
    int a8 = a*8;
    int a9 = a*9;
    int a10 = a*10;
    System.out.print(a);System.out.print("*1=");    System.out.println(a1);
    System.out.print(a);System.out.print("*2=");System.out.println(a2);
    System.out.print(a);System.out.print("*3="); System.out.println(a3);
    System.out.print(a);System.out.print("*4=");System.out.println(a4);
    System.out.print(a);System.out.print("*5=");System.out.println(a5);
    System.out.print(a);System.out.print("*6=");System.out.println(a6);
    System.out.print(a);System.out.print("*7=");System.out.println(a7);
    System.out.print(a);System.out.print("*8=");System.out.println(a8);
    System.out.print(a);System.out.print("*9=");System.out.println(a9);
    System.out.print(a);System.out.print("*10=");System.out.println(a10);*/
sc.close();
//now we are going to do same thing but by using loop;this is after learning loops.

for(int i=1;i<=10;i++){
 System.out.print(a);System.out.print("*"+i+"=");  System.out.println(a*i);
}
//Look how we did this code in just 2 code statement.
}




     }
}
