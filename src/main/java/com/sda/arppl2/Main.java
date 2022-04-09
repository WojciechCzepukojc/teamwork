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
        //Czas na pieski zadanie 3
        Piesek pies1 = new Piesek();
        Piesek pies2 = new Piesek();
        Piesek pies3 = new Piesek();
        Piesek pies4 = new Piesek();
        Piesek pies5 = new Piesek();
        pies1.podajDane("Azor","Chihuahua");
        pies2.podajDane("Perełka","Labrador");
        pies3.podajDane("Dupa","Poodle");
        pies4.podajDane("Kajtek","Labradoodle");
        pies5.podajDane("Viola","Mastiff");
        //sprawdzenie i działa
        System.out.println("Pies Wabi się " + pies1.podajImie()+" jego rasa to " + pies1.jakaRasa()+ " i ma aż " + pies1.ileLap() + " łapy!");
        System.out.println("Pies Wabi się " + pies2.podajImie()+" jego rasa to " + pies2.jakaRasa()+ " i ma aż " + pies2.ileLap() + " łapy!");
        System.out.println("Pies Wabi się " + pies3.podajImie()+" jego rasa to " + pies3.jakaRasa()+ " i ma aż " + pies3.ileLap() + " łapy!");
        System.out.println("Pies Wabi się " + pies4.podajImie()+" jego rasa to " + pies4.jakaRasa()+ " i ma aż " + pies4.ileLap() + " łapy!");
        System.out.println("Pies Wabi się " + pies5.podajImie()+" jego rasa to " + pies5.jakaRasa()+ " i ma aż " + pies5.ileLap() + " łapy!");



    }
}
