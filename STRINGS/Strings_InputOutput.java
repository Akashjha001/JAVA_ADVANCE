import java.util.*;

public class Strings_InputOutput {
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = "XYZ";
        System.out.println(str);
        System.out.println(str2);
        Scanner sc = new Scanner(System.in);

        // Read a full line
        String sports = sc.nextLine();
        System.out.println(sports);
        
        // Read a single word
        String name = sc.next();
        System.out.println(name);
        System.out.println(name.length());
    }
}
