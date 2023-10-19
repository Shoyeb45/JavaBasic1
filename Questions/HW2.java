//Area and radius of circle

import java.util.*;

public class HW2 {
  public class Main{
public static void main (String[] args){
Scanner sc = new Scanner (System.in);
System.out.print("This programme will calculate the radius and area of circle upon entering diameter\n");
System.out.print("Enter diameter(D):"); double D = sc.nextDouble();
double r = D/2;
System.out.print("Radius of cirlcle(r):") ; System.out.println(r);
final double π = 3.14 ; 
double A = π*r*r;
System.out.print("Area of circle:");   System.out.print(A);  


sc.close();
}
  }    
}
