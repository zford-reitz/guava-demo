package preconditions;

public class Precondition {
    
    String m_notNullNorEmptyString;
    
    public Precondition(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            throw new IllegalArgumentException();
        }
        
        m_notNullNorEmptyString = inputString;
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
