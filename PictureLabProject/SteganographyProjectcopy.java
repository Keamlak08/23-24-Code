import java.awt.Color;
public class SteganographyProject
{
    public static void main(String[] args)
    {

        Picture originalPicture = new Picture("Miguel.jpg");
        Picture hiddenPicture = new Picture("Mateo.jpg");
        
        if (canHide(originalPicture, hiddenPicture) == true){
            
            Picture completePicture = hidePicture(originalPicture, hiddenPicture);

            Picture revealed = revealPicture(completePicture);

            revealed.write("revealed.png");
            completePicture.write("combinedImage.png");
            
            testClearLow(revealed);
        
            System.out.println("Your picture has been combined in 'completeImage.png' and revealed in 'revealed.png'.");
        } else {
            System.out.println("Your combination failed because the pictures weren't the same size.");
        }
        
        
        Picture filteredPicture = filter(originalPicture);
        Picture filteredPicture2 = filter(hiddenPicture);
        filteredPicture.write("filteredPicture.png");
        filteredPicture2.write("filteredPicture2.png");
        
        System.out.println("Your pictures have also been filtered in 'filteredPicture/2.png'.");
    }
    
    //new method to reveal picture
    public static Picture revealPicture(Picture p){
        Picture copy = new Picture(p);
        Pixel[][] pix_new = copy.getPixels2D();
        Pixel[][] pix_old = p.getPixels2D();

        for(int i = 0; i < pix_new.length; i++){
            for(int j = 0; j < pix_new[0].length; j++){
                Pixel x = pix_new[i][j];
            
            //get the color of the old picture
            Pixel x_old = pix_old[i][j];
            Color c_old = x_old.getColor();
            //thurn the color into rgb values
            int oldR = c_old.getRed();
            int oldG = c_old.getGreen();
            int oldB = c_old.getBlue();

            //calculate new color
            int newR = oldR % 4 * 64;
            int newG = oldG % 4 * 64;
            int newB = oldB % 4 * 64;

            //update Pixel x
            x.setRed(newR);
            x.setGreen(newG);
            x.setBlue(newB);

            }
        }
        return copy;

    }

    public static void mostSignificant(Pixel p){
        Color oldColor = p.getColor();

        int secret_r = oldColor.getRed();
        int secret_g = oldColor.getGreen();
        int secret_b = oldColor.getBlue();

        int secret_r_top2bits = secret_r / 64;
        int secret_g_top2bits = secret_g / 64;
        int secret_b_top2bits = secret_b / 64;

        
        p.setColor(new Color(secret_r_top2bits, secret_g_top2bits, secret_b_top2bits));
    } 


    /**
    * Clear the lower (rightmost) two bits in a pixel.
    */
    public static void clearLow( Pixel p )
    {
        Color oldColor = p.getColor();

        int r = oldColor.getRed();
        int g = oldColor.getGreen();
        int b = oldColor.getBlue();

        //clear the most right bit
        r/=8;
        r*=8;

        g/=8;
        g*=8;

        b/=8;
        b*=8;

        p.setColor(new Color(r, g, b));
    }
    
    /**
     * Returns a new Picture object with the lowest two bits of each pixel cleared.
     */
    public static Picture testClearLow(Picture p)
    {
        Picture p2 = new Picture(p);
        Pixel[][] pix = p2.getPixels2D();
        
        for(int r = 0; r < pix.length; r++){
            
            for(int c = 0; c < pix[0].length; c++){
                Pixel x = pix[r][c];
                
            }
        }
        
        return p2;
    }

    public static boolean canHide(Picture orginialPicture, Picture hiddenPicture)
    {
        boolean checkpossible = false;
        if (orginialPicture.getWidth() == hiddenPicture.getWidth() && 
        orginialPicture.getHeight() == hiddenPicture.getHeight()){
            checkpossible = true;
        }
        
        return checkpossible;
    }


    public static Picture hidePicture(Picture originalPicture, Picture secretPicture)
    {
        Picture copy = new Picture(originalPicture);

        Pixel[][] source = copy.getPixels2D();
        Pixel[][] secret = secretPicture.getPixels2D();


        for(int i = 0; i < source.length; i++){

            for(int j = 0; j < source[0].length; j++){

                Pixel orginalPixel = source[i][j];
                Pixel secretPixel = secret[i][j];
                
                clearLow(source[i][j]);


                int secret_r = secretPixel.getRed();
                int secret_g = secretPixel.getGreen();
                int secret_b = secretPixel.getBlue();

                int secret_r_top2bits = secret_r / 64;
                int secret_g_top2bits = secret_g / 64;
                int secret_b_top2bits = secret_b / 64;

                int newRed = orginalPixel.getRed() + secret_r_top2bits;
                int newGreen = orginalPixel.getGreen() + secret_g_top2bits;
                int newBlue = orginalPixel.getBlue() + secret_b_top2bits;
                
                source[i][j].setColor(new Color(newRed, newGreen, newBlue));
            }
        }
        return copy;
    }

    public static Picture filter(Picture picture){
        
        Picture madFilter = new Picture(picture);
        Pixel[][] pix = madFilter.getPixels2D();
        
        for(int r = 0; r < pix.length; r++){
            
            for(int c = 0; c < pix[0].length; c++){

                pix[r][c].setBlue(50);
                pix[r][c].setGreen(50);
            }
        }

        return madFilter;
    }
}
