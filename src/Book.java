public class Book {
    private final String name; //название
    private final String author; //автор
    private final int countOfPages; //количество страниц
    private final String ISBN; //номер ISBN

    public Book(String name, String author, int countOfPages, String ISBN) {
	  this.name = name;
	  this.author = author;
	  this.countOfPages = countOfPages;
	  this.ISBN = ISBN;
    }

    public String getName() { return name; }

    public String getAuthor() { return author; }

    public int getCountOfPages() { return countOfPages; }

    public String getISBN() { return ISBN; }
}
