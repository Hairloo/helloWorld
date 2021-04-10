
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuboidVolumes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        final int[] firstCuboid = new int[3];
        final int[] secondCuboid = new int[3];
        for(int i  = 0; i < 3; i++){
            a = Integer.parseInt(reader.readLine());
            firstCuboid[i] = a;
        }
        for(int i  = 0; i < 3; i++){
            a = Integer.parseInt(reader.readLine());
            secondCuboid[i] = a;
        }
        System.out.println(findDifference(firstCuboid, secondCuboid));

    }
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int quotientOne = 1;
        int quotientTwo = 1;
        int difference = 0;
        for(int i = 0; i < firstCuboid.length; i++){
            quotientOne = firstCuboid[i] * quotientOne;
        }
        for(int i = 0; i < secondCuboid.length; i++ ){
            quotientTwo = secondCuboid[i] * quotientTwo;
        }
        if(quotientOne > quotientTwo){
            difference = quotientOne - quotientTwo;
        }
        else if(quotientTwo > quotientOne){
            difference = quotientTwo - quotientOne;
        }
        else{
            difference = 0;
        }
        return difference;
    }
}
