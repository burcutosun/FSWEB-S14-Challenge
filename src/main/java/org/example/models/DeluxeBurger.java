package org.example.models;

import org.example.enums.BreadRollType;

public class DeluxeBurger extends Hamburger{
    private Cips cips;
    private Drink drink;

    public DeluxeBurger(BreadRollType breadRollType, Cips cips, Drink drink) {
        super("DELUXE BURGER","DOUBLE",19.18,breadRollType);
        this.cips = cips;
        this.drink = drink;
    }

    public Cips getCips() {
        return cips;
    }

    public Drink getDrink() {
        return drink;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder deluxeBurgerStringBuilder=new StringBuilder();
        deluxeBurgerStringBuilder.append("DRINK: "+drink.getDrinkType()+"\n");
        deluxeBurgerStringBuilder.append("CIPS: "+cips.getCipsType()+"\n");
        System.out.println(deluxeBurgerStringBuilder);
        super.itemizeHamburger();
    }
}
