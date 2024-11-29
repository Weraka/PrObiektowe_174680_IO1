import java.util.HashMap;
import java.util.Map;
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

        public String getNazwa()
        {
            return nazwa;
        }

        public void setNazwa(String nazwa)
        {
            this.nazwa = nazwa;
            if(nazwa == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }
        public int getCena()
        {
            return cena;
        }

        public void setCena(int cena)
        {
            this.cena = cena;
            if(cena <= 0 )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }
        public int getIlosc()
        {
            return iloscNaMagazynie;
        }

        public void setIlosc(int iloscNaMagazynie)
        {
            this.iloscNaMagazynie = iloscNaMagazynie;
            if(iloscNaMagazynie < 0 )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        @Override
        public String toString()
        {
            return "Produkt nazwa " + nazwa + "Cena " + cena + " iloscNaMagazynie " + iloscNaMagazynie;

        }

        public void DodajDoMagazynu(int ilosc)
        {
            this.iloscNaMagazynie+= ilosc;
        }

        public void UsunZMagazynu(int ilosc)
        {
            int temp = this.iloscNaMagazynie - ilosc;
            if(temp > 0)
                this.iloscNaMagazynie-=ilosc;
        }
    }

    public static class KoszykZakupowy
    {
        private ArrayList<Produkt> listaProdukt = new ArrayList<Produkt>();

        public KoszykZakupowy(ArrayList<Produkt> listaProdukt)
        {
            this.listaProdukt = listaProdukt;
        }

        public ArrayList<Produkt> getListaProdukt()
        {
            return listaProdukt;
        }

        public void setListaProdukt(ArrayList<Produkt> listaProdukt)
        {
            this.listaProdukt = listaProdukt;
            if(listaProdukt == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public void dodajProdukt(Produkt produkt)
        {
            if(produkt.iloscNaMagazynie > 0)
                listaProdukt.add(produkt);

            produkt.iloscNaMagazynie--;
        }

        public void wyswietlZawartoscKoszyka()
        {
            for(int i = 0; i < listaProdukt.size(); i++)
            {
                Produkt temp = listaProdukt.get(i);
                System.out.println(String.format("Produkt o nazwie %s cena %d ilosc %d", temp.nazwa, temp.cena, temp.iloscNaMagazynie));
            }
        }

        public void obliczCalkowitaWartosc()
        {
            int sum = 0;
            for(int i = 0; i < listaProdukt.size(); i++)
            {
                Produkt temp = listaProdukt.get(i);
                sum += temp.cena;
            }
            System.out.println(String.format("Calkowita wartosc wszystkich produktow w koszyku wynosi %d", sum));
        }
    }

    public static class Zamowienie
    {
        private KoszykZakupowy koszykZakupowy;
        private String statusZamowienia;
        private Platnosc platnosc;

        public Zamowienie(KoszykZakupowy koszykZakupowy,  String statusZamowienia)
        {
            this.koszykZakupowy = koszykZakupowy;
            this.statusZamowienia = statusZamowienia;
        }

        public Zamowienie(KoszykZakupowy koszykZakupowy,  String statusZamowienia, Platnosc platnosc)
        {
            this.koszykZakupowy = koszykZakupowy;
            this.statusZamowienia = statusZamowienia;
            this.platnosc = platnosc;
        }

        public KoszykZakupowy getKoszykZakupowy()
        {
            return koszykZakupowy;
        }
        public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy)
        {
            this.koszykZakupowy = koszykZakupowy;
            if(koszykZakupowy == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public String getStatusZamowienia()
        {
            return statusZamowienia;
        }
        public void setStatusZamowienia(String statusZamowienia)
        {
            this.statusZamowienia = statusZamowienia;
            if(statusZamowienia == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public Platnosc getPlatnosc()
        {
            return platnosc;
        }
        public void setPlatnosc(Platnosc platnosc)
        {
            this.platnosc = platnosc;
            if(platnosc == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public void ustawStatusZamowienia(String statusZamowienia)
        {
            this.statusZamowienia = statusZamowienia;
        }

        public void wyswietlZamowienie()
        {
            System.out.println("Status zamowienia koszyka to: " + statusZamowienia);
            System.out.println("Koszyk zawiera");
            for(int i = 0; i < koszykZakupowy.listaProdukt.size(); i++)
            {
                Produkt produkt = koszykZakupowy.listaProdukt.get(i);
                System.out.println(String.format("Produkt: (%s) cena(%d) ilosc(%d)", produkt.nazwa, produkt.cena, produkt.iloscNaMagazynie));
            }
        }

        public void finalizujZamowienie()
        {
            if(platnosc.statusPlatnosci == "Oplacone")
            {
                this.statusZamowienia = "Gotowe do wysyłki";
            }
        }

        public void zwrocProdukt(Produkt produkt, int ilosc)
        {
            produkt.UsunZMagazynu(ilosc);
            this.koszykZakupowy.listaProdukt.remove(produkt);
        }
    }

    public static class Klient
    {
        private String imie;
        private String nazwisko;
        private ArrayList<Zamowienie> listaZamowien = new ArrayList<Zamowienie>();
        private Adres adres;

        public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.listaZamowien = listaZamowien;
            this.adres = adres;
        }

        public String getImie()
        {
            return imie;
        }

        public void setImie(String imie)
        {
            this.imie = imie;
            if(imie == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }
        public String getNazwisko()
        {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko)
        {
            this.nazwisko = nazwisko;
            if(nazwisko == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public ArrayList<Zamowienie> getListaZamowien()
        {
            return listaZamowien;
        }
        public void setListaZamowien(ArrayList<Zamowienie> listaZamowien)
        {
            this.listaZamowien = listaZamowien;
            if(listaZamowien == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }
        public Adres getAdres()
        {
            return adres;
        }
        public void setAdres(Adres adres)
        {
            this.adres = adres;
            if(adres == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public void dodajZamowienie(Zamowienie noweZamowienie)
        {
            this.listaZamowien.add(noweZamowienie);
        }

        public void wyswietlHistorieZamowien()
        {
            for(int i = 0; i < listaZamowien.size(); i++)
            {
                System.out.println(String.format("Zamowienie nr %d", i + 1));
                Zamowienie zamowienie = listaZamowien.get(i);
                zamowienie.wyswietlZamowienie();
                System.out.println();
            }
        }

        public void obliczLacznyKosztDostawyZamowien()
        {
            int sum = 0;
            for(int i = 0; i < listaZamowien.size(); i++)
            {
                Zamowienie zamowienie = listaZamowien.get(i);
                for(int j = 0; j < zamowienie.koszykZakupowy.listaProdukt.size(); j++)
                {
                    Produkt produkt = zamowienie.koszykZakupowy.listaProdukt.get(j);
                    sum += produkt.cena;
                }
            }

            System.out.println(String.format("Laczny koszt dostawy zamowien: %d", sum));
        }
    }



    public static class Sklep
    {
        private ArrayList<Produkt> produkty = new ArrayList<Produkt>();
        private String nazwaSklepu;
        private int dataPowstania;
        private String magazynSklepu;

        public Sklep(ArrayList<Produkt> produkty, String nazwaSklepu, int dataPowstania, String magazynSklepu)
        {
            this.produkty = produkty;
            this.nazwaSklepu = nazwaSklepu;
            this.dataPowstania = dataPowstania;
            this.magazynSklepu = magazynSklepu;
        }
        public ArrayList<Produkt> getProdukty()
        {
            return produkty;
        }
        public void setProdukty(ArrayList<Produkt> produkty)
        {
            this.produkty = produkty;
            if(produkty == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public String getNazwaSklepu()
        {
            return nazwaSklepu;
        }
        public void setNazwaSklepu(String nazwaSklepu)
        {
            this.nazwaSklepu = nazwaSklepu;
            if(nazwaSklepu == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }
        public int getDataPowstania()
        {
            return dataPowstania;
        }
        public void setDataPowstania(int dataPowstania)
        {
            this.dataPowstania = dataPowstania;
            if(dataPowstania == 0 )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }
        public String getMagazynSklepu()
        {
            return magazynSklepu;
        }
        public void setMagazynSklepu(String magazynSklepu)
        {
            this.magazynSklepu = magazynSklepu;
            if(magazynSklepu == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public void dodajProdukt(Produkt produktDoDodania)
        {
            this.produkty.add(produktDoDodania);
        }

        public void wyswietlOferty()
        {
            System.out.println("Skelp zawiera nastepujace produkty");

            for(int i = 0; i < produkty.size(); i++)
            {
                Produkt produkt = produkty.get(i);

            }
        }

        public Produkt wyszukajProdukt(String nazwaProduktu)
        {
            for (int i = 0; i < produkty.size(); i++)
            {
                Produkt produkt = produkty.get(i);

                if(produkt.nazwa == nazwaProduktu)
                {
                    System.out.println(String.format("Znaleziono produkt %s!", produkt.nazwa));
                    return produkt;
                }
            }


            System.out.println(String.format("Nie znaleziono produktu :("));
            return null;
        }

        public void zakupy(Produkt produktDoDodania, int ilosc)
        {
            produktDoDodania.iloscNaMagazynie -= ilosc;
            this.produkty.add(produktDoDodania);
        }

    }

    public static class Platnosc
    {
        private int kwota;
        private String statusPlatnosci;

        public Platnosc(int kwota, String statusPlatnosci)
        {
            this.kwota = kwota;
            this.statusPlatnosci = statusPlatnosci;
        }
        public int getKwota()
        {
            return kwota;
        }
        public void setKwota(int kwota)
        {
            this.kwota = kwota;
        }
        public String getStatusPlatnosci()
        {
            return statusPlatnosci;
        }
        public void setStatusPlatnosci(String statusPlatnosci)
        {
            this.statusPlatnosci = statusPlatnosci;
        }
        public void zaplac()
        {
            this.statusPlatnosci = "Oplacone";
            this.kwota = 0;
        }
    }

    public static class Magazyn
    {
        private Map<Produkt, Integer> magazyn;


        public Magazyn(Map<Produkt, Integer> magazyn)
        {
            magazyn = new HashMap<>();

        }
        public Map<Produkt,Integer> getProdukty()
        {
            return magazyn;
        }




    }

    public static class Adres
    {
        private String ulica;
        private int numerDomu;
        private int numerMieszkania;
        private String miasto;
        private String kodPocztowy;

        public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy)
        {
            this.ulica = ulica;
            this.numerDomu = numerDomu;
            this.numerMieszkania = numerMieszkania;
            this.miasto = miasto;
            this.kodPocztowy = kodPocztowy;

        }

        public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy)
        {
            this(ulica, numerDomu, 0, miasto, kodPocztowy);
        }

        public String getUlica()
        {
            return ulica;
        }
        public void setUlica(String ulica)
        {
            this.ulica = ulica;
            if(ulica == null )
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public int getNumerDomu() {
            return numerDomu;
        }
        public void setNumerDomu(int numerDomu) {
            this.numerDomu = numerDomu;
            if(numerDomu <= 0)
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }
        public int getNumerMieszkania() {
            return numerMieszkania;
        }
        public void setNumerMieszkania(int numerMieszkania) {
            this.numerMieszkania = numerMieszkania;
            if(numerMieszkania <= 0)
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }
        public String getMiasto() {
            return miasto;

        }
        public void setMiasto(String miasto) {
            this.miasto = miasto;
            if(miasto == null)
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }
        public String getKodPocztowy() {
            return kodPocztowy;
        }
        public void setKodPocztowy(String kodPocztowy) {
            this.kodPocztowy = kodPocztowy;
            if(kodPocztowy == null)
            {
                System.out.println("Niepoprawna wartosc ");
            }
        }

        public void pokaz()
        {
            System.out.println("Kod pocztowy: " + kodPocztowy + " Miasto: " + miasto);
            if(this.numerMieszkania == 0)
            {
                System.out.println(" Ulica: " + ulica + " Numer domu: " + numerDomu);
            }
            else
            {
                System.out.println(" Ulica: " + ulica + " Numer domu: " + numerDomu + " Numer mieszkania: " + numerMieszkania);
            }

        }

        public void przed()
        {

        }

    }
    public static class getClassInaczej {

        public String getMyClassName() {
            return "Czesc jestem klasa" + this.getClass().getName();
        }
    }
    public static void main(String[] args)
    {
        //Zad1
        Produkt produkt = new Produkt("Masne Maslo", 10, 5);
        //produkt.WyswietlInformacje();
        produkt.DodajDoMagazynu(10);
        //produkt.WyswietlInformacje();
        produkt.UsunZMagazynu(3);
        //produkt.WyswietlInformacje();


        /*Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);

        KoszykZakupowy koszyk = new KoszykZakupowy(produkty);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println();
        koszyk.dodajProdukt(produkt3);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println();
        koszyk.obliczCalkowitaWartosc();*/


        //Zad3
        /*Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);
        produkty.add(produkt3);

        KoszykZakupowy koszyk = new KoszykZakupowy(produkty);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println();

        Zamowienie zamowienie = new Zamowienie(koszyk, "Wyslane");
        zamowienie.wyswietlZamowienie();
        System.out.println();
        zamowienie.ustawStatusZamowienia("Dostarczone");
        zamowienie.wyswietlZamowienie();*/


        //Zad4
        /*Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);
        produkty.add(produkt3);

        KoszykZakupowy koszyk = new KoszykZakupowy(produkty);
        Zamowienie zamowienie = new Zamowienie(koszyk, "Dostarczone");
        zamowienie.wyswietlZamowienie();
        System.out.println();

        ArrayList<Zamowienie> listaZamowien = new ArrayList<>();
        listaZamowien.add(zamowienie);
        listaZamowien.add(zamowienie);
        Klient klient = new Klient("Tomek", "Dzialowy", listaZamowien);

        klient.wyswietlHistorieZamowien();
        klient.obliczLacznyKosztDostawyZamowien();*/


        //Zad5
        /*Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);
        produkty.add(produkt3);

        Sklep sklep = new Sklep(produkty);
        sklep.wyswietlOferty();
        System.out.println();

        sklep.dodajProdukt(produkt1);
        sklep.wyswietlOferty();
        Produkt produktDoWyszukania = sklep.wyszukajProdukt("Chaderskie Chipsy");
        System.out.println();

        sklep.zakupy(produktDoWyszukania, 10);
        sklep.wyswietlOferty();*/


        //Zad6
        /*Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);
        produkty.add(produkt3);

        KoszykZakupowy koszyk = new KoszykZakupowy(produkty);

        Platnosc platnosc = new Platnosc(10, "Nie zaplacone");
        platnosc.zaplac();

        Zamowienie zamowienie = new Zamowienie(koszyk, "Dostarczone", platnosc);
        zamowienie.wyswietlZamowienie();
        System.out.println();
        zamowienie.finalizujZamowienie();
        zamowienie.zwrocProdukt(produkt3, 10);
        zamowienie.wyswietlZamowienie();*/

        Adres adres1 = new Adres("Iwaszkiewicza",24,2,"Olsztyn", "10-233");
        Adres adres2 = new Adres("Wrzosowa",8,"Olsztyn", "10-121");
        adres1.pokaz();
        adres2.pokaz();

        getClassInaczej obj = new getClassInaczej();
        System.out.println(obj.getMyClassName());

    }
}
