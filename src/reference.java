import java.util.Date;
public class reference {
    public static void types() {
        Date now = new Date();
        String name = "BAD";
//        SOME USEFUL METHODS FOR STRINGS
        boolean startsWithB = name.startsWith("B");
        boolean endsWithD = name.endsWith("D");
        int lengthOfString = name.length();
        int indexOfA = name.indexOf('A');
        String replacedString = name.replace("A", "b");
        String upperCaseName = name.toUpperCase();
        String lowerCaseName = name.toLowerCase();

//        Printing the results
        System.out.println("Starts with B: " + startsWithB);
        System.out.println("Ends with D: " + endsWithD);
        System.out.println("Length of String: " + lengthOfString);
        System.out.println("Index of A: " + indexOfA);
        System.out.println("Replaced String: " + replacedString);
        System.out.println("Upper Case Name: " + upperCaseName);
        System.out.println("Lower Case Name: " + lowerCaseName);
        System.out.println(now);

//       NOTE ---->
//       Strings are immutable, which means once we initialize them,
//       their value cannot be changed. All methods that modify a string
//       (like toUpperCase) return a new string object.
//       The original string remains unaffected.
    }
}
