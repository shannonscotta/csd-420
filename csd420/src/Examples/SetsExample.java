package Examples;// Sets do not contain any duplicate elements and can be either a TreeSet, LinkedHashSet, or a HashSet.

// Similarly to how ArrayList and LinkedList are a concrete class of List, HashSet is a concrete class of set.
// Set is an interface and using hash implements the interface of extends it to make it concrete.

public class SetsExample {

    public static void main(String[] args) {

        java.util.List<Integer> list = new java.util.LinkedList<>();
        java.util.Set<Integer> set = new java.util.HashSet<>();

        for (int i = 0; i < 10; i++) {

            list.add(new Integer(i + 1));
            set.add(new Integer(i + 1));
        }

        System.out.println("Set Size = " + set.size());
        System.out.println("List Size = " + list.size() + "\n");

        for (int i = 0; i < 10; i++) {

            list.add(new Integer(i + 1));
            set.add(new Integer(i + 1));
        }

        System.out.println("Set Size = " + set.size());
        System.out.println("List Size = " + list.size() + "\n");

        for (int i = 0; i < 10; i++) {

            list.add(new Integer(i + 1));
            set.add(new Integer(i + 1));
        }

        System.out.println("Set Size = " + set.size());
        System.out.println("List Size = " + list.size() + "\n");
    }
}
