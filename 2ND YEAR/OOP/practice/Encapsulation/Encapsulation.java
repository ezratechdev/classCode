package Encapsulation;
class Encapsulation{
    private String BankPin; 
    // private accesss specifier means restricted access
    // create setter
    public void Setter(String NewPin){
        this.BankPin = NewPin;
    }
    public String Getter(){
        return (this.BankPin);
    }
}