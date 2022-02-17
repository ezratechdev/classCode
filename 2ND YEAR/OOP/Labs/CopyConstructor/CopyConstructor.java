package CopyConstructor;
class CopyConstructor{
    public String Name;
    public Integer id;
    CopyConstructor(String N) {
        this.Name = N;
    }
    CopyConstructor(CopyConstructor C){
        Name = C.Name;
    }
    public void Display(){
        System.out.println("\n Student\"s Name " + this.Name + "\n And id is " + this.id);
    }
    public static void main(String[] arguments){
        // implicit calling ->  CopyConstructor obj = new CopyConstructor("Ezra");
        CopyConstructor obj = new CopyConstructor("Ezra");
        obj.id = 393;
        obj.Display();
        //  explicit calling -> obj.Display();
    }
}