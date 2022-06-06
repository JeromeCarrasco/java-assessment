package Calculator;

import java.util.Arrays;

public class StringCalculator {

    public int add(String numbers){

        if(numbers.isEmpty())
            return 0;
        else {
            return Arrays.stream(getConvertedArr(getInputString(numbers))).sum();
        }

    }

    private static String[] getInputString(String numbers) {
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
