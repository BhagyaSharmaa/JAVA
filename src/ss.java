import java.util.Scanner;

public class ss {
    public static void check(){
        Scanner sc1 = new Scanner (System.in);
        System.out.print("ALREADY DONE THE NUMBERS");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st word- ");
        String a = sc.nextLine();
        System.out.print("Enter the 2nd word- ");
        String b = sc.nextLine();
        System.out.print("Enter the 3rd word- ");
        String c = sc.nextLine();
        String d = a + b + c;
        System.out.print("Sum of all these words- "+ d);
    }
}
