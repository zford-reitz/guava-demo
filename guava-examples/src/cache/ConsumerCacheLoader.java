package cache;

import java.util.Calendar;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import model.Book;
import model.Library;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * 
 * 
 * @author keek
 * @created 15.01.2013
 * @version $Revision: 1.1 $
 */
public class ConsumerCacheLoader {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // init Cache
        LoadingCache<Keys, Book> cache = CacheBuilder.newBuilder()
                .expireAfterWrite(5, TimeUnit.MINUTES).recordStats()
                .build(new CacheLoader<Keys, Book>() {

                    public Book load(Keys key) throws Exception {
                        if (key == Keys.BOOK1) {
                            return Library.BOOK_1;
                        } else {
                            return Library.BOOK_2;
                        }
                    }
                });

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
    private static void loadFromCache(LoadingCache<Keys, Book> cache, Keys key) {
        try {
            long firstTime = Calendar.getInstance().getTimeInMillis();
            cache.get(key);
            long secTime = Calendar.getInstance().getTimeInMillis();
            System.out.println("load " + key + " in " + (secTime - firstTime)
                    + " millisec");
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
