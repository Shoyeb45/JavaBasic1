//Camparing Numbers:

import java.util.*;

public class conditionals3 {
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("You may enter any number upto 2 decimal places");
            System.out.print("Enter number 'a':");    double a = sc.nextDouble();
            System.out.print("Enter number 'b':");   double b = sc.nextDouble();
sc.close();
/*if(a==b){
                System.out.print("both number are equal");   
} 
else{
    if(a>b){
        System.out.print("'a' is greater than 'b'");
} else{
    System.out.print("'a' is lesser than 'b'");

}*/    //second way to write same programme by else if statement
if (a==b){
     System.out.print("both number are equal");
}else if(a>b){
    System.out.print("'a' is greater than 'b'");
} else{
    System.out.print("'a' is lesser than 'b'");
}

    }
}
    }
