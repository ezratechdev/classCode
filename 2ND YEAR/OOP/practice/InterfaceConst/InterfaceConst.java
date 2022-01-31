package InterfaceConst;

interface InterfaceConstData{
    public void data();
    // Integer id;

}

public class InterfaceConst implements InterfaceConstData {
    public void data(){
        System.out.println("Hi am data");
    }
    public static void main(String[] args){
        InterfaceConst obj = new InterfaceConst();
        obj.data();
    }
}
