import java.util.Scanner;

public class loopTesting {
    public static void main(String[] agrs)
    {
        //loop that counts 1-5
        for(int i = 1; i <= 5; i ++)
        {
            System.out.println(i);
        }

        //loop that writes 5, 5 times
        for(int i = 1; i <= 5; i ++)
        {
            for (int j = 1; j <=5; j++)
            {
                System.out.println(j);
            }
        }

        /*
        code that writes:
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        */
        for(int i = 1; i <= 5; i ++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        /*
        code that writes:
        *
        **
        ***
        ****
        *****
        */

        for(int i = 0; i <= 10; i ++)
        {
            System.out.println("*");
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
        }



    }
}
