package ParametizedConst;

class ParametizedConst {
    private String Name;
    private Integer Id;
    private boolean IsLegal;

    public ParametizedConst(String N, Integer i, boolean legalAge) {
        this.Name = N;
        this.Id = i;
        this.IsLegal = legalAge;
    }

    public void display() {
        System.out.println("\n Name :" + this.Name + "\n Id :" + this.Id);
    }

    private boolean authenicator(Integer password) {
        if (password == 12345678)
            return true;
        else
            return false;
    }

    public void caller(Integer token) {
        // if(token)
        if (this.authenicator(token) && this.IsLegal)
            System.out.println("\n Token is valid");
        else
            System.out.println("\n Token is invalid");
    }

    public static void main(String[] arguments) {
        // first set
        ParametizedConst obj1 = new ParametizedConst("Ezra", 19, true);
        obj1.display();
        obj1.caller(12345678);
        // second set
        ParametizedConst obj2 = new ParametizedConst("Eda", 14, false);
        obj2.display();
        obj2.caller(12345678);
        //
    }
}