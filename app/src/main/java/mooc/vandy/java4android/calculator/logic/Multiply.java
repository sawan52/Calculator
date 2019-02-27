package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here

    // private variable multiply to store multiplication of two numbers
    private int multiply;

    // multi method which implements the logic of multiplication of two numbers
    public void multi(int argOne, int argTwo){
        multiply = argOne * argTwo;
    }

    // getResultString method to return the result of multi method
    public String getResultString(){
        return String.valueOf(multiply);
    }
}
