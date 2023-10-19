/*hollow rectangle:*****
                   *   *
                   *   *
                   *****      */
public class BestPatternQ2 {
    public class Main{
public static void main(String[] args){
int n=4;  int m=5;
//we  need star in only that cell of matrix where i={1,n} or j={1,m}   

for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            
    //  "||" is used for "or"      
            if(i==1 || i==n || j==1 || j==m){
System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        
        } 
System.out.println(" ");        
    }





}        
    }
}
