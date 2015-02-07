/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Logger;

import UserInterface.MainJFrame;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class Logging 
{
    public static final String INFO = "INFO";
    private static ArrayList<Log> logger;
    private static MainJFrame frame;

    public Logging(MainJFrame frame) 
    {
        logger = new ArrayList<>();
        Logging.frame = frame;
    }
    
    public static Logging getLoggerInstance()
    {
        return frame.logging;
    }

    public void logMessage(String message, String type)
    {
        Log log = new Log();
        log.setMessage(message);
        log.setType(type);
        logger.add(log);
        frame.populateLoggingTable();
    }

    public ArrayList<Log> getLogger() {
        return logger;
    }

}
