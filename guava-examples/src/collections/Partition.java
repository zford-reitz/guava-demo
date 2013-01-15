package collections;

import java.util.List;

import model.Book;
import model.Library;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class Partition {
    public static void main(String[] args) {
        
        List<List<Book>> partition = Lists.newArrayList(
                Iterables.partition(Library.ALL_BOOKS, 2));
        
        PartitionPrinter.print(partition);
    }
}
