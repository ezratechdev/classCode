import java.rmi.*;
public interface Adder extends Remote{

// public int add(int x,int y)throws RemoteException;
public double area(double radius)throws RemoteException;
}
