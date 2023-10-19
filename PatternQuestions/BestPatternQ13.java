//palindromic Pattern

public class HW12 {
    public class Main{
public static void main(String[] args){
     int n = 5;

for(int i =1; i<=n ; i++){
  //space
    for(int j=1; j<=n-i ; j++){
        System.out.print(" ");
    } 
  //for first half number
    for(int j=i ;j>=1 ;j--) {
        System.out.print(j);
    } 
    //second half number
    for(int j=2 ; j<=i ; j++){
        System.out.print(j);
    }
        System.out.println();
}     

}       
    }
}
