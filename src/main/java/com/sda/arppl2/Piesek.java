package com.sda.arppl2;

public class Piesek {
    private String imie;
    //int będzie miał stałą nie zmienną zmienną :P
    private int liczbaLap = 4;
    private String rasa;
    //nie zapomnij o getterach
    public String podajImie(){
        return imie;
    }
    public int ileLap(){
        return liczbaLap;
    }
public String jakaRasa(){
        return rasa;
}
    //public void mega istotne jeżeli mieszasz dane (int z stringiem etc)
    public void podajDane(String noweImie, String nowaRasa) {
        this.imie = noweImie;
        this.rasa = nowaRasa;
        liczbaLap = 4;
    }
}
