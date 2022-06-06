package Calculator;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    @DisplayName("Check if test is running on add function")
    void add(){
        StringCalculator calculatorObj = new StringCalculator();
         assertEquals(1,calculatorObj.add("1"));
    }

    @Test
    @DisplayName("Check Empty value")
    public void return_zero_on_empty_string(){
        StringCalculator calculatorObj = new StringCalculator();
        assertEquals(0,calculatorObj.add(""));
    }

    @Test
    @DisplayName("Return single value")
    public void return_single_value_for_single_value(){
        StringCalculator calculatorObj = new StringCalculator();
        assertEquals(5,calculatorObj.add("5"));
        assertEquals(47,calculatorObj.add("47"));
    }

    @Test
    @DisplayName("Calculate sum of two or more numbers within a string ")
    public void return_sum_of_all_values_seperated_by_comma(){
        StringCalculator calculatorObj = new StringCalculator();
        assertEquals(158,calculatorObj.add("5,58,70,4,21"));
        assertEquals(1023,calculatorObj.add("47,6,2,834,123,11"));
        assertEquals(53,calculatorObj.add("47,6"));
        assertEquals(64,calculatorObj.add("47,6,11,"));
        assertEquals(187,calculatorObj.add("47,6,123,11"));
        assertEquals(168,calculatorObj.add("34,123,11"));

        // below two tests are meant to fail and to be caught by exception
        //assertEquals(47,calculatorObj.add("47,6,2,834,123,"));
        //assertEquals(47,calculatorObj.add("47,6,"));
    }

    @Test
    @DisplayName("Adding a newline to the input ")
    public void return_sum_of_input_newlines(){
        StringCalculator calculatorObj = new StringCalculator();
        assertEquals(5,calculatorObj.add("5"));
        assertEquals(26,calculatorObj.add("4,7\n7,8"));
    }

}