package math;

import java.util.Calendar;

import com.google.common.math.IntMath;

/**
 * 
 * 
 * @author keek
 * @created 15.01.2013
 * @version $Revision: 1.1 $
 */
public class ConsumerMath {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // binominal coefficient
        binominal();
        
        // binominal with time print
        binominalWithTime();
    }

    /**
     * 
     */
    private static void binominal() {
        // Lotto
        System.out.println(IntMath.binomial(49, 6));
        // Hold'em
        System.out.println(IntMath.binomial(50, 3));
    }
    
    /**
     * 
     */
    private static void binominalWithTime() {
        long firstTime = Calendar.getInstance().getTimeInMillis();
        IntMath.binomial(49, 6);
        long secTime = Calendar.getInstance().getTimeInMillis();
        System.out.println((secTime - firstTime) + " millisec");
    }
}
