/**
 * @author Benjamin Singleton
 * The command for making the character fire
 */
public class FireCommand implements Command {
    private Player player;

    /**
     * Sets passed in player to player object
     * @param player The player object
     */
    FireCommand(Player player) {
        this.player = player;
    }
    
    /**
     * Executes the fire command
     */
    public void execute() {
        player.fire();
    }
    
}
