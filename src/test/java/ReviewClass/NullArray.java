package ReviewClass;

import java.util.ArrayList;

public class NullArray {
    public static void main(String[] args) {

        System.out.println("Null Array");
        ArrayList<String> newArray = null;
        int x = newArray.size();
        System.out.println(x);
    }
}

// Array Size 0
 class ArraySizeZero {
    public static void main(String[] args) {

        System.out.println("Array Size Zero");
        ArrayList<String> newArray = new ArrayList<String>();
        int x = newArray.size();
        System.out.println(x);
    }
}
