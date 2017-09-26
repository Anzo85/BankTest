package anzo.org;

import java.util.ArrayList;


public class Card {

    int pin;
    String name;
    int account;

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public Card(int pin, String name, int account) {
        this.pin = pin;
        this.name = name;
        this.account = account;
    }



    @Override
    public String toString() {
        return "Card{" +
                "pin=" + pin +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
