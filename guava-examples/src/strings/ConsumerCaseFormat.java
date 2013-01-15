package strings;

import com.google.common.base.CaseFormat;

/**
 * 
 * 
 * @author keek
 * @created 16.01.2013
 * @version $Revision: 1.1 $
 */
public class ConsumerCaseFormat {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(
                CaseFormat.LOWER_CAMEL, "CONSTANT_NAME"));
    }

}
