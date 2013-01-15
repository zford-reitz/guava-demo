package collections;

import model.Library;

import collections.util.Utils;

import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;

public class Transform {

    
    public static void main(String[] args) {
        
        // print first names of all patrons with books checked out
        FluentIterable<String> firstNames = FluentIterable.from(Library.ALL_BOOKS)
            .transform(Utils.BOOK_TO_PATRON)
            .filter(Predicates.notNull())
            .transform(Utils.PATRON_TO_FIRSTNAME);

        System.out.println(Joiner.on(", ").join(firstNames));
        
        // remove duplicate names
        System.out.println(Joiner.on(", ").join(firstNames.toImmutableSet()));
        
    }
}
