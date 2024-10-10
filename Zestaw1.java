import java.time.LocalDate;
import java.time.LocalTime;
public class Zestaw1 {

    private static void zad1(){
        System.out.println("Weronika Kaznowska");
    }
    private static void zad2(){
        String imie = "Weronika Kaznowska";
        System.out.println(imie.length()-1);
    }
    private static void zad3(){
        String napis1 = "Ala";
        String napis2 = "ma";
        String napis3 = "kota";
        String alamakota = napis1 + " " + napis2 + " " + napis3;
        System.out.println(alamakota);
    }
    private static void zad4a(){
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* *\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* * *\n");
        for(int i = 0; i < 14; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i = 0; i < 15; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i = 0; i < 14; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* * *\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* *\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
    }
    private static void zad4b(){
        int a = 5;
        int b = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }
            a--;
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            b++;
            System.out.print("\n");
        }
        a = 1;
        b = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }
            a++;
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            b--;
            System.out.print("\n");
        }
    }
    private static void zad5(){
        String napis = "Ala ma kota";
        System.out.println(napis.replace("a", "e"));
    }
    private static void zad6(){
        String ala = "Ala ma kota";
        System.out.println(ala.toUpperCase());
        System.out.println(ala.toLowerCase());
    }
    private static void zad7(){
        System.out.println((int) 'A');
        System.out.println((int) '!');
        System.out.println((int) '@');
        System.out.println((int) '>');
        System.out.println((int) '~');
        System.out.println((int) '\n');
        System.out.println((int) '\b');

    }
    private static void zad8(){
        System.out.println("Duże litery w tablicy ascii: " + (int) 'A' + " - " + (int) 'Z');
        System.out.println("Małe litery w tablicy ascii: " + (int) 'a' + " - " + (int) 'z');
        System.out.println("Liczby w tablicy ascii: " + (int) '0' + " - " + (int) '9');
    }
    private static void zad9(){
        String napis = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mino, że jego ... na to nie wskazuje.";
        napis = napis.substring(0, napis.indexOf(".")) + "wiewior" + napis.substring(napis.indexOf(".") + 3);
        napis = napis.substring(0, napis.indexOf(".")) + "gryzoniem" + napis.substring(napis.indexOf(".") + 3);
        napis = napis.substring(0, napis.indexOf(".")) + "pyszczek" + napis.substring(napis.indexOf(".") + 3);
        System.out.println(napis);
    }
    private static void zad10(){
        String napis = "...to najlepsza książka napisana przez ...";
        napis = napis.substring(0, napis.indexOf(".")) + "Kamienie na szaniec " + napis.substring(napis.indexOf(".") + 3);
        napis = napis.substring(0, napis.indexOf(".")) + "A. Kaminskiego.";
        System.out.println(napis);
    }
    private static void zad11(){
        for(int i = 0; i < 5; i++){
            System.out.print("wodrze");
        }
        System.out.print("\n");
    }
    private static void zad12(){
        System.out.println("Dzisiaj jest " + LocalDate.now() + " godzina " + LocalTime.now());
    }
    private static void zad13(){
        System.out.println(Character.toString((char) 54));
        System.out.println(Character.toString((char) 103));
        System.out.println(Character.toString((char) 241));
        System.out.println(Character.toString((char) 67));
        System.out.println(Character.toString((char) 9999));
        String imie = "Weronika Kaznowska";
        System.out.println(Character.toString((char) imie.length()-1));
        System.out.println(Character.toString((char) 174680));
    }
    public static void main(String[] args) {
        System.out.println("\nZad1");
        zad1();
        System.out.println("\nZad2");
        zad2();
        System.out.println("\nZad3");
        zad3();
        System.out.println("\nZad4a");
        zad4a();
        System.out.println("\nZad4b");
        zad4b();
        System.out.println("\nZad5");
        zad5();
        System.out.println("\nZad6");
        zad6();
        System.out.println("\nZad7");
        zad7();
        System.out.println("\nZad8");
        zad8();
        System.out.println("\nZad9");
        zad9();
        System.out.println("\nZad10");
        zad10();
        System.out.println("\nZad11");
        zad11();
        System.out.println("\nZad12");
        zad12();
        System.out.println("\nZad13");
        zad13();
    }
}