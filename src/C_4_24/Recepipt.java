package C_4_24;

import java.util.Formatter;

public class Recepipt {
    private double total;
    private Formatter f = new Formatter(System.out);
    public void printTitle(){
        f.format("%-15s %5s %5s\n","Item","Qty","Price");
        f.format("%-15s %5s %5s\n","----","---","-----");
    }
    public void printPro(String name,int qty,double price){
        total +=qty*price;
        f.format("%-15s %5d %5.2f\n",name,qty,price);
    }
    public void printTotal(){
        f.format("%-15s %5s %5s\n","","","-----");
        f.format("%-15s %5s %5.2f\n","Total","",total);
    }

    public static void main(String[] args) {
        Recepipt r = new Recepipt();
        r.printTitle();
        r.printPro("apple",2,5.5);
        r.printPro("oragel",3,7);
        r.printTotal();
    }
}
