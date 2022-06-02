public class ScottGeneric {
}


// We use < > to specify Parameter type
class GenericTest<T> {
    // An object of type T is declared
    T obj;
    GenericTest(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}

// Driver class to test above
class Main {
    public static void main(String[] args)
    {
        // instance of Integer type
        GenericTest<Integer> iObj = new GenericTest<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        GenericTest<String> sObj
                = new GenericTest<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
