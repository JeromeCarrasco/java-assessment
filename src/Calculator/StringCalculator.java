package Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers){

        if(numbers.isEmpty())
            return 0;
        else {
            int[] numArr = getConvertedArr(getInputString(numbers));
            isNegativeNumber(numArr);
            return Arrays.stream(numArr).sum();
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

    private static void isNegativeNumber(int[] numArr){
        List<Integer> negative = new ArrayList<>();
        for (int n : numArr) {
            // Simple check for +ve/-ve
            if (n < 0) {
                negative.add(n);
            }
        }
        if ( !negative.isEmpty()) {
            throw new RuntimeException("negatives not allowed" + negative);
        }

    }

    public static void main(String[] args) {

        System.out.println("Entered Main !!!");
        System.out.println("This is a Calculator with string Input");

    }
}
