package model;
import java.util.List;

import com.google.common.collect.ImmutableList;


public class Library {

    public static final String TAG_FREESOFTWARE = "free software";
    public static final String TAG_BESTSELLER = "bestseller";
    public static final String TAG_TECHNICAL = "technical";
    public static final String TAG_FUNNY = "funny";
    
    public static final Author AUTHOR_1 = new Author("Richard", "Stallman"); 
    public static final Author AUTHOR_2 = new Author("Richard", "Stallman"); 
    public static final Author AUTHOR_3 = new Author("Eric", "Raymond"); 
    public static final Author AUTHOR_4 = new Author("Richard", "Stallman"); 
    
    public static final Patron PATRON_ZEB = new Patron("Zeb", "Ford-Reitz", 1);
    public static final Patron PATRON_TOBY = new Patron("Tobias", "Eiss", 2);

    public static final Book BOOK_1 = new Book("Book1", AUTHOR_1, ImmutableList.of(TAG_FREESOFTWARE), null);
    public static final Book BOOK_2 = new Book("Book2", AUTHOR_1, null, PATRON_TOBY);
    public static final Book BOOK_3 = new Book("Book3", AUTHOR_1, null, PATRON_ZEB);
    public static final Book BOOK_4 = new Book("Book4", AUTHOR_2, null, PATRON_ZEB);
    public static final Book BOOK_5 = new Book("Book5", AUTHOR_3, null, PATRON_TOBY);
    public static final Book BOOK_6 = new Book("Book6", AUTHOR_4, null, PATRON_TOBY);
    public static final Book BOOK_7 = new Book("Book7", AUTHOR_4, null, null);
    
    public static final List<Book> ALL_BOOKS = ImmutableList.<Book>builder()
            .add(BOOK_1)
            .add(BOOK_2)
            .add(BOOK_3)
            .add(BOOK_4)
            .add(BOOK_5)
            .add(BOOK_6)
            .add(BOOK_7)
            .build();
    
}
