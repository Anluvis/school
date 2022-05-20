package me.lugldugl;

public class Flugzeug {

    private String airline;
    private float spannweite;
    private String modell;
    private String farbe;
    private int height;

    public Flugzeug(String airline, float spannweite, String modell, String farbe) {
        this.airline = airline;
        this.spannweite = spannweite;
        this.modell = modell;
        this.farbe = farbe;
        this.height = 0;
    }

    public void starten() {
        if(height == 0) {
            height = 3000;
            System.out.println("Das Flugzeug ist gestartet");
        } else {
            System.out.println("Flugzeug ist bereits in der Luft");
        }
    }

    public void steigen() {
        switch (height) {
            case 0 -> System.out.println("Das Flugzeug ist noch nicht gestartet.");
            case 3000 -> {
                height = 30000;
                System.out.println("Das Flugzeug ist auf seine maximale Höhe (30.000m) gestiegen.");
            }
            case 30000 -> System.out.println("Das Flugzeug ist bereits auf seiner maximalen Höhe (30.000m).");
            default -> System.out.println("Es ist ein Fehler aufgetreten.");
        }
    }

    public void sinken() {
        switch (height) {
            case 0 -> System.out.println("Das Flugzeug ist noch nicht gestartet");
            case 3000 -> System.out.println("Das Flugzeug muss landen oder steigen");
            case 30000 -> {
                height = 3000;
                System.out.println("Das Flugzeug ist gesunken");
            }
            default -> System.out.println("Ein Fehler ist aufgetreten");
        }
    }

    public void landen() {
        switch (height) {
            case 0 -> System.out.println("Das Flugzeug ist bereits auf dem Boden");
            case 3000 -> {
                height = 0;
                System.out.println("Das Flugzeug ist im Landeanflug");
                System.out.println("Das Flugzeug ist gelandet und zum Gate gefahren");
            }
            case 30000 -> System.out.println("Das Flugzeug ist zu hoch um zu sinken");
            default -> System.out.println("Es ist ein Fehler aufgetreten");
        }
    }

    public void info() {
        System.out.println("");
        System.out.println("****************************************");
        System.out.println("Airline: " + airline);
        System.out.println("Modell: " + modell);
        System.out.println("Spannweite: " + spannweite);
        System.out.println("Farbe: " + farbe);
        System.out.println("Aktuelle Höhe: " + height);
        System.out.println("****************************************");
        System.out.println("");
    }
}