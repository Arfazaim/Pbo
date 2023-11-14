// Kelas utama Game
public class Game {
    private String title;
    private int year;
    
    // Konstruktor untuk inisialisasi
    public Game(String title, int year) {
        this.title = title;
        this.year = year;
    }
    
    // Accessor (getter) untuk mengakses judul
    public String getTitle() {
        return title;
    }
    
    // Accessor (getter) untuk mengakses tahun
    public int getYear() {
        return year;
    }
    
    // Method untuk menampilkan informasi game
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
}

// Kelas turunan dari Game
class OnlineGame extends Game {
    private String server;
    
    public OnlineGame(String title, int year, String server) {
        super(title, year);
        this.server = server;
    }
    
    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method displayInfo dari kelas Game
        System.out.println("Server: " + server);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Game
        Game game1 = new Game("The Witcher 3", 2015);
        game1.displayInfo();
        
        System.out.println(); // Spasi
        
        // Membuat objek OnlineGame
        OnlineGame onlineGame1 = new OnlineGame("World of Warcraft", 2004, "US Server");
        onlineGame1.displayInfo();
    }
}
