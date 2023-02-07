package ie.atu.Productv5;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("pink")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.00);
            myMusic.setLabel("the Columbia group");
            myMusic.setArtist("Pink Floyd");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("come as you are")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Come as you are");
            myMusic.setPrice(7.00);
            myMusic.setLabel("Geffen Records");
            myMusic.setArtist("Nirvana");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("one")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("One");
            myMusic.setPrice(10.00);
            myMusic.setLabel("Blackened Recordings");
            myMusic.setArtist("Metallica");
            p = myMusic;
        }

        if (productCode.equalsIgnoreCase("bravia")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setPrice(819.00);
            myTV.setManufacture("Sony");
            myTV.setScreenSize(55);
            p = myTV;
        } else if (productCode.equalsIgnoreCase("g2")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("LG G2 4K OLED SMART TV OLED65G26LA");
            myTV.setPrice(2699.99);
            myTV.setManufacture("LG");
            myTV.setScreenSize(65);
            p = myTV;
        } else if (productCode.equalsIgnoreCase("S95B")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SAMSUNG S95B 4K QUANTUM OLED SMART TV QE55S95BATXXU");
            myTV.setPrice(1499.99);
            myTV.setManufacture("Samsung");
            myTV.setScreenSize(60);
            p = myTV;
        }

        return p;
    }
}

