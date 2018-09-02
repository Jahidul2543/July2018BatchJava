package CollectionsFramework;

import java.util.LinkedList;
import java.util.List;

public class ExampleOfGenericInCollectionInterfaces {

    public static void main(String[] args) {
        // When Not Declared Generic we need to cast while using iterator
        List myIntList = new LinkedList();
        myIntList.add(new Integer(0));
        myIntList.add(new Integer(2));
        Integer x = (Integer) myIntList.iterator().next();
        // By for Loop
        for (Object t : myIntList) {
            System.out.println(t);
        }

        // When Declared Generic No need to cast it while iterating.

        List<Integer> genericList = new LinkedList<Integer>();
        genericList.add(5);
        Integer y = genericList.iterator().next();
        System.out.println(y);
    }

}
