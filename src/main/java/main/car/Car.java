
package main.car;

//Clasa
public class Car {
    public String brand;
    public String model;
    public String color;
    private int buildYear;
    
    //Constructor
    public Car (){
    
    }
    //Constructor
    public Car(int year){
        this.buildYear = year;
    }
    
    //Constructor
    public Car (String brand,String model,String color, int buildYear ){
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.buildYear = buildYear;
    }

    
    //get Metoda
    public int getBuildYear () {
        return this.buildYear;
    }
    //void Metoda
    public void printAttributes (){
        System.out.println("Brand:" + this.brand);
        System.out.println("Model:" + this.model);
        System.out.println("Boja:" + this.color);
        System.out.println("Godina:" + this.getBuildYear());
    }

}


