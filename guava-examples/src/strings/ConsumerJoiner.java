package strings;

import com.google.common.base.Joiner;

/**
 * 
 *
 * @author keek
 * @created 16.01.2013
 * @version $Revision: 1.1 $
 */
public class ConsumerJoiner {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Joiner
        Joiner joiner = Joiner.on(",").skipNulls();
        String st = joiner.join("one", "", null, "two");

        System.out.println(st);
        
    }

}
