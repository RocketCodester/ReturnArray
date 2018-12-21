
import java.util.Arrays;

public class ReturnArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnIntArray()));
        int[] result = {1,2,3,4};
        returnVarArray(result);
    }
    
    public static int[] returnVarArray(int []array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i>0)
                System.out.print(", " + array[i]);
            else if (i==0)
                System.out.print(array[0]);
            else
                System.out.print("ERROR index i out of bounds");
        }
        System.out.println("]");
        return array;
    }

    public static int[] returnIntArray() {
        System.out.println("Last line in \"returnIntArray\" before return statement ");
        return new int[]{ 1,2,3,4,5,6,7,8,9,10 };
    }
    public static int returnInt() {
        return 5;
    }
}
