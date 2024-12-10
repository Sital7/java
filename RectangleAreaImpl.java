public interface RectangleArea extends Remote {
    double getArea(double length, double breadth) throws RemoteException;
}
public class RectangleAreaImpl extends UnicastRemoteObject implements RectangleArea {

    protected RectangleAreaImpl() throws RemoteException {
        super();
    }

    @Override
    public double getArea(double length, double breadth) throws RemoteException {
        return length * breadth;
    }
}


public  class rmi{
    public static voiid main (string [] args)
    Try {
        

    }
}