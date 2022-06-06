package Calculator;

import java.util.Arrays;

public class StringCalculator {

    public int add(String numbers){

        if(numbers.isEmpty())
            return 0;
        else if (numbers.contains(",")) {
            String[] numArr = numbers.split(",|\n");

            int[] numArray = Arrays.stream(numArr).mapToInt(Integer::parseInt).toArray();

            return Arrays.stream(numArray).sum();
        } else {
            return Integer.parseInt(numbers);
        }

    }



    public static void main(String[] args) {

        int result;
        System.out.println("Entered Main !!!");
        System.out.println("This is a Calculator with string Input");

        //StringCalculator calTestObj = new StringCalculator();

        //result = calTestObj.add("1");

        //System.out.println("final result is "+result);
    }
}
