package Inherit;

public class Inheritance{
    public Integer num1;
    public Integer num2;

    public Inheritance(Integer one , Integer two){
        this.num1 = one;
        this.num2 = two;
    }

    public int adder(){
        return (num1+num2);
    }
    public void display(){
        System.out.println(this.adder());
    }
}