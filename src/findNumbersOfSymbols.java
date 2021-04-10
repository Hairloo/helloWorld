import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findNumbersOfSymbols {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string");
        String string = reader.readLine();
        int numbersOfSymbols = findNumbersOfSymbols(string);
        System.out.println("Number of characters: " + numbersOfSymbols);
    }
    public static int findNumbersOfSymbols(String string){
        char[] arraySymbols = string.toCharArray();
        return arraySymbols.length;
    }
}
