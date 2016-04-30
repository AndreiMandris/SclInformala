
package hwCollections;

import java.util.TreeSet;
import java.util.Iterator;

/**
 *This application manages a store of electronic books format in a TreeSet.
 * @author Andrei
 * @version 1.0
 */
public class ElectronicBookStore2 {
    
    public static void main(String[] args) {
        //creating a TreeSet of ElectronicBook elements
        TreeSet<ElectronicBook> ts = new TreeSet();

        // create a new eBook
        String isbn = "978-606-758-671-8";
        String[] authors = new String[]{"Lev Grossman", "Mira Grossman"};
        EBook eBook = new EBook(isbn, authors);
        eBook.setTitle("Taramul Magicianului");
        eBook.setPrice(20.93f);
        eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.DRM);
        eBook.setRecommendedReader(EBook.eBooksReaders.AMAZON);
        eBook.setPublisher("Nemira");
        eBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2016);
        String[] downloadLinks = new String[]{
            "http://www.elefant.ro/ebooks/fictiune/literatura-de-divertisment/sf-fantasy/taramul-magicianului-al-treilea-volum-al-seriei-magicienii-322807.html"
        };
        eBook.setRemarksAndNotes(new String[]{""});
        eBook.setDownloadLinks(downloadLinks);
        //appending the ElectronicBook (eBook) to the set.
        ts.add(eBook);
        
        //creating an eBook
        isbn = "978-606-758-667-1";
        authors = new String[]{"Bogdan Munteanu"};
        eBook = new EBook(isbn, authors);
        eBook.setTitle("Ai uitat sa zambesti.");
        eBook.setPrice(12.53f);
        eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.DRM);
        eBook.setRecommendedReader(EBook.eBooksReaders.AMAZON);
        eBook.setPublisher("Nemira");
        eBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2016);
        downloadLinks = new String[]{
            "http://www.elefant.ro/ebooks/fictiune/literatura-romana/literatura-romana-contemporana/ai-uitat-sa-razi-322805.html"
        };
        eBook.setDownloadLinks(downloadLinks);
        eBook.setRemarksAndNotes(new String[]{""});
        
        ts.add(eBook);

// create a new iBook
        isbn = "978-606-758-667-3";
        authors = new String[]{"Dany Ionathan", "Sandy Marion", "Leonore Bittman"};
        IBook iBook = new IBook(isbn, authors);
        iBook.setTitle("The Swift Programming Language (Swift 2.2)");
        iBook.setPrice(0.00f);
        iBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.IBA);
        iBook.setRecommendedReader(IBook.iBooksReaders.APPIPAD);
        iBook.setPublisher("Apple");
        iBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2014);
        downloadLinks = new String[]{
            "https://itunes.apple.com/us/store?mt=11"
        };        
        iBook.setDownloadLinks(downloadLinks);
        eBook.setRemarksAndNotes(new String[]{"This is a great iBook!", "I recommend it!"});
        
        ts.add(iBook);
        
        //creating an iterator to go through the set
        Iterator iter = ts.iterator();
        //iterating through the set in order to print the books.
        while(iter.hasNext()){
            ElectronicBook eb = (ElectronicBook)iter.next();
            System.out.println("Book title: "+eb.getTitle());
            System.out.println("Book ISBN: "+eb.getISBN());
            System.out.println("Book Publisher: "+eb.getPublisher());
            String[] authorsOfThisBook = eb.getAuthors();
            int numberOfAuthors = authorsOfThisBook.length;
            for(int currentAuthor=0;currentAuthor<numberOfAuthors;currentAuthor++)
            {
                System.out.println("Book author: "+ authorsOfThisBook[currentAuthor]);
            }
            //System.out.println("Book Authors: "+books[index].getAuthors()[0]);
            System.out.println("Book Price: "+eb.getPrice());
            System.out.println("Book format: "+eb.getElectronicFormat());
            System.out.println("Book year of publication: "+eb.getYearOfPublication());
            //System.out.println("Book remarks and notes: "+books[index].getRemarksAndNotes()[0]);
            System.out.println("------------------------------------------------------------------");
        }
        
    }
    
}
