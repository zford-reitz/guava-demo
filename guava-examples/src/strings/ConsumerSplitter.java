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

import com.google.common.base.Splitter;

/**
 * 
 * 
 * @author keek
 * @created 16.01.2013
 * @version $Revision: 1.1 $
 */
public class ConsumerSplitter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "one,two,,   three";
        
        // trimResults - removes leading Whitespaces
        // omitEmptyStrings - omits empty Strings
        System.out.println(Splitter.on(",").trimResults().omitEmptyStrings()
                .split(str));
    }

}
