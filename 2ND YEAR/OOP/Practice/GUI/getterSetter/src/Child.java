public class Child extends GetterSetter{

    @Override
    public Integer Add(Integer x , Integer y){
        return x + y;
    }
    public float division(){
        return (50 / 4);
    }
    public  float division(float x , float y){
        return (x/y);
    }
    public static  void main(String[] args){
        Child obj = new Child();
        System.out.println("Override occurs here");
        System.out.println(obj.Add(34,5));
        System.out.println("Division occurs here");
        System.out.println(obj.division());
        System.out.println(obj.division(10,2));
        System.out.println("Getter setter occurs here");
        System.out.print(obj.Setter("ezrakeeps").Getter());
    }
}
