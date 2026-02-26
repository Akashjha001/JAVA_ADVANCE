/*
Check string is a palindrome (repeating same word from backside)
eg. "racecar", "noon", "madam", "12321"
*/
public class String_Question_1{
    public static void PrintLetters(String str) {
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
// it's time complexity is O(n)