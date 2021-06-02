
package main.car;

//Clasa
public class Car {
    public String brand;
    public String model;
    public String color;
    private int buildYear;
    private int mileage = 0;
    private int fuel; 
    private int consuption;
    
    //Constructor
    public Car (){
    this.brand = "";
    this.model = "";
    this.color = "";
    this.buildYear = 0;
    }
    //Constructor
    public Car(int year){
        this.buildYear = year;
    }
    
    //Constructor
    public Car (String brand,String model,String color, int buildYear, int mileage, int fuel, int consuption ){
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.buildYear = buildYear;
    this.mileage = mileage;
    this.fuel = fuel;
    this.consuption = consuption;
    }

    
    //get Metoda
    public int getBuildYear () {
        return this.buildYear;
    }
    
    public int getMileage (){
        return this.mileage;
    }
    public void setMileage(int newMileage){
        this.mileage = newMileage;
    }
    
    private int getConsuption (){
        return this.consuption;
    }
    private int getFuel(){
        return this.fuel;
    }
    
    private void setFuel(int fuel){
        this.fuel = fuel;
    }
    
    //void Metoda
    public void printAttributes (){
        System.out.println("Brand:" + this.brand);
        System.out.println("Model:" + this.model);
        System.out.println("Boja:" + this.color); 
        System.out.println("Godina:" + this.getBuildYear());
        System.out.println("Mileage:" + this.getMileage());
        System.out.println("Curent fuel:" + this.getFuel());
    }
    
    public void travel(int distance){
     //int newMileage = this.getMileage() + distance;
     //this.setMileage(newMileage);
       
       this.setMileage(this.getMileage() + distance);
       int spentFuel = this.consuption * distance;  
       int newFuel = this.getFuel() - spentFuel;
       this.setFuel(newFuel);
       
       
       
       //prosecna potrosnja
       //potroseno gorivo = p.potrosnja x distanca
       //novo stanje goriva = trenutno gorivo - potroseno gorivo
       
       
       
       
       
    }
    
}


