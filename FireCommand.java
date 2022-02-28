public class FireCommand implements Command {
    private Player player;

    FireCommand(Player player) {
        this.player = player;
    }
    
    public void execute() {
        player.fire();
    }
    
}
