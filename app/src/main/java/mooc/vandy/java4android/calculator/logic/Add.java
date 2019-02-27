package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO -- start your code here

    // private variable sum to store addition of two number
    private int sum;

    // add method which implements the logic of addition of two numbers
   public void add(int argOne, int argTwo){
       sum = argOne + argTwo;
   }

   // getResultString method to return the result of add method
   public String getResultString(){
       return String.valueOf(sum);
   }
}
