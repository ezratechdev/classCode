import java.rmi.*;
import java.rmi.registry.*;

public class MyServer{

public static void main(String args[]){
try{

// Adder stub=new AdderRemote();
Adder  area = new AdderRemote();
// Naming.rebind("rmi://localhost:5000/sonoo",stub);
Naming.rebind("rmi://localhost:5000/sonoo",area);

}catch(Exception e){System.out.println(e);}
}

}
