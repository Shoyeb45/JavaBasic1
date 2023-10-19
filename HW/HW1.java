//declaring meaningful variables in each type

import java.util.*;
 public class HW1{
       public class Main {
public static void main (String[] args){
  Scanner sc = new Scanner (System.in);
 System.out.print("Enter your full name:");   String name = sc.nextLine();
 System.out.print("Enter your age:");       int age = sc.nextInt();
 System.out.print("Enter your Height(in cm):");   float height = sc.nextFloat();
 System.out.print("Enter your weight(in kg):");    float weight = sc.nextFloat();
 System.out.print("Name:");   System.out.println(name);
 System.out.print("Age:");    System.out.println(age);
 System.out.print("Height:"); System.out.println(height);
 System.out.print("Weight:");  System.out.println(weight);
                    System.out.print("             **Thank You**");
   sc.close();


}
      }
 }
