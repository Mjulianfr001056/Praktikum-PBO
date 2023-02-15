package BookOnetoMany;

public class TestBook {
    public static void main(String[] args) {
        Author A1 = new Author("Juan Firdaus", "Firdaus@stis.ac.id", 'L');
        Author A2 = new Author("Sari Paulus", "Paulus@stis.ac.id", 'P');
        Author A3 = new Author("Ainul Baharuddin", "Baharuddin@stis.ac.id", 'L');
        
        Author[] dafAuthors = new Author[3];
        dafAuthors[0] = A1;
        dafAuthors[1] = A2;
        dafAuthors[2] = A3;
        
        Book B1 = new Book("Mencari Cinta Sejati", dafAuthors, 500000);

        System.out.println(B1.toString());
    }
}

