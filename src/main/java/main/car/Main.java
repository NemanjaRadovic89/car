
package main.car;


public class Main {
    
    public static void main (String[] args ){
        int a = 5;
        int b = 6;
        Car audi = new Car ();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "black";
        //audi.buildYear = 2005;
        
        System.out.println("Brand:" + audi.brand);
        System.out.println("Model:" + audi.model);
        
        Car bmw = new Car ();
        bmw.brand = "Bwm";
        bmw.model = "X5";
        
        System.out.println("Brand:" + bmw.brand);
        System.out.println("Model:" + bmw.model);
        
        
        Car fiat = new Car("Fiat","Tipo","Green",2005);
            fiat.printAttributes();        
        
    }
}