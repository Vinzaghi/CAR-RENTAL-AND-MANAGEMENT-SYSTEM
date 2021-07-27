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
public class Car {

    protected String carType;
    private int carCode;
    private String brand;
    private String model;
    private String color;
    private String description;
    private String plateno;
    private float price;
    private boolean availability;
   
    public Car(int carCode, String brand, String model, String color, String description, String plateno, float price, boolean availability) {
        this.carCode = carCode;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.description = description;
        this.plateno = plateno;
        this.price = price;
        this.availability = availability;
    }
    
    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlateno() {
        return plateno;
    }

    public void setPlateno(String plateno) {
        this.plateno = plateno;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
