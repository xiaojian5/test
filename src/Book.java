

public class Book {
    private String name;
    private int releaseYear;
    private String isbn;

    Book(int releaseYear,String name,String isbn){
        this.name = name;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "releaseYear："+releaseYear+"  name:"+name+"  isbn:"+isbn;
    }
}
