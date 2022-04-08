package com.sda.arppl2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 wykonane");
        //stworzenie obiektu
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba();
        Osoba osoba3 = new Osoba();
        osoba1.pobierzDane("Michał",78,"Wędkownanie");
        osoba2.pobierzDane("Andrzej",44, "Alkohol -spożywanie i produkcja");
        osoba3.pobierzDane("Mateusz",39, "Polityka, Banki i kłamstwa");
        //Tylko sprawdzenie poniżej, nie było w zadaniu 2 :)
        System.out.println("Uczestnik nazywa się "+ osoba1.podajImie() + " ma " +osoba1.podajWiek() + " lat, a jego hobby to  " + osoba1.podajHobby());
        System.out.println("Uczestnik nazywa się "+ osoba2.podajImie() + " ma " +osoba2.podajWiek() + " lat, a jego hobby to  " + osoba2.podajHobby());
        System.out.println("Uczestnik nazywa się "+ osoba3.podajImie() + " ma " +osoba3.podajWiek() + " lat, a jego hobby to  " + osoba3.podajHobby());
    }
}
