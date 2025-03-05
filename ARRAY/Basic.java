import java.util.*;
public class Basic{
    public static void main(String[] args) {
        //Creating Array
        int marks[]= new int[100];
        Scanner sc = new Scanner(System.in);
        //Adding marks in Array
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phys marks :" + marks[0]);
        System.out.println("chem marks :" + marks[1]);
        System.out.println("maths marks :" + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Total Percentage :" + percentage + "%");
        System.out.println("Length of Array is :" + marks.length);

    }
}