package src.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("ABC");

        for (Object o : arrayList) {
            System.out.println(o);
            if (o instanceof Integer) {
                System.out.println("Integer type");
                System.out.println((Integer) o);
            } else if (o instanceof String) {
                System.out.println("String type");
                System.out.println((String) o);
            }
        }

        ArrayList<Integer> intList = new ArrayList<>(10);
        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(intList);
        System.out.println(intList.size() + "\n----------");
        intList.removeIf(a -> a.equals(2));
        System.out.println(intList);
        System.out.println(intList.size() + "\n----------");

        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
