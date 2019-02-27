package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        if (operation == ADDITION){
            Add a = new Add();
            a.add(argumentOne, argumentTwo);
            mOut.print(a.getResultString());
        }
        else if (operation == SUBTRACTION){
            Subtract sub = new Subtract();
            sub.subtract(argumentOne, argumentTwo);
            mOut.print(sub.getResultString());
        }
        else if (operation == MULTIPLICATION){
            Multiply mul = new Multiply();
            mul.multi(argumentOne, argumentTwo);
            mOut.print(mul.getResultString());
        }
        else if (operation == DIVISION){
            Divide div = new Divide();
            div.division(argumentOne, argumentTwo);
            mOut.print(div.getResultString());
        }
    }
}
