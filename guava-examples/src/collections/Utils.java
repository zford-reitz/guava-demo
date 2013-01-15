package collections;

import model.Book;
import model.Library;
import model.Patron;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class Utils {

    public static Function<Book, Patron> BOOK_TO_PATRON = new Function<Book, Patron>() {
        public Patron apply(Book book) {
            return book.getLoanedTo();
        }
    };

    public static Function<Patron, String> PATRON_TO_FIRSTNAME = new Function<Patron, String>() {
        public String apply(Patron patron) {
            if (patron != null) {
                return patron.getFirstName();
            }
            
            return null;
        }
    };

    public static Predicate<Book> IS_NOT_LOANED = 
            Predicates.compose(Predicates.isNull(), BOOK_TO_PATRON);

    public static Predicate<Book> IS_LOANED_TO_ZEB = 
            Predicates.compose(Predicates.equalTo(Library.PATRON_ZEB), BOOK_TO_PATRON);

    public static Predicate<Book> IS_LOANED_TO_SOMEONE_NAMED_TOBIAS = 
            Predicates.compose(Predicates.equalTo("Tobias"), 
                    Functions.compose(PATRON_TO_FIRSTNAME, BOOK_TO_PATRON));

    public static Joiner JOINER = Joiner.on(", ");
}
