/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emc;
import java.util.*;
/**
 *
 * @author rbaisan
 */
public class Client {
    private ArrayList<User> users;

    public Client(){
        this.users = new ArrayList<User>();
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
   boolean Register(String username, String password, String name){
       //User userNew = new User(username, password, name, this);
       
       String newUsername = username;
       
       Iterator<User> iterator = users.iterator();
       while(iterator.hasNext())
       {
           User currentUser = iterator.next();
           if (currentUser.username.equals(username))
               return false;
       }
       
       this.users.add(new User(username, password, name, this));
       return true;
   }
    
   boolean Login(String username, String password)
   {
       Iterator<User> iterator = users.iterator();
       while(iterator.hasNext())
       {
           User currentUser = iterator.next();
           if (currentUser.username.equals(username) && currentUser.password.equals(password) )
               return true;
       }      
       return false;
   }
       
   boolean Send(Email email){
       String username = email.getFrom();
       
       Iterator<User> iterator = users.iterator();
       while(iterator.hasNext())
       {
           User currentUser = iterator.next();
           if (currentUser.username.equals(username))
               
               currentUser.addEmail(email);
               return true;
       }      
       return false;
   }
}