package Ejercicio4;

public class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean isLoaned;
    public void ShowDetails()
    {
        System.out.println("Title: "+title);
        System.out.println("ItemID: "+itemId);
        System.out.println("IsLoaned: "+isLoaned);
    }

    public LibraryItem(String title, int itemId, boolean isLoaned) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = isLoaned;
    }
}
