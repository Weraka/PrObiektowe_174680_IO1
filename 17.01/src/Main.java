import java.util.*;

public class Main {

    //A1
    public static <T> void printUnique(Collection<T> items)
    {
        Set<T> uniqueElements = new HashSet<T>(items);
        for(T item : uniqueElements)
        {
            System.out.println(item);
        }
    }

    //A2
    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2)
    {
        ArrayList<T> merged = new ArrayList<>();

        merged.addAll(list1);
        merged.addAll(list2);

        return merged;
    }

    //A3
    public static <T> void removeEveryOther(Collection<T> items)
    {
        items.removeIf(item -> (int) item % 2 == 0);
        for(T item : items)
        {
            System.out.println(item);
        }
    }

    //B1
    public static <T> void reversePrint(Iterable<T> items)
    {
        List<T> tempList = new ArrayList<>();
        
        // Dodajemy wszystkie elementy z Iterable do listy
        for (T item : items) {
            tempList.add(item);
        }
        
        // Iterujemy w odwrotnej kolejności i drukujemy elementy
        for (int i = tempList.size() - 1; i >= 0; i--) {
            System.out.println(tempList.get(i));
        }

    }

    //F1
    public static <T extends Comparable<T>> TreeSet<T> findElementsInRange(TreeSet<T> set, T lowerBound, T upperBound)
    {
        TreeSet<T> treeSet = new TreeSet<>(set.subSet(lowerBound, true, upperBound, true));

        return treeSet;
    }

    public static void main(String[] args)
    {
        /*int lowerBound = 9;
        int upperBound = 20;
        TreeSet<Integer> treeSet  = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(12);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(21);

        System.out.println(findElementsInRange(treeSet,lowerBound,upperBound));*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);

        removeEveryOther(list);

        /*ArrayList<Integer> list1 = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(mergeLists(list, list1));*/

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Wywołanie reversePrint na liście
        System.out.println("Odwrócona lista:");
        reversePrint(names);

        // Przykładowa sekwencja z zestawu
        Set<Integer> numbers = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40));

        // Wywołanie reversePrint na zestawie
        System.out.println("Odwrócony zestaw:");
        reversePrint(numbers);


    }
}
