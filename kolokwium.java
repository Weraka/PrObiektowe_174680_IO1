public class kolokwium {


    //Zadania - Kolokwium gr1

    public static int[] ciagArytmetycznyRodzajuM(int n, int m, int a1, int[] r)
    {
        int[] wynik = new int[n];
        wynik[0] = a1;
        for(int i = 1; i < n; i++)
        {
            int suma=a1;
            for(int j = 0; j < m; j++)
            {
                suma+=Math.pow(i,j+1)*r[j];

            }
            wynik[i] = suma;
        }
        return wynik;
    }

    public static boolean czyCiagArytmetyczny(int[] tab)
    {
        int roznica = tab[1]-tab[0];
        for(int i = 2; i < tab.length-1; i++)
        {
            if(tab[i+1]-tab[i]!=roznica)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean czyCiagArytmetycznyRodzajuM(int[] tab, int m)
    {
        //5 - (3-1) = 3 // 4 - (2-1) = 3
        int[] wynik = new int[tab.length-(m-1)];
        for(int i=0;i<m-1;i++)
        {
            for(int j=0; j<tab.length-1-i; j++)
            {
                tab[i] = tab[j+1]-tab[j];
            }
        }
        for(int i = 0; i < wynik.length; i++)
        {
            wynik[i] = tab[i];

        }
        if(czyCiagArytmetyczny(wynik)==true)
        {
            return true;
        }
        return false;
    }

    public static int podciag(int[] tab)
    {
        int wynik = 1;
        int wynikmax = wynik;
        for(int i = 0; i < tab.length-1; i++)
        {
            if(tab[i+1]>tab[i])
            {
                wynik++;
            }
            else
            {
                wynik =1;
            }
            if(wynikmax<wynik)
            {
                wynikmax = wynik;
            }
        }
        return wynikmax;
    }

    public static int podciag(int[] tab, int r)
    {
        int wynik = 1;
        int wynikmax = wynik;
        for(int i = 0; i < tab.length-1; i++)
        {
            if(tab[i+1]>tab[i]&&tab[i]+r==tab[i+1])
            {
                wynik++;
            }
            else
            {
                wynik =1;
            }
            if(wynikmax<wynik)
            {
                wynikmax = wynik;
            }
        }
        return wynikmax;
    }

    public static void sekwencjaCollatza(int n, int c)
    {
        System.out.println(c);
        while(n>1)
        {
            if(c%2==0)
            {
                c/=2;
            }
            else
            {
                c=c*3+1;
            }
            System.out.println(c);
            n--;
        }

    }

    public static void minMaxSekwencjaCollatza(int n, int c)
    {
        int min = c;
        int max = c;
        while(n>1)
        {
            if(c%2==0)
            {
                c/=2;
            }
            else
            {
                c=c*3+1;
            }
            if(c>max)
            {
                max = c;
            }
            if(c<min)
            {
                min = c;
            }
            n--;
        }
        System.out.println(min + " " + max);
    }

        // Zadania - Kolokwium gr2  bez zadań 2a 2b 3a 3b

    public static boolean dokladnosc_zad1(double x, double y, int k)
    {
        if(Math.abs(x-y)<=Math.pow(10,-k))
        {
            return true;
        }
        return false;
    }

    public static int zad2(int S)
    {
        int i = 0;
        while(!(S>Math.pow(i,2) && S<Math.pow(i+1,2)))
        {
            i++;
        }
        if(Math.abs(S-Math.pow(i,2))>Math.abs(S-Math.pow(i+1,2)))
        {
            return i+1;
        }
        return i;
    }

    public static double zad3(int S, int n, int k)
    {
        double x = S-1;
        double x_next = ((n-1)*x+S/Math.pow(x,n-1))/n;
        while(!dokladnosc_zad1(x,x_next,k))
        {
            x = x_next;
            x_next = ((n-1)*x+S/Math.pow(x,n-1))/n;
        }
        return x;
    }



    public static void main(String[] args)
    {
        //Kolokwium gr1 - wywolania
        //int[] tab = ciagArytmetycznyRodzajuM(5,3,1,new int[]{1,3,1}) ;
        //for(int i = 0; i<tab.length; i++)
        //{
            //System.out.print(tab[i]+"\t");
        //}
        //System.out.println("\n" + czyCiagArytmetyczny(tab));
        //System.out.println(czyCiagArytmetycznyRodzajuM(tab, 3));



        //System.out.println(podciag(new int[]{1,2,0,3,5,1,4}));
        //System.out.println(podciag(new int[]{1,2,3,4,5,6,7}));
        //System.out.println(podciag(new int[]{1,2,0,3,5,1,4}, 3));

        //sekwencjaCollatza(10,6);
        //minMaxSekwencjaCollatza(10,6);

        //Kolokwium gr 2 - wywolania

        //System.out.println(dokladnosc_zad1(4,2,4));
        //System.out.println(zad2(48));
        //System.out.println(zad3(4,2,4));

    }

}
