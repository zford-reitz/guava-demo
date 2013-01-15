package collections;

import model.Book;
import model.Library;

import com.google.common.collect.FluentIterable;

public class Filter {

    public static void main(String[] args) {
        
        // books that aren't checked out
        Iterable<Book> notCheckedOut = FluentIterable
                .from(Library.ALL_BOOKS)
                .filter(Utils.IS_NOT_LOANED);
        System.out.println("not checked out");
        System.out.println(Utils.JOINER.join(notCheckedOut));
        System.out.println();
        
        // books that are checked out to Zeb
        Iterable<Book> checkedOutToZeb = FluentIterable
                .from(Library.ALL_BOOKS)
                .filter(Utils.IS_LOANED_TO_ZEB);
        System.out.println("checked out to Zeb");
        System.out.println(Utils.JOINER.join(checkedOutToZeb));
        System.out.println();
        
        // books that are checked out to someone named "Tobias"
        Iterable<Book> checkedOutToSomeoneNamedTobias = FluentIterable
                .from(Library.ALL_BOOKS)
                .filter(Utils.IS_LOANED_TO_SOMEONE_NAMED_TOBIAS);
        System.out.println("checked out to someone named 'Tobias'");
        System.out.println(Utils.JOINER.join(checkedOutToSomeoneNamedTobias));
        System.out.println();
    }
    
}
