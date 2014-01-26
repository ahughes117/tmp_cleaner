package util;

import gui.GUI;
import javax.swing.JOptionPane;

/**
 * The Message Dialog Class that contains all the message dialogues
 *
 * @author alexhughes
 */
public class MesDial {

    private static String fileDeletionSuccess = "Files deleted successfully.";
    private static String dateFormatError = "Please enter a valid date format (31/1/2013)";
    private static String directoryError = "Please select a valid directory";
    private static String loadSettingsError = "Error while loading settings";
    private static String notImplementedError = "This feature is not implemented yet. Sorry :-(";

    public static void fileDeletionSuccess(GUI aFrame) {
        JOptionPane.showMessageDialog(aFrame, fileDeletionSuccess, "Error!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void dateFormatError(GUI aFrame) {
        JOptionPane.showMessageDialog(aFrame, dateFormatError, "Error!", JOptionPane.ERROR_MESSAGE);
    }

    public static void directoryError(GUI aFrame) {
        JOptionPane.showMessageDialog(aFrame, directoryError, "Error!", JOptionPane.ERROR_MESSAGE);
    }

    public static void loadSettingsError(GUI aFrame) {
        JOptionPane.showMessageDialog(aFrame, loadSettingsError, "Error!", JOptionPane.ERROR_MESSAGE);
    }

    public static void notImplementedError(GUI aFrame) {
        JOptionPane.showMessageDialog(aFrame, notImplementedError, "Error!", JOptionPane.ERROR_MESSAGE);
    }
}
