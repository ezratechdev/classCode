package Pen;
import  java.util.Scanner;
// 
public class Pen {
    private String Color;
    private String type;
    private Boolean AllowPen;
    private void Hello(){
        Color = "red";
        type = "Hero Pen";
        System.out.println("Hello world from pen class \n i am of type" + type + "I am color " + Color);
    }
    private void looper(String[] data){
        for(int i =0; i < data.length ; i++){
            System.out.println(data[i] + " is at index " + i + "\n");
        }
    }
    private void binaryConverter(int[] data){
        int binary = 0;
        for(int i =0; i < data.length; i++){
            System.out.println(data[i] + " " + i);
            if(data[i] == 0) binary += 0;
            else if(data[i] == 1){ 
                int ii = 2 ^ (data.length -1) - i;
                System.out.println( ii + " is the data " + (data.length -1));
                // 1001 (2 ^ (3 - 0) + (2 ^ (3 - 3)))
                binary = binary + (2 ^ ((data.length -1 ) - i));
            }else System.out.println("Invalid bit");
        }
        System.out.println("Converted to " + binary);
    }
    private void alterInput(){
        System.out.println("Enter color of pen \n");
        Scanner mySCan = new Scanner(System.in);
        Color= mySCan.nextLine();
        System.out.println("new color is " + Color);
        mySCan.close();
    }
    public static void main(String[] arguments){
        Pen logger = new Pen();
        logger.Hello(); 
        // 
        if(logger.Color == "red") logger.AllowPen = true;
        else logger.AllowPen = false;
        if(logger.AllowPen) System.out.println("pen is red"); else System.out.println("pen is not red it is color " + logger.Color);
        // 
        String[] fruits = {"Banana" , "mango" , "Apple"};
        logger.looper(fruits);
        System.out.println("Hello world from pen class \n i am of type " + logger.type + " and color " + logger.Color );
        // bin converter
        int[] d1 = {1,0,0};
        logger.binaryConverter(d1);
        logger.alterInput();
    }
}
