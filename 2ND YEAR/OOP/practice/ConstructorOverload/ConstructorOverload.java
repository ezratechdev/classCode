package ConstructorOverload;
class ConstructorOverload{
    public String Name;
    public Integer RegNo;
    public Integer Age;
    public ConstructorOverload(String N , Integer Reg){
        this.Name = N;
        this.RegNo = Reg;
    }
    public ConstructorOverload(String N , Integer Reg ,Integer ager){
        this.Name = N;
        this.RegNo = Reg;
        this.Age = ager;
    }
    public void display(){
        System.out.println("\n Student's name is " + this.Name + "\n Registration Number is " + this.RegNo + "\n Age is " + this.Age);
    }
    public static void main(String[] arguments){
        ConstructorOverload obj = new ConstructorOverload("Ezra",739);
        obj.display();
    }
}