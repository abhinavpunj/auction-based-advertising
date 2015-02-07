/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Abhinav
 */
public class Log 
{
    private String message;
    private String type;
    private String logDate;

    public Log() 
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy");
        Date date = new Date();
        logDate = dateFormat.format(date);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogDate() {
        return logDate;
    }
    
}
