import java.rmi.*;
import java.util.Scanner;

public class MyClient{

public static void main(String args[]){
try{
    System.out.println("Enter The radius of the circle below");
    Float radius = new Scanner(System.in).nextFloat();
Adder adder =(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
System.out.println("A circle of radius " + radius + " has an area of " + adder.area(radius));

}catch(Exception e){System.out.println(e);}
}

}
