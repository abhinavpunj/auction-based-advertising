/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkRequest;

import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Abhinav
 */
public abstract class WorkRequest 
{
    private String comments;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String requestDate;
    private String resolveDate;
    
    public WorkRequest()
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        requestDate = dateFormat.format(date);
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(String resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString()
    {
        return status;
    }
}
