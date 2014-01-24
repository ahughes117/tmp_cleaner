package tmp_cleaner;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/**
 * The Cleaner Class, containing all cleaning functionality
 *
 * @author alexhughes
 */
public class Cleaner {

    private Settings settings;

    public Cleaner(Settings aSettings) {
        settings = aSettings;
    }

    /**
     * Cleans the files according to the settings
     *
     * @return
     */
    public String clean() {
        //logging util
        String log = null;
        StringBuilder sb = new StringBuilder();

        //preparing the cleaner
        File[] files = gather();

        //performing the cleaning
        for (int i = 0; i < files.length; i++) {
            if (files[i].delete()) {
                sb = sb.append("Deleted: ").append(files[i].getName());
            } else {
                sb = sb.append("FAILED to Delete: ").append(files[i].getName());
            }
        }

        log = sb.toString();
        return log;
    }

    /**
     * Performs the check and returns candidate files for deletion
     *
     * @return
     */
    public File[] gather() {
        File[] files = null;
        File dir = new File(settings.getLocation());
        File[] tmpFiles = dir.listFiles();
        Date cleanDate = settings.getDate();

        //the "buffer ArrayList
        ArrayList<File> fileL = new ArrayList();

        //performing the check
        for (int i = 0; i < tmpFiles.length; i++) {
            if (tmpFiles[i].lastModified() < cleanDate.getTime()) {
                fileL.add(tmpFiles[i]);
            }
        }

        //dumping the "buffer" to an array again
        for (int i = 0; i < fileL.size(); i++) {
            files[i] = fileL.get(i);
        }

        return files;
    }
}
