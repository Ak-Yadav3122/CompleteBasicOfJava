package CollectionAndGenerics.VariableArgument;

public class VarArgs {
    public static void main(String... args) {
        System.out.println(sum(8, 7, 8, 5, 6));
        System.out.println(concatinate("Aichchhik", "Kumar", "Yadav", "From Azamgarh."));
    }

    public static int sum(int first, int second, int... a) { // always pass two are more digit in a parameter.
        int sum = first + second;
        for (int a2 = 0; a2 < a.length; a2++) {
            sum = sum + a2;
        }

        return sum;
    }

    // Concatenate String that takes variable Arguments of String types and conctenates them into single string.
    
    public static String concatinate(String... strColl) {
        StringBuilder sb = new StringBuilder();
        for (String str : strColl) {
            sb.append(str).append(" ");

        }
        return sb.toString();

    }
}
