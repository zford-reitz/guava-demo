package cache;

import java.util.Calendar;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import model.Book;
import model.Library;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/**
 * 
 * 
 * @author keek
 * @created 15.01.2013
 * @version $Revision: 1.1 $
 */
public class ConsumerCallable {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // init cache
        Cache<Keys, Book> cache = CacheBuilder.newBuilder()
                .expireAfterWrite(5, TimeUnit.MINUTES).recordStats().build();

        // load from Cache Book1 and print stats
        loadFromCache(cache, Keys.BOOK1);
        System.out.println(cache.stats());
        
        // load from Cache Book1 and print stats
        loadFromCache(cache, Keys.BOOK1);
        System.out.println(cache.stats());
    }

    /**
     * 
     */
    private static void loadFromCache(Cache<Keys, Book> cache, final Keys key) {
        try {
            long firstTime = Calendar.getInstance().getTimeInMillis();
            cache.get(key, new Callable<Book>() {
                @Override
                public Book call() throws Exception {
                    if (key == Keys.BOOK1) {
                        return Library.BOOK_1;
                    } else {
                        return Library.BOOK_2;
                    }
                }

            });
            long secTime = Calendar.getInstance().getTimeInMillis();
            System.out.println("load " + key + " in " + (secTime - firstTime)
                    + " millisec");
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
