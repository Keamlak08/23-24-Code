import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a big number: ");
        int x = s.nextInt();

        int count = 1;

        while((x == 186) || (count < 3))
        {
            System.out.println("That's not big enough.");
            System.out.println("Try again.");
            x = s.nextInt();
            count++;
        }

        

    }
}
