package StringStrinBufferStringBuilder;

/*
* Mutable objects have fields that can be changed, immutable objects have no fields that can be changed after the object is created.

  A very simple immutable object is a object without any field. (For example a simple Comparator Implementation).

* */

public class ImmutableObjectExample {
    public static void main(String[] args) {
        System.out.println("Mutable and Immutable Object Example");
        Mutable objMutable = new Mutable(5);
        System.out.println(objMutable);
        System.out.println(objMutable.getValue());
        objMutable.setValue(6);
        System.out.println(objMutable.getValue());

        Immutable objImmutable = new Immutable(4);
        System.out.println(objImmutable.getValue());

        objImmutable.setValue(8);
        System.out.println(objImmutable.getValue());
    }
}


class Mutable{
    private int value;
    public  int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public Mutable(int value) {
        this.value = value;
    }

    //getter and setter for value
}

class Immutable {
    private final int value;

    public int getValue() {
        return value;
    }
    public int setValue(int value){
        return value;
    }

    public Immutable(int value) {
        this.value = value;
    }

    //only getter
}