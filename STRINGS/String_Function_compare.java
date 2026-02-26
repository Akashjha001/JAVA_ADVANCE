public class String_Function_compare{
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String ("Tony");
        if(s1==s2){
            System.out.println("Strings is equal");
        }
        else{
            System.out.println("Strings is not equal");
        }
        if(s1.equals(s3)){
            System.out.println("Strings is equal");
        }
        else{
            System.out.println("Strings is not equal");
        }
    }
}