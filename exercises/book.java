public class Book {
    private String title;
    private String author;
    private int year;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public void printAll() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
    
    public static void main(String[] args) {
        Book b = new Book("The 48 Laws of Power", "Robert Greene", 1998);
        b.printAll();
    }
}
