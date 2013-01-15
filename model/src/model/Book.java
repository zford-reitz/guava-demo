package model;
import java.util.List;

import com.google.common.collect.Lists;


public class Book {
    private Author m_author;
    private String m_title;
    private List<String> m_tags = Lists.newArrayList();
    private Patron m_loanedTo;
    
    public Book(String title, Author author, List<String> tags, Patron loanedTo) {
        m_title = title;
        m_author = author;
        m_loanedTo = loanedTo;
        setTags(tags);
    }
    
    public Author getAuthor() {
        return m_author;
    }
    public void setAuthor(Author author) {
        m_author = author;
    }
    public String getTitle() {
        return m_title;
    }
    public void setTitle(String title) {
        m_title = title;
    }
    public List<String> getTags() {
        return m_tags;
    }
    public void setTags(List<String> tags) {
        m_tags.clear();
        if (tags != null) {
            m_tags.addAll(tags);
        }
    }
    public Patron getLoanedTo() {
        return m_loanedTo;
    }
    public void setLoanedTo(Patron loanedTo) {
        m_loanedTo = loanedTo;
    }
    
    @Override
    public String toString() {
        return getTitle();
    }
}
