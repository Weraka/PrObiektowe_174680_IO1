import java.util.Scanner;

public class Zestaw3 {
    public static void trojkipitagorejskie(int n) {
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                int c = (int) Math.sqrt(a * b + b * b);
                if (c * c == a * a + b * b && c <= n) {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }

    public static void funKwaRozwiazania(int n)
    {
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for(int c = 1; c <= n; c++) {
                    {
                        if( (b*b-4*a*c)>=0)
                        {
                            System.out.println(a + ", " + b + ", " + c);
                        }
                    }
                }
            }
        }
    }

    public static void funKwaDelta(int n)
    {
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for(int c = 1; c <= n; c++) {
                    {
                        if( (b*b-4*a*c)>=0 && Math.sqrt(b*b-4*a*c)==(int)Math.sqrt(b*b-4*a*c) )
                        {
                            System.out.println(a + ", " + b + ", " + c);
                        }
                    }
                }
            }
        }
    }

    public static void liczbyPierwsze(int n)
    {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                suma++;
            }
            if(suma==2)
            {
                System.out.println(i);
            }
        }

    }

    public static void liczbyPodzielne(int m,int n)
    {
        for(double i = Math.pow(10,m); i<9.9*Math.pow(10,m); i++)
        {
            if(i%n==0)
            {
                System.out.println(i);
            }
        }
    }

    public static void silnia(int n)
    {
        int suma = 1;
        for(int i=n;i>0;i--)
        {
            suma = suma*i;
        }
        System.out.println(suma);
    }

    private static void piramida()
    {
        int wariant = 2;
        int n = 5;
        char znak = '*';
        if(wariant == 1)
        {
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(znak);
                }
                System.out.println("\n");
            }
        }
        else
        {
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= n-i; j++)
                {
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(znak+" ");
                }
                System.out.println("\n");
            }
        }
    }

    public static void silniapodwojna(int n)
    {
        int suma = 1;
        for(int i=n;i>0;i=i-2)
        {
            suma = suma*i;
        }
        System.out.println(suma);
    }

    public static void silnia(int m,int n)
    {
        int suma = 1;
        for(int i=n;i>0;i-=m)
        {
            suma = suma*i;
        }
        System.out.println(suma);
    }

    public static void dwumianNewtona(int n, int k)
    {
        float wynik = 0;
        int suman = 1;
        int sumak = 1;
        int sumank = 1;
        int diff = n-k;
        for(int i=n;i>0;i--)
        {
            suman = suman*i;
        }

        for(int i=k;i>0;i--)
        {
            sumak = sumak*i;
        }

        for(int i=diff;i>0;i--)
        {
            sumank = sumank*i;
        }

        wynik = suman/(sumak*sumank);
        System.out.println(wynik);
    }

    public static int ciagFibonacciego(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return ciagFibonacciego(n-1)+ciagFibonacciego(n-2);
        }
    }

    public static int sumaNaturalnych(int n)
    {
        int suma = 0;
        for(int i=1;i<=n;i++)
        {
            suma=suma+i;
        }
        return suma;
    }
    public static int sumaParzystych(int n)
    {
        int suma = 0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                suma=suma+i;
            }

        }
        return suma;
    }
    public static int sumaNieparzystych(int n)
    {
        int suma = 0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                suma=suma+i;
            }

        }
        return suma;
    }

    public static int sumaKwadratow(int n)
    {
        int suma = 0;
        for(int i=1;i*i<=n;i++)
        {
                suma=suma+i;

        }
        return suma;
    }

    public static int sumaSzescianow(int n)
    {
        int suma = 0;
        for(int i=1;i*i*i<=n;i++)
        {
            suma=suma+i;

        }
        return suma;
    }

    public static double sumaOdwNaturalnych(int n)
    {
        float suma = 0;

        for(float i=1;i<=n;i++)
        {
            suma = suma + 1/i;
        }
        return suma;
    }

    public static int czyPalindrome(String wyraz)
    {
        int czypr = 0;
        int dl = wyraz.length();
        for(int i=0;i<dl;i++)
        {
            if(wyraz.charAt(i) == wyraz.charAt(dl-i-1))
            {
               czypr=1;
            }

        }
        return czypr;
    }

    public static boolean czyLiczbaPalindrom(int n)
    {
        boolean wynik = true;
        int dl = 0;
        int []tab = new int[dl];
        while(n<1)
        {
            n = n/10;
            dl++;
        }
        System.out.println(dl);
        System.out.println(tab);
        return wynik;
    }

    public static boolean czyDoskonala(int n)
    {
        int suma = 0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                suma = suma+i;
            }

        }

        if(suma==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean czyPierwsza(int n)
    {
        int suma = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                suma=suma+1;
            }

        }
        if(suma==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int NWD(int x, int y)
    {
        int wynik = 0;
        for(int i=1; i<=x;i++)
        {
            if(x%i==0&&y%i==0)
            {
                wynik = i;
            }
        }
        return wynik;
    }

    public static int[] wczytajTablice(int n)
    {
        Scanner scanner = new Scanner(System.in);
        int []tab=new int[n];
        for(int i = 1; i <= n; i++)
        {
            System.out.print("Podaj liczbę \n");
            tab[i-1]=scanner.nextInt();
        }

        return tab;
    }

    public static int podzbiory(int[] tab)
    {
        return 1;
    }

    public static void main(String[] args) {

        System.out.println("\nZad1");
        //trojkipitagorejskie(100);

        System.out.println("\nZad2");
        //funKwaRozwiazania(3);

        System.out.println("\nZad3");
        //funKwaDelta(3);

        System.out.println("\nZad4");
        //liczbyPierwsze(10);

        System.out.println("\nZad5");
        //liczbyPodzielne(2, 11);

        System.out.println("\nZad6");
        //piramida();

        System.out.println("\nZad7");
        //silnia(4);

        System.out.println("\nZad8");
        //silniapodwojna(6);

        System.out.println("\nZad9");
        //silnia(3,6);

        System.out.println("\nZad10");
        dwumianNewtona(5,2);

        System.out.println("\nZad11");
        int n = 7;
        for(int i=0;i<=n;i++)
        {
            System.out.println(ciagFibonacciego(i));
        }


        System.out.println("\nZad12a");
        System.out.println(sumaNaturalnych(10));

        System.out.println("\nZad12b");
        System.out.println(sumaParzystych(10));

        System.out.println("\nZad12c");
        System.out.println(sumaNieparzystych(10));

        System.out.println("\nZad12d");
        System.out.println(sumaKwadratow(20));

        System.out.println("\nZad12e");
        System.out.println(sumaSzescianow(62));

        System.out.println("\nZad12f");
        System.out.println(sumaOdwNaturalnych(2));

        System.out.println("\nZad13");
        System.out.println(czyPalindrome("kajak"));

        System.out.println("\nZad15");
        System.out.println(czyLiczbaPalindrom(632));

        System.out.println("\nZad16");
        System.out.println(czyDoskonala(6));

        System.out.println("\nZad17");
        System.out.println(czyPierwsza(7));

        System.out.println("\nZad18");
        System.out.println(NWD(8, 18));

        System.out.println("\nZad19");
        //System.out.println(podzbiory(tab));
    }
}
