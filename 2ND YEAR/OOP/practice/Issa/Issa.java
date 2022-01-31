package Issa;

public class Issa {
    class Issa1 extends Issa{
        // 
    }
    class Issa2 extends Issa{
        // 
    }
    class Issa3 extends Issa1{
    }
    public static void main(String[] args){
        Issa obj1 = new Issa();
        Issa1 obj2 = obj1.new Issa1();
        Issa2 obj3 = obj2.new Issa2();
        Issa3 obj4 = obj3.new Issa3();
        System.out.println(obj2 instanceof Issa);
        System.out.println(obj3 instanceof Issa2);
        System.out.println(obj2 instanceof Issa3);
        System.out.println(obj4 instanceof Issa1);
    }
}
