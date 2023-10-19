//Butterfly pattern

public class BestPatternQ9 {
  public class Main{
public static void main(String[] args){

   int n=4;
   //we'll print upper half and then printing again mirror image
for(int i = 1;i<=n;i++){
       for(int j =1 ;j<=i ; j++){
         System.out.print("*");
}
       for(int j=1; j<=2*(n-i);j++){
         System.out.print(" ");

}      for(int j=1;j<=i;j++){
         System.out.print("*");

}
         System.out.println(); 
   }

   //Lower half:

for(int i = n;i>=1;i--){
       for(int j =1 ;j<=i ; j++){
         System.out.print("*");
}
       for(int j=1; j<=2*(n-i);j++){
         System.out.print(" ");

}      for(int j=1;j<=i;j++){
         System.out.print("*");

}
         System.out.println(); 
   }    



 System.out.println("Hollow Butterfly");  
    
     int m =5;

       //upper half
for(int i = 1; i<=m ; i++){
       for(int j=1 ; j<= i ; j++){
    if(i==j  || j==1){
      System.out.print("*");
    } 
    else{
      System.out.print( " ");
    }
  } 
  //for spaces 
    int s=2*(m-i);
       for(int j=1;j<=s ; j++){
      System.out.print(" ");
  }       
       //lower half
  for(int j=1; j<=i ; j++){
    if(j==1 || i==j){
      System.out.print("*");
    } 
    else{
      System.out.print(" ");
    }
  }
      System.out.println();
}    

//lower part

 
for(int i = n; i>=1 ; i--){
       for(int j=1 ; j<= i ; j++){
    if(i==j  || j==1){
      System.out.print("*");
    } 
    else{
      System.out.print( " ");
    }
  }    int s=2*(m-i);
       for(int j=1;j<=s ; j++){
      System.out.print(" ");
  }     
  
       for(int j=1; j<=i ; j++){
    if(j==1 || i==j){
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

