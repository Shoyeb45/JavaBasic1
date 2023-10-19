//print all even numbers till n

import java.util.*;

public class HW6 {
    public class Main{
        public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number till you want even numbers:"); int n = sc.nextInt();
sc.close();

if(n%2==0){
    for(int i=1;i<=n/2;i++){
        System.out.print(2*i+" ");
    }
}else{
    for(int j=1;j<=(n-1)/2;j++){
        System.out.print(2*j+ " ");
    }
}
        }
    }
}
