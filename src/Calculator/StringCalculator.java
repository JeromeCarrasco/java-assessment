package Calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers){

        if(numbers.isEmpty())
            return 0;
        else {
            return Arrays.stream(getConvertedArr(getInputString(numbers))).sum();
        }

    }

    private static String[] getInputString(String numbers) {

        if(numbers.startsWith("//")){
            Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(numbers);
            if(matcher.matches()){
                String delimiter = matcher.group(1);
                String strToSplit = matcher.group(2);
                return strToSplit.split(delimiter);
            }
        }
        return numbers.split("[,|\n]");
    }

    private static int[] getConvertedArr(String[] numArr) {
        return Arrays.stream(numArr).mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {

        System.out.println("Entered Main !!!");
        System.out.println("This is a Calculator with string Input");

    }
}
