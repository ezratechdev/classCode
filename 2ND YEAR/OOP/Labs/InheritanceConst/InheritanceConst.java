package InheritanceConst;

public class InheritanceConst {
    Integer age;
    public InheritanceConst(Integer a){
        this.age = a;
    }
    public void showAge(){
        System.out.println("Value of age variable is " + this.age);
    }

    public class InheritanceConstSub extends InheritanceConst{
        public InheritanceConstSub(Integer b){
            super(b);
        }
    }
    public static void main(String[] args){
        InheritanceConst obj = new InheritanceConst(19);
        InheritanceConstSub obj1 = obj.new InheritanceConstSub(20);
        obj1.showAge();
    }
}
