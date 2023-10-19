//Choosing Greetings

import java.util.*;
public class conditionals4 {
    public class Main{
        public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Choose button from 1,2 or 3:");
 int button = sc.nextInt();
sc.close();
/*if (button==1){
    System.out.print("Hello");
} else if(button==2){
    System.out.print("Namaste");
}else if(button== 3){
    System.out.print("Bonjour");
}else{
    System.out.print("Invalid input");
}*/    //same thing can be produced by using switch/breaks,it can deal with many cases at ease

switch(button){
    case 1:System.out.print("Hello");
    break;
    case 2:System.out.print("Namaste");
    break;
    case 3:System.out.print("Bonjour");
    break;
default:System.out.print("Invalid input");

}


        }
    }
}
