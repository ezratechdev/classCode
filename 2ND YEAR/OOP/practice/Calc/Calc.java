package Calc;

public class Calc {
    public int firstInp;
    public int secondInp;
    public void adder(){
        firstInp = 2;
        System.out.println("Hello there \n I am an addder");
    }
    public static void main(String[] args){
        Calc calcer = new Calc();
        calcer.adder();
        // System.out.println("Hello world");
    }
}
