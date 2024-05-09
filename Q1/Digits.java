import java.util.Scanner;
public class Digits {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = s.nextInt();


        while(num > 0)
        {
            int digit = num % 10;
            System.out.println(digit);

            num /= 10;
        }
        




    }
}
