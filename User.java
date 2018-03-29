/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C4theWin
 */
public class User {
    Client client;
    String password;
    String username;
    String nume;
    
    List<User> contacts;
    List<Email> emailsOut;
    List<Email> emailsIn;
    List<Email> inbox;
    
    User (String newUsername, String newPassword, String newNume, Client newClient) {
        this.client = newClient;
        this.password = newPassword;
        this.username = newUsername;
        this.nume = newNume;
   
        contacts = new ArrayList<>();
        emailsOut = new ArrayList<>();
        emailsIn = new ArrayList<>();
        contacts = new ArrayList<>();
    }
    
    void addContact (User newContact) {
        this.contacts.add(newContact);
    }
    
    void createEmail (String from, String to, String content) {
        Email newEmail = this.client.createEmail(from, to, content));
        this.emailsOut.add(newEmail);
    }
    
    void addEmail (Email newEmail) {
        this.inbox.add(newEmail);
    }
    
    boolean send (Email email) {
    }
}