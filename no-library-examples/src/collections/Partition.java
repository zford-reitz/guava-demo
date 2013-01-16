package collections;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Library;

public class Partition {
    public static void main(String[] args) {
        
        int partitionSize = 2;
        int count = partitionSize;
        List<List<Book>> partitions = new ArrayList<List<Book>>();
        List<Book> currentList = new ArrayList<Book>();

        for (Book book : Library.ALL_BOOKS) {
            if (count >= partitionSize) {
                count = 0;
                currentList = new ArrayList<Book>();
                partitions.add(currentList);
            }
            currentList.add(book);
            count++;
        }

        PartitionPrinter.print(partitions);
    }
}
