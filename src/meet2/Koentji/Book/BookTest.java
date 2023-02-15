public class BookTest {
    public static void main(String[] args) {
        Author nano = new Author("Nano Yulian P.", "nano@bps.go.id", 'm');
        System.out.println(nano);

        Book oopBook = new Book("OOP for dummies", nano, 50000,100);
        System.out.println(oopBook);

        oopBook.setPrice(35000);
        oopBook.setQty(50);

        Book javaBook = new Book("Java for dummies", new Author("Wa Dde Zuhayeni M.", "yeni@bps.go.id", 'f'), 10000);
        
        System.out.println(javaBook);
        Author yeni = javaBook.getAuthor();
        System.out.println(yeni);
    }
}
