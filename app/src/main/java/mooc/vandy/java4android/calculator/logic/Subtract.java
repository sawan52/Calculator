package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here

    // private variable sub to store subtraction of two numbers
    private int sub;

    // subtract method which implements the logic of subtraction of two numbers
    public void subtract(int argOne, int argTwo){
        sub = argOne - argTwo;
    }

    // getResultString method returns the result of method subtract
    public String getResultString(){
        return String.valueOf(sub);
    }
}
