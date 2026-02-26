public class String_CharAt_Method{
    public static void PrintLetters(String str) {
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String First_name = "Akash";
        String Second_name = "Jha";
        String Full_name = First_name + " " + Second_name;
        System.out.println(Full_name);
        PrintLetters(Full_name);
    }
}