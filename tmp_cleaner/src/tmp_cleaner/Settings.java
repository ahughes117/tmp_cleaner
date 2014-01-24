package tmp_cleaner;

import java.io.Serializable;
import java.util.Date;

/**
 * The Settings Entity Class. Responsible for saving and loading the settings
 *
 * @author alexhughes
 */
public class Settings implements Serializable {

    private Date date;
    private String location;
    private boolean dir;

    public Settings(Date aDate, String aLocation, boolean aDirEnabled) {
        date = aDate;
        location = aLocation;
        dir = aDirEnabled;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public boolean isDir() {
        return dir;
    }
}
