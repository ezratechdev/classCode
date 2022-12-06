public class GetterSetter {
    private String Name;
    public GetterSetter(){
        System.out.println("Hi i am a constructor");
    }
    public GetterSetter Setter(String newName){
        this.Name = newName;
        return this;
    }
    public Integer Add(Integer x , Integer y){
        return 5;
    }
    public String Getter(){
        return Name;
    }
}
