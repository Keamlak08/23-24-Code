public class castingPractice {
    public static void main(String[] agrs){

        
        //if we want to store as a float
        //we need to convert explicitly
        float a = (float) 10.0;

        //
        double b = 10.0;

        //
        //int c = 10.0;

        //
        int d = (int) 10.0;

        /******
        MATH
        ******/

        //this is totally fine
        int e = 1;
        e = e + 1;

        //this is NOT fine
        //e = e + 1.0;

        //BUT this is fine
        e += 1.0;

        //the right way to add a double into an int
        e = (int)(e + 1.0);
        
        /******
        Rounding
        ******/

        double f = 10.9;
        
        int g = (int)f;
        
        //another way to round
        //System.out.println((int)(f + 0.5))

        /*******
        Division
        *******/

        //this is 0 because math with ints gives an int
        int h = 5/8;

        //this is still a 0. The fact that we're
        //storing the answer in a double, doesn't
        //change the fact that the division is with ints
        double i = 5/8;

        //this gives an error
        //int j = 5.0/8;

        //if we want remainder form int division,
        //we use 
        System.out.println(g);
    }
    
}
