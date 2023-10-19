//User driven programme

import java.util.*;

public class HW8 {
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
           
int input;
do{
   System.out.print("Please enter your marks in mathematics:"); int m = sc.nextInt(); 
if(m>=90 && m<=100){
    System.out.println("This is good");
}else if (m>=60 && m<=89){
    System.out.println("This is also good");
}else if(m>=0 && m<=59){
    System.out.println("this is good as well");
} else{
    System.out.println("invalid");
}
    System.out.print("do you want to continue ? Yes(1) or No(0):"); 
        input=sc.nextInt();
}
while(input==1);
    sc.close();

       }
    }
}
