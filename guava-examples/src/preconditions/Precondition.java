package preconditions;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;



public class Precondition {
    
    String m_notNullNorEmptyString;
    
    public Precondition(String inputString) {
        m_notNullNorEmptyString = 
                Preconditions.checkNotNull(Strings.emptyToNull(inputString));
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
