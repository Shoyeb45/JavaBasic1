public class loops{
    public class Main{
        public static void main(String[] args){

 //1.using for loop         

        /*   for(int counter =0 ; counter<40;counter=counter+1){
            System.out.print("Muda ");
          }*/
 //printing integral numbers from  [1,10]
 //instead of counter=counter+1 ,we can write it as counter++            
          
  for(int counter =1 ; counter<11;counter=counter+1){
            System.out.println(counter);

          }  
//2.now same output using while loop
    
int a = 0;
while(a<11){
  System.out.print(a+" ");   a=a+1;
}
        
//3.same code output with do while loop keyword
  
int i = 0;
do{
  System.out.print("\n"+i+" ");
  i=i+1;
}while(i<15);
/*Infinite loop
int i = 0;
do{
  System.out.print("\n"+i+" ");
  i=i+1;
}while(i>0);  */
}
    }
}