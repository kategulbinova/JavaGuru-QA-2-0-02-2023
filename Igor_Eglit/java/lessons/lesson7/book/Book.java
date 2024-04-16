package lessons.lesson7.book;

class Book {
    private String title;
    private String author;
    private int pageCount;
    private int yearOfPublishing;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page count: " + pageCount);
        System.out.println("Year of publishing: " + yearOfPublishing);
        System.out.println();
    }
}
