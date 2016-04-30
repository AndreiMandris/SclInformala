package hwCollections;

import java.util.HashMap;

/**
 * Excercise 1 This application manages a store of electronic books format in a
 * HashMap.
 *
 * @author Andrei
 * @version 1.0
 */
public class ElectronicBooksStore {

    public static void main(String[] args) {

        // declare a new HashMap that contains pairs of keys of type Rating and values of type ElectronicBook
        HashMap<Rating, ElectronicBook> electronicMap = new HashMap();

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
        // Add eBook to the books

        int stars = 3;

        //creating a new rating
        Rating r1 = new Rating(stars);
        r1.setDescription("It is good book.");
        r1.setUser_id("0001");

        // adding the element(by key and value) to the hashmap
        electronicMap.put(r1, eBook);
        // create a new eBook
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

        stars = 4;

        // create a new rating
        Rating r2 = new Rating(stars);
        r2.setDescription("Great book.");
        r2.setUser_id("0002");
        //add the element(by key and value) to the hashmap
        electronicMap.put(r2, eBook);
        // create a new eBook
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

        stars = 5;
        //creating another rating
        Rating r3 = new Rating(stars);
        r3.setDescription("Wonderful book. Recommended for everyone!");
        r3.setUser_id("0003");
        // adding the element(by key and value) to the hashmap
        electronicMap.put(r3, iBook);

        //check the list of Books
        System.out.println("Book title: " + electronicMap.get(r1).getTitle());
        System.out.println("Book ISBN: " + electronicMap.get(r1).getISBN());
        System.out.println("Book Publisher: " + electronicMap.get(r1).getPublisher());
        String[] authorsOfThisBook = electronicMap.get(r1).getAuthors();
        int numberOfAuthors = authorsOfThisBook.length;
        for (int currentAuthor = 0; currentAuthor < numberOfAuthors; currentAuthor++) {
            System.out.println("Book author: " + authorsOfThisBook[currentAuthor]);
        }
        System.out.println("Book Price: " + electronicMap.get(r1).getPrice());
        System.out.println("Book format: " + electronicMap.get(r1).getElectronicFormat());
        System.out.println("Book year of publication: " + electronicMap.get(r1).getYearOfPublication());
        //System.out.println("Book remarks and notes: "+books[index].getRemarksAndNotes()[0]);
        System.out.println("------------------------------------------------------------------");

        System.out.println("Book title: " + electronicMap.get(r2).getTitle());
        System.out.println("Book ISBN: " + electronicMap.get(r2).getISBN());
        System.out.println("Book Publisher: " + electronicMap.get(r2).getPublisher());
        authorsOfThisBook = electronicMap.get(r2).getAuthors();
        numberOfAuthors = authorsOfThisBook.length;
        for (int currentAuthor = 0; currentAuthor < numberOfAuthors; currentAuthor++) {
            System.out.println("Book author: " + authorsOfThisBook[currentAuthor]);
        }
        System.out.println("Book Price: " + electronicMap.get(r2).getPrice());
        System.out.println("Book format: " + electronicMap.get(r2).getElectronicFormat());
        System.out.println("Book year of publication: " + electronicMap.get(r2).getYearOfPublication());
        //System.out.println("Book remarks and notes: "+books[index].getRemarksAndNotes()[0]);
        System.out.println("------------------------------------------------------------------");

        System.out.println("Book title: " + electronicMap.get(r3).getTitle());
        System.out.println("Book ISBN: " + electronicMap.get(r3).getISBN());
        System.out.println("Book Publisher: " + electronicMap.get(r3).getPublisher());
        authorsOfThisBook = electronicMap.get(r3).getAuthors();
        numberOfAuthors = authorsOfThisBook.length;
        for (int currentAuthor = 0; currentAuthor < numberOfAuthors; currentAuthor++) {
            System.out.println("Book author: " + authorsOfThisBook[currentAuthor]);
        }
        System.out.println("Book Price: " + electronicMap.get(r3).getPrice());
        System.out.println("Book format: " + electronicMap.get(r3).getElectronicFormat());
        System.out.println("Book year of publication: " + electronicMap.get(r3).getYearOfPublication());
        //System.out.println("Book remarks and notes: "+books[index].getRemarksAndNotes()[0]);
        System.out.println("------------------------------------------------------------------");

    }
}
