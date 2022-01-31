package Inherit;

public class Inheritance{
    // public Integer num1;
    // public Integer num2;

    // public Inheritance(Integer one , Integer two){
    //     this.num1 = one;
    //     this.num2 = two;
    // }

    public int adder(Integer num1 , Integer num2){
        return (num1+num2);
    }
    public class Inheriter extends Inheritance{
        public void display(){
            System.out.println(this.adder(1,2));
        }

    }

    public static void main(String[] args){
        Inheritance obj = new Inheritance();
        Inheriter obj1 = obj.new Inheriter();
        obj1.display();
    }
}

