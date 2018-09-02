package JavaMemoryAllocation;

public class HeapStack {

}

class Person {
    int pid;
    String name;

    public Person(int pid, String name){
        this.pid = pid;
        this.name = name;

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // constructor, setters/getters
}

class Driver {
    public static void main(String[] args) {
        int id = 23;
        String pName = "Jon";
        Person p = null;
        p = new Person(id, pName);
        System.out.println("This is to explain Heap and Stack");
    }
}
