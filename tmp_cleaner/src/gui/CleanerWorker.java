
package gui;

import javax.swing.SwingWorker;

/**
 * The SwingWorker Class of the application. In order to perform the lengthy cleaning
 * in a separate thread than the Event Despatch Thread (EDT) and avoid GUI freezing
 * 
 * @author alexhughes
 */
public class CleanerWorker extends SwingWorker {

    @Override
    protected Object doInBackground() throws Exception {
        return null;
    }
    
}
