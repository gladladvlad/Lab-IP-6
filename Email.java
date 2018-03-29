/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emc;

/**
 *
 * @author rbaisan
 */
public class Email {
    private String subject;
    private String to;
    private String from;
    private String content;
    
    public Email(String subject, String to, String from, String content){
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
