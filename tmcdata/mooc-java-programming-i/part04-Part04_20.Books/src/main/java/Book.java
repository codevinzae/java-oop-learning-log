public class Book {
    private String title;
    private int page;
    private int publicationYear;

    public Book(String startName, int numberPage, int startPublicationYear) {
        this.title = startName;
        this.page = numberPage;
        this.publicationYear = startPublicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumber() {
        return page;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override 
    public String toString(){
        return title + ", " + page + " pages, " + publicationYear;
    }

}