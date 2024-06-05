package org.example.models;

import org.example.enums.BreadRollType;

import java.util.Arrays;
import java.util.Objects;

public class Hamburger implements Addable{
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;
    private Addition[] additionArr;

    public Hamburger(String name, String meat, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.additionArr=new Addition[4];
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public Addition[] getAdditionArr() {
        return additionArr;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType='" + breadRollType + '\'' +
                ", additionArr=" + Arrays.toString(additionArr) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hamburger hamburger)) return false;
        return Objects.equals(name, hamburger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public void addAddition(String name, double price) {
        for(int i=0;i< additionArr.length;i++){
            if (additionArr[i]==null) {
                additionArr[i]=new Addition(name,price);
                break;
            }
        }
    }

    public void itemizeHamburger(){
        StringBuilder hamburgerStringBuilder=new StringBuilder();
        hamburgerStringBuilder.append("Name: "+name+"\n");
        hamburgerStringBuilder.append("Meat: "+meat+"\n");
        hamburgerStringBuilder.append("Bread Roll Type: "+breadRollType+"\n");
        for(Addition addition:additionArr){
            if(addition!=null){
                hamburgerStringBuilder.append("Addition name: "+addition.getName()+"\n");
                hamburgerStringBuilder.append("Addition price: "+addition.getPrice()+"\n");
                price=price+addition.getPrice();
            }
        }
        System.out.println(hamburgerStringBuilder);
        System.out.println("total price:"+price);
        System.out.println("**********");
    }
}
