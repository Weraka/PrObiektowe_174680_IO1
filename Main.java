import java.util.*;
public class Main
{
    public static class Client implements Comparable<Client>
    {
        private String lastName;
        private double balance;

        public Client(String lastName, double balance)
        {
            this.lastName = lastName;
            this.balance = balance;
        }
        @Override
        public int compareTo(Client other)
        {
            int porownanie = Double.compare(balance, other.balance);
            if(porownanie != 0)
            {
                return porownanie;
            }
            return lastName.compareTo(other.lastName);
        }
        @Override
        public String toString()
        {
            return lastName + ", " + balance;
        }
    }
    public static class Company extends Client
    {
        private int numberOfEmployees;

        public Company(String lastName, double balance, int numberOfEmployees)
        {
            super(lastName, balance);
            this.numberOfEmployees = numberOfEmployees;
        }
        @Override
        public int compareTo(Client other)
        {
            if(other instanceof Company)
            {
                Company otherCompany = (Company)other;

                int porownanie = super.compareTo(otherCompany);
                if(porownanie == 0)
                {
                    return Integer.compare(numberOfEmployees, otherCompany.numberOfEmployees);
                }
                else
                {
                    return porownanie;
                }
            }
            return super.compareTo(other);
        }

    }
    public static void main(String[] args)
    {
        ArrayList<Client> clients = new ArrayList<>();
        Client cl1 = new Client("DupeOter", 1000000);
        clients.add(cl1);
        Client cl2 = new Client("DupeOter2", 10000);
        clients.add(cl2);

        Company company1 = new Company("DupeOter3", 2, 12);
        clients.add(company1);
        Collections.sort(clients);
        for(Client client : clients)
        {
            System.out.println(client);
        }
    }
}