package Const;

public class Const {
    public String Name;
    private Integer Id;
    public Const(String N , Integer I){
        this.Name = N;
        this.Id = I;
    }
    public String Getter(){
        return (this.Name + "" + this.Id);
    }
    public static void main(String[] args){
        Const object = new Const("Ezra",739);
        System.out.println(object.Getter());
    }
}
