public class FunctionArguments{
    public static void update(int marks[],int NonChangable) {
        NonChangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int NonChangable = 5;
        System.out.println(NonChangable);
        update(marks,NonChangable);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}