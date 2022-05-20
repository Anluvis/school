package me.lugldugl;

public class Main {

    public static void main(String[] args) {
        Flugzeug a380 = new Flugzeug("Emirates", 80, "A380", "weiß");

        a380.info();

        a380.starten();
        a380.steigen();
        a380.sinken();
        a380.landen();
    }
}