//solid rhombus(my way)

public class HW10 {
    public class Main{
        public static void main(String[] args){
 int n = 5; int m = 9;
 for(int i = 1 ; i<=n;i++){
    for(int j =1;j<=m ; j++){

if( i+j==6 || i+j==7 ||i+j==8 ||i+j==9 ||i+j==10 ){
    System.out.print("*");
}else{
    System.out.print(" ");
}
    }
System.out.println(); 
}  
    //Second way
    
n=5;

for(int i=1; i<=n; i++){

        //space
    for(int j=1 ; j<=n-i ;j++){
        System.out.print(" ");
    }
        //star
    for(int j=1 ;j<=n ;j++){
        System.out.print("*");
    }
 System.out.println();
}
       //Hollow rhombus
    
     
for(int i=1; i<=n ; i++){
        
         int space = n-i; 
     for(int j=1 ; j<=space ;    j++){
        System.out.print(" ");
     }      
     for(int j = 1; j<=n ;j++ ){

        if(j==n || i==n || i==1 || j==1){
        System.out.print("*");    
        }
        else{
            System.out.print(" ");
        }
     } 
            System.out.println();
}
    




}
    }
}
