package ACCESS_MODIFIER;

// Kelas utama Game
public class Game {
    private String title;
    private int year;
    //Construktor
    public Game(String title, int year) {
        this.title = title;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
}
