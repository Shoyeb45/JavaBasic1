//number pyramid
    import java.util.*;

public class HW14{
    public class Main{
        public static void main(String [] args){
Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
        int n = sc.nextInt();
             sc.close();
     int i,j;

for(i=1 ; i<=n ; i++){
         int space=n-i;
    for(j=1 ; j <=space;j++){
           System.out.print(" ");
    }
    for( j=1; j<=i; j++){
           System.out.print(j+" ");
    }
           System.out.println();
}            
   

        }
    }
}