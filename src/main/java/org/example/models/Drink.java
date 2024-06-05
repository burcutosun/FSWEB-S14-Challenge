package org.example.models;

import org.example.enums.DrinkType;

public class Drink {
    private DrinkType drinkType;

    public Drink(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }
}
