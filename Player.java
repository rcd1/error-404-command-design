import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Player {

    /**
     * Prints opening dialogue
     */
    public Player() {
        System.out.println("Our hero is born.");
    }
    
    /**
     * Displays the character jumping up and down in the console
     */
    public void jump() {
        /* Loop through the jump.txt file, 
        display 6 lines of the file at a time,  
        sleep for a brief period of time, 
        then clear the console
        Continue to do this until the file is empty
        */
        File jump = new File("jump.txt");
        Scanner scan = null;
        try{
            scan = new Scanner(jump);
            while(scan.hasNextLine()) {
                for(int i = 0; i < 6; i++) {
                    System.out.println(scan.nextLine());
                }
                Thread.sleep(100);
                System.out.print("\033[H\033[2J"); 
                System.out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * Displays the character firing in the console
     */
    public void fire() {
        /* Loop through the fire.txt file, 
        display 3 lines of the file at a time,  
        sleep for a brief period of time, 
        then clear the console
        Continue to do this until the file is empty
        */
        File jump = new File("fire.txt");
        Scanner scan = null;
        try{
            scan = new Scanner(jump);
            while(scan.hasNextLine()) {
                for(int i = 0; i < 3; i++) {
                    System.out.println(scan.nextLine());
                }
                Thread.sleep(100);
                System.out.print("\033[H\033[2J"); 
                System.out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Displays the character running in the console
     */
    public void runForward() {
        /* Loop through the jump.txt file, 
        display 3 lines of the file at a time,  
        sleep for a brief period of time, 
        then clear the console
        Continue to do this until the file is empty
        */
        File run = new File("run.txt");
        Scanner scan = null;
        try{
            scan = new Scanner(run);
            while(scan.hasNextLine()) {
                for(int i = 0; i < 3; i++) {
                    System.out.println(scan.nextLine());
                }
                Thread.sleep(100);
                System.out.print("\033[H\033[2J"); 
                System.out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * Stop the system/end the game
     */
    public void quit() {
        /*The driver already does your job,
         but you're welcome to be here.*/
        System.out.println("Until next time, brave hero.");
    }
}
