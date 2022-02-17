package Constructor;
class Constructor{
    String Name;
    Integer id;
    public Constructor(){
        System.out.println("Runninng the default constructor");
    }
    public void display(){
        System.out.println(Name+id);
    }
    public static void main(String[] arguments){
        Constructor obj = new Constructor();
        obj.display();
    }
}