package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here

    // private variable quotient to store quotient after division
    private int quotient;

    // private variable remainder to store remainder after division
    private int remainder;

    // private variable result to return result after division
    private String result;

    // division method which implements the logic of division of two numbers with quotient and remainder and also handling
    // division by zero exception.
    public void division(int argOne, int argTwo){

        try{
            quotient = argOne / argTwo;

            remainder = argOne % argTwo;

            result =  String.valueOf(quotient + "R: " + remainder);
        }
        catch (ArithmeticException e){
            result = "Division by zero is not possible, Enter a non zero value!";
        }
    }

    // getResultString method return the result of division method
    public String getResultString(){
        return result;
    }
}
