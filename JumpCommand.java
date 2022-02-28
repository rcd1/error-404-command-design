/**
 * @author Daniel Henington
 * The command for making the character jump
 */
public class JumpCommand implements Command {
    private Player player;
    /**
     * Sets the player object to it's expected value.
     * @param player 
     */
    public JumpCommand(Player player) {
        this.player = player;
    }
    /**
     * Executes the jump command.
     */
    public void execute() {
        player.jump();
    }
    
}
