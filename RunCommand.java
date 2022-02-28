/**
 * @author Mostafa Mohamed Ali
 * The command for making the character run forward
 */
public class RunCommand implements Command {
    private Player player;
    /**
     * Sets the player object to it's expected value.
     * @param player 
     */
    public RunCommand(Player player) {
        this.player = player;
    }
    /**
     * Executes the run forward command
     */
    public void execute() {
        player.runForward();
    }
    
}
