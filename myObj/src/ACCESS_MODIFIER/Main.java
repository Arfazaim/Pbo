package ACCESS_MODIFIER;

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