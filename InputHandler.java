import java.util.HashMap;
/**
 * A class to handle user input 
 * and corresponing commands
 * @author rcd1
 */
public class InputHandler {
    private HashMap<String,Command> commands = new HashMap<String, Command>();
    /**
     * Create a new InputHandler
     * @param player the hero we want to spur into action
     */
    public InputHandler(Player player) {
        commands.put("jump", new JumpCommand(player));
        commands.put("run", new RunCommand(player));
        commands.put("fire", new FireCommand(player));
        commands.put("quit", new QuitCommand(player));
    }
    /**
     * Check which command the player should act now
     * @param button the string corresponding to a command
     */
    public void buttonPressed(String button) {
        for (String i : commands.keySet()) {
            if (button.equals(i)){
                commands.get(i).execute();;
            }
        }

    }
}
