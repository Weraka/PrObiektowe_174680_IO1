import java.util.ArrayList;

public class Main {

    public static class Produkt
    {
        private String nazwa;
        private int cena;
        private int iloscNaMagazynie;

        public Produkt(String nazwa, int cena, int iloscNaMagazynie)
        {
            this.nazwa = nazwa;
            this.cena = cena;
            this.iloscNaMagazynie = iloscNaMagazynie;
        }

        public void wyswietlInformacje()
        {
            System.out.println(nazwa + " " + cena + " " + iloscNaMagazynie);
        }

        public void dodajDoMagazynu(int n)
        {

            iloscNaMagazynie = iloscNaMagazynie+n;

        }

        public void usunZMagazynu(int n)
        {

            if(iloscNaMagazynie >= n)
            {
                iloscNaMagazynie -= n;
            }
        }



    }

    class KoszykZakupowy extends Produkt
    {

        private ArrayList<String> produkt = new ArrayList<>();

        public KoszykZakupowy(String nazwa, int cena, int iloscNaMagazynie, String produkt)
        {
            super(nazwa, cena, iloscNaMagazynie);
            this.produkt = produkt;
        }

        public void dodajProdukt(Produkt produkt)
        {

        }

        public void wyswietlZawartoscKoszyka()
        {

        }

        public void obliczCalkowitaWartosc()
        {

        }



    }
    class Zamowienie extends KoszykZakupowy
    {
        private ArrayList<String> koszykZakupowy = new ArrayList<>();
        private String statusZamowienia;

        public Zamowienie(String nazwa, int cena, int iloscNaMagazynie, String produkt ,String koszykZakupowy, String statusZamowienia)
        {
            super(nazwa, cena, iloscNaMagazynie, produkt);
            this.koszykZakupowy = koszykZakupowy;
            this.statusZamowienia = statusZamowienia;
        }

        public void ustawStatusZamowienia()
        {

        }

        public void wyswietlZamowienie()
        {

        }

    }

    class Klient extends Zamowienie
    {
        private String imie;
        private String nazwisko;
        private ArrayList<String> listaZamowien = new ArrayList<>();

        public Klient(String nazwa, int cena, int iloscNaMagazynie, String statusZamowienia, String imie, String nazwisko)

    }

    public static void main(String[] args)
    {
        Produkt produkt1 = new Produkt("Mleko", 3, 72);

        produkt1.wyswietlInformacje();
        produkt1.dodajDoMagazynu(3);
        produkt1.wyswietlInformacje();
        produkt1.usunZMagazynu(7);
        produkt1.wyswietlInformacje();
    }
}