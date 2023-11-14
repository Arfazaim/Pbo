package ACCESS_MODIFIER;

// Kelas turunan dari Game
class OnlineGame extends Game {
    private String server;
    
    public OnlineGame(String title, int year, String server) {
        super(title, year);
        this.server = server;
    }
   
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Server: " + server);
    }
}

