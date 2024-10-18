import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Zestaw4 {

        public static int[] generujTablice(int n, int minWartosc, int maxWartosc)
        {
            Random rand = new Random();
            int[] tab = new int[n];
            tab[0] = minWartosc;
            tab[n-1] = maxWartosc;
            for(int i=1; i<n-1; i++)
            {
                tab[i] = rand.nextInt((maxWartosc - minWartosc) + minWartosc);
            }
            return tab;
        }

        public static int[] wypiszTablice(int[] tab, int n, int m)
        {
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++)
                {
                    System.out.print(tab[i] + " ");
                }
            }
            return tab;
        }

    public static int ileNieparzystych(int[] tab)
    {
        int suma = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]%2 == 1)
            {
                suma++;
            }
        }
        return suma;
    }

        public static int ileParzystych(int[] tab)
        {
            int suma = 0;
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i]%2 == 0)
                {
                    suma++;
                }
            }
            return suma;
        }
        public static int ileDodadnich(int[] tab)
        {
            int suma = 0;
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i]> 0)
                {
                    suma++;
                }
            }
            return suma;
        }

        public static int ileUjemnych(int[] tab)
        {
            int suma = 0;
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i]< 0)
                {
                    suma++;
                }
            }
            return suma;
        }
        public static int ileZerowych(int[] tab)
        {
            int suma = 0;
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i]==0)
                {
                    suma++;
                }
            }
            return suma;
        }
        public static int ileUnikalnych(int[] tab)
        {
            int suma = 0;
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i]!=tab[tab.length-i-1])
                {
                    suma++;
                }
            }
            return suma;
        }

        public static int sumaDodatnich(int[] tab)
        {
            int suma = 0;
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i]>0)
                {
                    suma += tab[i];
                }
            }
            return suma;
        }
        public static int sumaUjemnych(int[] tab)
        {
            int suma = 0;
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i]<0)
                {
                    suma += tab[i];
                }
            }
            return suma;
        }

        public static double sumaOdwrotnosci(int[] tab)
        {
            double suma = 0;
            for(int i=0; i<tab.length; i++)
            {
                tab[i] = 1/tab[i];
                suma += tab[i];
            }
            return suma;
        }
        public static double sredniaArytmetyczna(int[] tab)
        {
            double suma = 0;
            for(int i=0; i<tab.length; i++)
            {
                suma += tab[i];
            }
            return suma/tab.length;
        }

        public static double sredniaGeometryczna(int[] tab)
        {
            double suma = 1;
            for(int i=0; i<tab.length; i++)
            {
                System.out.println(tab[i] + " ");
                suma *= tab[i];
            }
            System.out.println(Math.pow(suma, 1/(double)(tab.length-1)));
            return 0;
        }

    public static double sredniaHarmoniczna(int[] tab)
    {
        double suma = 1;
        for(int i=0; i<tab.length; i++)
        {
            tab[i] = 1/tab[i];
            suma += tab[i];
        }
        return (double) tab.length/suma;

    }


        public static int[] generujZakres(int n, int minWartosc, int maxWartosc)
        {
            Random rand = new Random();
            int[] tab = new int[n];
            tab[0] = minWartosc;
            tab[n-1] = maxWartosc;
            for(int i=1; i<n-1; i++)
            {
                tab[i] = rand.nextInt((maxWartosc - minWartosc) + minWartosc);
            }
            return tab;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //System.out.println("Wpisz n macierzy");
            System.out.println("Wpisz wielkosc tablicy");
            int n = scanner.nextInt();
            //System.out.println("Wpisz m macierzy");
            //int m = scanner.nextInt();

            int[] tablice = generujTablice(n,3,10);
            for(int i=0; i<n; i++)
            {
                System.out.print(tablice[i] + "\n ");
            }
            System.out.println(sredniaHarmoniczna(tablice));

            //int[] tablice2 = wypiszTablice(tab, n, m);
            for(int i=0; i<n; i++)
            {
                //System.out.print(tablice2[i] + " ");
            }

            //System.out.println(ileParzystych(tab));
            //System.out.println(ileNieparzystych(tab));
            //System.out.println(ileDodadnich(tab));
            //System.out.println(ileUjemnych(tab));
            //System.out.println(ileZerowych(tab));
            //System.out.println(ileUnikalnych(tab));

            //System.out.println(sumaDodatnich(tab));
            //System.out.println(sumaUjemnych(tab));
            //System.out.println(sumaOdwrotnosci(tab));
            //System.out.println(sredniaArytmetyczna(tab));
            //System.out.println(sredniaGeometryczna(tab));


            //int[] tablice3 = generujZakres(n,9,109);
            for(int i=0; i<n; i++)
            {
                //System.out.print(tablice3[i] + " ");
            }
        }
    }
