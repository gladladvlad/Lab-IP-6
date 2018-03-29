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

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
   User Register(String username, String password, String name){
       User userNew = new User(username, password, name, this);
       return userNew;
   }
    
   boolean Login(String username, String password)
   {
       Iterator<User> iterator = users.iterator();
       int index = i;
       while(iterator.hasNext())
       {
           User currentUser = iterator.next;
           if (currentUser.username == username && currentUser.password == password )
               return true;
       }      
       return false;
   }
    
}