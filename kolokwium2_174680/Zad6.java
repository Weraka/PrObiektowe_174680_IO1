class Obiekty<T>
{
    T obiekt1;
    T obiekt2;

    public void setObiekt1(T obiekt1)
    {
        this.obiekt1 = obiekt1;
    }
    public T getObiekt1()
    {
        return obiekt1;
    }
    public void setObiekt2(T obiekt2)
    {
        this.obiekt2 = obiekt2;
    }
    public T getObiekt2()
    {
        return obiekt2;
    }

}
public class Zad6
{
    public static <T> boolean isEqualOrNull(T obiekt1, T obiekt2)
    {
       if(obiekt1 == obiekt2 || obiekt1 == null || obiekt2 == null)
       {
           return true;
       }
       else
       {
           return false;
       }
    }
}
