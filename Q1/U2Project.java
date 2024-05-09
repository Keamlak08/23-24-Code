import java.util.Scanner;
import java.lang.Math;

public class U2Project {
    public static void main(String [] args)
    {
        

        /*
        This code asks what shape you want to find the area of and calcualates it for you
        */

        System.out.println();
        //135

        Scanner s = new Scanner(System.in);
        
        while (true) //I used a while(true) to make this run until you want it to stop
        {              
        
        System.out.println("Do you want to find the area of a shape? (1 for yes, 2 for no)");
        int again = s.nextInt();

        if (again == 1) //I used an if statemnet becuase it works best and you can use
        //                an else statement to break the loop which you cannot do with 
        //                a while loop
        {    
        
        System.out.println("\n\n");
        System.out.println("For Triangle type 1");
        System.out.println("For Square type 2");
        System.out.println("For Circle type 3");;
        int shape = s.nextInt();
        
        if(shape == 1)
        {

            System.out.println("Enter the base and height of the triangle seperated by a space");

            double tbase = s.nextDouble();
            double theight = s.nextDouble();
            while(tbase < 0 || theight < 0)
            {
                if(tbase < 0 || theight < 0)
                {
                    System.out.println("You can't use negatives");
                    System.out.println("Enter the base and height of the triangle seperated by a space");
                    tbase = s.nextDouble();
                    theight = s.nextDouble();
                }
            }
            double tarea = (tbase * theight) / 2;

            System.out.println("The Area for your triangle is: " + tarea);
            
            

        }

        else if (shape == 2)
        {

            System.out.println("Enter a side of your square");

            double side = s.nextDouble();
            
            
                if(side < 0)
                {
                    System.out.println("You can't use negatives");

                }
            
            double sarea = Math.pow(2, side);

            System.out.println("The Area for your square is: " + sarea);

            
            


        }
        else if(shape == 3)
        {


            System.out.println("Enter the radius of your circle");

            double radius = s.nextDouble();
            
                if(radius < 0)
                {
                    System.out.println("You can't use negatives");    
                    System.out.println("Enter the radius of your circle");
                    radius = s.nextDouble();
                }
            
            double carea = Math.pow(2, radius) * Math.PI;
            
            System.out.println("The Area of your circle is: " + carea);


            

        }
        else
        {
            break;
        }
        
        }
            else
        {
            break;
        }

        } 
        

    }
}
