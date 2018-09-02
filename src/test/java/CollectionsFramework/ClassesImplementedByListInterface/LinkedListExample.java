package CollectionsFramework.ClassesImplementedByListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {


    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("John");
        linkedList.add("Jack");
        linkedList.add("Jeff");

        /*
         * Different way to iterate Linked List
         * 1. For Loop
         * 2. While Loop
         * 3. Enhanced For Loop
         * 4. Iterator
         * 5. Collections’s stream() util (Java8)
         * */

        //1. For loop

        System.out.println("==> For Loop Example.");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        // 2. While loop

        int i = 0;
        while (i < linkedList.size()) {
            System.out.println(linkedList.get(i));
            i++;
        }

        // 3. Enhanced for loop

        for (String temp : linkedList) {
            System.out.println(temp);
        }
        // 4. Iterator

        Iterator Iterator = linkedList.iterator();
        while (Iterator.hasNext()) {
            System.out.println(Iterator.next());
        }

        /*
        * 5. Collection stream() util (Java 8)
        * forEach() newly introduced method in Java 8
        */

        linkedList.forEach((temp) -> {
            System.out.println(temp);
        });

        /*
        * One thing should be pointed out is that the running time
        * of For Loop or While Loop is O(n square) because get(i)
        * operation takes O(n) time.
        * The other 3 ways take linear time and performs better.
        */
    }

}
