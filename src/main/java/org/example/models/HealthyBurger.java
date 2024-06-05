package org.example.models;

import org.example.enums.BreadRollType;

public class HealthyBurger extends Hamburger{
    private Addition healthyAddition1;
    private Addition healthyAddition2;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder healthyBurgerStringBuilder=new StringBuilder();
        if(healthyAddition1!=null){
            healthyBurgerStringBuilder.append("HealthyAddition1: "+getHealthyAddition1().getName()+"\n");
            setPrice((getPrice()+getHealthyAddition1().getPrice()));
        }
        if(healthyAddition2!=null){
            healthyBurgerStringBuilder.append("HealthyAddition1: "+getHealthyAddition2().getName()+"\n");
            setPrice((getPrice()+getHealthyAddition2().getPrice()));
        }
        System.out.println(healthyBurgerStringBuilder);
        super.itemizeHamburger();
    }

    @Override
    public void addAddition(String name, double price) {
        if(healthyAddition1==null){
            healthyAddition1=new Addition(name,price);
            setPrice(getPrice()+getHealthyAddition1().getPrice());
        }else if(healthyAddition2==null){
            healthyAddition2=new Addition(name,price);
            setPrice(getPrice()+getHealthyAddition2().getPrice());
        }else{
            System.out.println("2 adetten fazla malzeme eklenemez.");
        }
    }
}
