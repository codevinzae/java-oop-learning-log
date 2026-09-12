public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String theAuthor, String theName, int thePages) {
        this.author = theAuthor;
        this.name = theName;
        this.pages = thePages;
    }

    public String getAuthor() {
        return author;
    }
    public String getName(){
        return name;
    }

    public int getPages(){
        return pages;
    }

    @Override 
    public String toString(){
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}