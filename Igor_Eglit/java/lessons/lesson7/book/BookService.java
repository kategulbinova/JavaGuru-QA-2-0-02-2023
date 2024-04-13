package lessons.lesson7.book;

class BookService {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("The Lord of the Rings");
        book.setAuthor("J.R.R. Tolkien");
        book.setPageCount(1178);
        book.setYearOfPublishing(1954);
        book.printInfo();
        System.out.println();

        Book book2 = new Book();
        book2.setTitle("The Hobbit");
        book2.setAuthor("J.R.R. Tolkien");
        book2.setPageCount(310);
        book2.setYearOfPublishing(1937);
        book2.printInfo();
    }
}
