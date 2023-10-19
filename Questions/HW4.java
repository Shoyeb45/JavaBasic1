//Simple Calculator

import java.util.*;

public class HW4 {
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("You are going to use simple calculator"); 
 System.out.println("Choose number 'a':");  double a = sc.nextDouble(); 
 System.out.println("Choose number 'b':");  double b = sc.nextDouble();
 System.out.println("Choose operation according to given number:");
 System.out.println("1.Addition(a+b)\n2.Subtraction(a-b)\n3.Multiplication(a*b)\n4.Division or quotient(a/b)\n5.Modulo or remainder(a%b)\nAny other number entered will not be valid.");          
       int button = sc.nextInt();
 switch(button) {
    case 1:  double sum = a+b;   System.out.println(sum);
    break;
    case 2:  double subt = a-b;  System.out.println(subt);
    break;
    case 3:  double mult = a*b; System.out.println(mult);
    break;
    case 4:  double div = a/b; System.out.println(div);
    break;
    case 5:  double modulo = a%b; System.out.println(modulo);
    break;
    default:System.out.print("Invalid operation");
 }
 System.out.print("Thank you for using calculator");
       
       
            sc.close();
}
    }    
}
