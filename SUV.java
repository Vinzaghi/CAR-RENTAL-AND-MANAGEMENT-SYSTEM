/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Patrick
 */
public class SUV extends Car {
    
    public SUV(int carCode, String brand, String model, String color, String description, String plateno, float price, boolean availability) {
        super(carCode, brand, model, color, description, plateno, price, availability);
        this.carType = "SUV";
    }
    
}
