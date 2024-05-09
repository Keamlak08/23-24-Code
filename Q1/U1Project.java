import java.util.Scanner;

public class U1Project{
    public static void main(String[] agrs){
        
        /*
        So my game is basically basketball but the team has a chance to 
        score a half court shot to cut the other teams score in half.
        i had a lot of fun making this :D
         */




        //begenning

        int atwos = 0;
        int atwos1 = 0;
        int athrees = 0;
        int athrees1 = 0;
        int team1 = 0;
        int team2 = 0;
        double time = 0.0;
        

        //twos
        Scanner twost1 = new Scanner(System.in);
        System.out.println("How many twos did team 1 score?");
        atwos += twost1.nextInt();
        int twos = atwos * 2;

        Scanner twost2 = new Scanner(System.in);
        System.out.println("How many twos did team 2 score?");
        atwos1 += twost2.nextInt();
        int twos2 = atwos1 * 2;

        //threes
        Scanner threest1 = new Scanner(System.in);
        System.out.println("How many threes did team 1 score?");
        athrees += threest1.nextInt();
        int threes = athrees * 3;

        Scanner threest2 = new Scanner(System.in);
        System.out.println("How many threes did team 2 score?");
        athrees1 += threest2.nextInt();
        int threes2 = athrees1 * 3;

        //Score
        team1 = twos + threes;
        team2 = twos2 + threes2;

        //half shots
        Scanner halfst1 = new Scanner(System.in);
        System.out.println("Did team 1 score their half shot? (1 for Yes)");
        int halfs = halfst1.nextInt();
        if (halfs == 1)
        {
            team2 /= 2;
            System.out.println("Team 2's score is cut in half!\n");
        }

        Scanner halfst2 = new Scanner(System.in);
        System.out.println("Did team 2 score their half shot? (1 for Yes)");
        int halfs2 = halfst2.nextInt();
        if (halfs2 == 1)
        {
            team1 /= 2;
            System.out.println("Team 1's score is cut in half!\n");
        }

        //Time
        Scanner timer = new Scanner(System.in);
        System.out.println("Total Game Time? (min.sec)");
        time = timer.nextDouble();

        /************
        TOTAL SCORE
        ************/
        
        System.out.println("--THE TOTAL SCORE IS--");
        System.out.println("TEAM 1: " + team1);
        System.out.println("TEAM 2: " + team2);
        System.out.println("GAME TIME: " + time);
        

    }
    
}
