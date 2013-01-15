package model;

public class Author {

    String m_firstName;
    String m_lastName;

    public Author(String firstName, String lastName) {
        m_firstName = firstName;
        m_lastName = lastName;
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
}
