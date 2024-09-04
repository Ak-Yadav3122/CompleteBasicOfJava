package String;


public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("Hello, ");
        sentence.append("Aichchhik Sir.")
        .append(" Your age is 23");
        
        System.out.println(sentence.toString());
    }
}
