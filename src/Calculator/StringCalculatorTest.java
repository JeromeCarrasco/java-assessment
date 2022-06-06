package Calculator;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    @DisplayName("Check if test is running on add function")
    void add(){
        StringCalculator calculatorObj = new StringCalculator();
         assertEquals(1,calculatorObj.add("1,2"));
    }

    @Test
    @DisplayName("Check Empty value")
    void return_zero_on_empty_string(){
        StringCalculator calculatorObj = new StringCalculator();
        assertEquals(0,calculatorObj.add(""));
    }
}