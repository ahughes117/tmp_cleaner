package tmp_cleaner;

import gui.MainFrame;
import util.IO;

/**
 * Instantiates the application
 *
 * @author alexhughes
 */
public class Main {

    public static boolean VERBOSE = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //setting the verbosity
        if (args.length == 1 && args[0].equals("verbose")) {
            VERBOSE = true;
        }

        //settings the look n' feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        new MainFrame(IO.loadCredentials("settings.dat"));
    }
}
