package util;

import tmp_cleaner.Settings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import tmp_cleaner.Main;

/**
 * The IO class, responsible for loading and saving the settings
 *
 * @author alexhughes
 */
public class IO {

    public static void saveCredentials(Settings aSettings, String aFilename) {
        try {
            FileOutputStream fileOut = null;
            if (aSettings instanceof Settings) {
                fileOut = new FileOutputStream(aFilename);
            }

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(aSettings);
            out.close();
            fileOut.close();

            if (Main.VERBOSE) {
                System.out.println("Settings Saved");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Settings loadCredentials(String aFile) {
        Settings settings = null;

        try {
            FileInputStream fileIn = new FileInputStream(aFile);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Object obj = in.readObject();

            if (obj instanceof Settings) {
                settings = (Settings) obj;
            }

            in.close();
            fileIn.close();

            if (Main.VERBOSE) {
                System.out.println("Settings Loaded");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("*** Credentials not found ***");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("*** Error while loading credentials ***");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("*** Credentials' file probably corrupted ***");
        }
        return settings;
    }
}
