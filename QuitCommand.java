
/**
 * A class that will make a Player stop playing
 * @author rcd1
 */
public class QuitCommand implements Command {
    private Player player;
    /**
     * Create a new QuitCommand
     * @param player the Player who's about to quit
     */
    public QuitCommand(Player player) {
        this.player = player;
    }
    /**
     * Execute a QuitCommand, or
     * quit the game.
     */
    public void execute() {
        player.quit();
    }
    
}
