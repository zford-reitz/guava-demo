package model;
import java.util.List;

import com.google.common.collect.ImmutableList;


public class Library {

    public static final String TAG_BIOGRAPHY = "biography";
    public static final String TAG_BESTSELLER = "bestseller";
    public static final String TAG_TECHNICAL = "technical";
    public static final String TAG_FUNNY = "funny";
    
    public static final Author AUTHOR_1 = new Author("Bruce", "Wayne"); 
    public static final Author AUTHOR_2 = new Author("Clark", "Kent"); 
    public static final Author AUTHOR_3 = new Author("Peter", "Parker"); 
    public static final Author AUTHOR_4 = new Author("Bruce", "Banner"); 
    
    public static final Patron PATRON_ZEB = new Patron("Zeb", "Ford-Reitz", 1);
    public static final Patron PATRON_TOBY = new Patron("Tobias", "Eiss", 2);

    public static final Book BOOK_1 = new Book(
            "What I Like About Bats", 
            AUTHOR_1, 
            ImmutableList.of(TAG_FUNNY, TAG_BESTSELLER), 
            null);
    public static final Book BOOK_2 = new Book(
            "Other Stuff I Like...About Bats", 
            AUTHOR_1, 
            ImmutableList.of(TAG_FUNNY), 
            PATRON_TOBY);
    public static final Book BOOK_3 = new Book(
            "Clowns Aren't Funny", AUTHOR_1, 
            ImmutableList.<String>of(), 
            PATRON_ZEB);
    public static final Book BOOK_4 = new Book(
            "I'm Super, Thanks for Asking!", 
            AUTHOR_2, 
            ImmutableList.<String>of(), 
            PATRON_ZEB);
    public static final Book BOOK_5 = new Book(
            "Climbing the Walls", 
            AUTHOR_3, 
            ImmutableList.of(TAG_BIOGRAPHY), 
            PATRON_TOBY);
    public static final Book BOOK_6 = new Book(
            "Gamma Radiation: The Big Green Monster", 
            AUTHOR_4, 
            ImmutableList.of(TAG_BIOGRAPHY, TAG_TECHNICAL, TAG_BESTSELLER), 
            PATRON_TOBY);
    public static final Book BOOK_7 = new Book(
            "Inner Peace for Beginners", 
            AUTHOR_4, 
            ImmutableList.of(TAG_BESTSELLER), 
            null);
    
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
