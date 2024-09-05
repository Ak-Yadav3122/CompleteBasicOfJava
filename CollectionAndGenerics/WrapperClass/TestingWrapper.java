package CollectionAndGenerics.WrapperClass;

public class TestingWrapper {
    public static void main(String[] args) {
        Integer first = Integer.valueOf(32);// Once initialize we can access the utility methods likes valueOf,
                                            // hashCode,toString etc.
        System.out.println(first.doubleValue());  // convert the value of first into double.

        // AutoBoxing Concept
        Integer second = 32; // autometic conversion of primtive to their wrapper class object
        System.out.println(second);

        // UnBoxing Concept
        Integer value = 43;
        int valueofThe = value; // unboxing, autometic conversion of wrapper class object to their primtive types.
        System.out.println(valueofThe);

    }
}
