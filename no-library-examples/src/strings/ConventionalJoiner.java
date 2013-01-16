/*
 * $RCSfile: eclipse_3_codetemplates.xml,v $
 *
 * $Revision: 1.1 $
 *
 * $Date: 2005/06/30 11:34:59 $
 *
 * $Author: keek $ BREDEX GmbH (http://www.bredex.de) Copyright(c) 2013 
 * 
 */
package strings;

/**
 * 
 *
 * @author keek
 * @created 16.01.2013
 * @version $Revision: 1.1 $
 */
public class ConventionalJoiner {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String testString = "";
        String[] array = {"", "one", "two" , null, " ", "three"};
        for (int i = 0; i < array.length; i++) {
            testString += array[i] + ",";
        }
        testString = testString.substring(0, testString.length() - 1);
        System.out.println(testString);
    }

}
