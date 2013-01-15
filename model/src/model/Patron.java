package model;

public class Patron {

    private String m_firstName;
    private String m_lastName;
    private int m_id;

    
    
    public Patron(String firstName, String lastName, int id) {
        m_firstName = firstName;
        m_lastName = lastName;
        m_id = id;
    }
    
    public String getFirstName() {
        return m_firstName;
    }
    public void setFirstName(String firstName) {
        m_firstName = firstName;
    }
    public String getLastName() {
        return m_lastName;
    }
    public void setLastName(String lastName) {
        m_lastName = lastName;
    }
    public int getId() {
        return m_id;
    }
    public void setId(int id) {
        m_id = id;
    }
}
