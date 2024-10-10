import java.lang.Math;
import java.util.Scanner;

public class Zestaw2 {

    private static void zad1(){
        System.out.println("23.0+76: " + (23.0 + 76));
        System.out.println("41*2.0+3: " + (41*2.0+3));
        System.out.println("5-33: " + (5-33));
        System.out.println("109%3: " + (109%3));
        System.out.println("50/2: " + (50/2));
        System.out.println("4|2: " + (4|2));
        System.out.println("3^5: " + (3^5));
        System.out.println("7&9: " + (7&9));
    }

    private static void zad2(){
        double wynik1 = ((Math.sqrt(7)-1)/2)+(Math.pow(3,3)%2);
        System.out.println((int)wynik1);
        double wynik2 = 2004/(29*1);
        System.out.println((int)wynik2);
        int a = 162;
        double b = 3.8;
        int c = 8;
        double wynik3 = a%b%c;
        System.out.println((int)wynik3);
        String imie = "Weronika";
        String nazwisko = "Kaznowska";
        double wynik4 = (nazwisko.length() % imie.length()+1)/Math.pow(2, 1/4);
        System.out.println((int)wynik4);

    }

    private static void zad3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwsze slowo");
        String a = scanner.nextLine();
        System.out.println("Wpisz drugie slowo");
        String b = scanner.nextLine();
        System.out.println(a + " " + b);
    }

    private static void zad4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwsza liczbe");
        int a = scanner.nextInt();
        System.out.println("Wpisz druga liczbe");
        int b = scanner.nextInt();
        System.out.println("Dodawanie: " + (a + b));
        System.out.println("Odejmowanie: " + (a - b));
        System.out.println("Mnozenie: " + (a * b));
        if(b!=0) {
            System.out.println("Dzielenie: " + (a / b));
        } else {
            System.out.println("Nie mozna dzielic przez 0");
        }
    }

    private static void zad5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwsza liczbe");
        int a = scanner.nextInt();
        System.out.println("+140: " + (a+140));
        System.out.println("-31: " + (a-31));
        System.out.println("*7: " + (a*7));
        System.out.println("/13: " + (a/13));
        System.out.println("%7: " + (a%7));
        System.out.println("Cz. calkowita z /4: " + ((int)(a/4)));
        System.out.println("**45: " + (Math.pow(a, 45)));
        System.out.println("AND 67: " + (a&67));
        System.out.println("OR 59: " + (a|59));
        System.out.println("XOR 23: " + (a^23));
        System.out.println("5 bitow w lewo: " + (a<<5));
        System.out.println("6 bitow w prawo: " + (a>>6));
    }
    public static void main(String[] args) {

            System.out.println("\nZad1");
            zad1();
            System.out.println("\nZad2");
            zad2();
            System.out.println("\nZad3");
            zad3();
            System.out.println("\nZad4");
            zad4();
            System.out.println("\nZad5");
            zad5();

    }
}
