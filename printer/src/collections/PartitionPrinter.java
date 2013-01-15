package collections;

import java.util.List;

import model.Book;


public class PartitionPrinter {

    public static void print(List<List<Book>> partitions) {
        int count = 0;
        for (List<Book> partition : partitions) {
            System.out.println("Partition " + count++);
            for (Book book : partition) {
                System.out.println(book.getTitle());
            }
        }
    }
    
}
