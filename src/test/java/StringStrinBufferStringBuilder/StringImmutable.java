package StringStrinBufferStringBuilder;

import java.awt.*;

public class StringImmutable {
    String a1 = "Hi";
    String b1 = "Hi";
    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        // Mutable Object
        Point myPoint = new Point( 0, 0 );
        System.out.println( myPoint );
        myPoint.setLocation( 1.0, 0.0 );
        System.out.println( myPoint );

        // Immutable Object Example 1
        String myString = new String( "old String" );
        System.out.println( myString );
         myString.replaceAll( "old", "new" );
        System.out.println( myString );

        // Immutable Object Example 1
        String s="How";
        System.out.println(s);//will print Sachin because strings are immutable objects
        s.concat(" Are You? ");//concat() method appends the string at the end
        System.out.println(s);

    }

}
