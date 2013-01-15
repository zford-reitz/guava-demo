package preconditions;
import org.apache.commons.lang3.Validate;


public class Precondition {
    
    String m_notNullNorEmptyString;
    
    public Precondition(String inputString) {
        m_notNullNorEmptyString = Validate.notEmpty(inputString);
    }

    public void print() {
        System.out.println(m_notNullNorEmptyString);
    }
    
    
    public static void main(String[] args) {
        safeConstructAndPrint("This should print with no errors.");
        safeConstructAndPrint("      ");
        safeConstructAndPrint("");
        safeConstructAndPrint(null);
    }

    public static void safeConstructAndPrint(String inputString) {
        try {
            Precondition p = new Precondition(inputString);
            p.print();
        } catch (Exception e) {
            System.out.println(e.getClass() + " : " + e.getMessage());
        }
    }
}
