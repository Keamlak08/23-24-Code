public class TestPrep {
    public static void main(String[] args){
        int[] array = new int[10];

        System.out.println(checkArray(array));
    }
    
    public static int checkArray(int[] array){
        int loc = array.length/2;

        for (int k = 0; k < array.length; k++){
            if (array[k] > array[loc]){
                loc = k;
            }
        }
        return loc;
    }
    
}
