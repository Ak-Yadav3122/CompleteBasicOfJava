package String;

public class StringBasic {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        
        //  if(str1.equals(str3)){ //.equals is used to compair the same value in string.
        //     System.out.println(str3);
        // }
        // else{
        //     System.out.println("Invalid");
        // }

 
        System.out.println(str1.length());
        System.out.println(str1.equals(str2));
        System.out.println(str1.substring(0, 2));// substring() are used to find in between element
        System.out.println(str1.indexOf("a")); // indexof() are used to find the index of the character on which character starts
        System.out.println(str3.compareTo(str2));

    }
}
