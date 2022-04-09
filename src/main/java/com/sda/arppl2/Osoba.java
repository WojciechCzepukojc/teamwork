package com.sda.arppl2;

///klasa publiczna
public class Osoba {

    //uzupełnianie danych na private, wtedy nie można ich uzupełniać "na pałkę w nawiasie
    //przez main
    private String imie;
    private int wiek;
    private String hobby;

    //normalnie dodawało się alt ins ale nie teraz...
    //public Osoba(String imie, int wiek, String hobby) {
    //this.imie = imie;
    //this.wiek = wiek;
    //Hobby = hobby;

    //dodanie getter'ów
    // sprawdzenie czy działa
    public String podajImie() {
        return imie;
    }

    public String podajHobby() {
        return hobby;
    }

    public int podajWiek() {
        return wiek;
    }

    //Setterki- rzeczy w nawiasie mają nowe nazwy bo kolizja wewnątrz klasy
    public void pobierzDane(String noweimie, int nowywiek, String nowehobby) {
        this.imie = noweimie;
        this.wiek = nowywiek;
        this.hobby = nowehobby;
    }
}




