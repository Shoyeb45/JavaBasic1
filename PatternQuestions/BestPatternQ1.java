//solid rectangle(5*4 rectangle-star)

public class BestPatternQ1 {
   public class Main{
public static void main(String[] args){
//first way:

   for(int i =1;i<5;i++){
   System.out.println("*****");
} 
//second way
System.out.println("Using nested loop:");
for(int j=1;j<5;j++){
   for(int x=1;x<6;x++){
      System.out.print("*");
   }System.out.println();
}

}
   }   
}
