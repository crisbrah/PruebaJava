package Ejercicio4;

public class Book extends LibraryItem{
    private String autor;
    public Book(String title, int itemId, boolean isLoaned, String autor)
    {
        super(title, itemId, isLoaned);
        this.autor=autor;
    }
}
