/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabig
 */
public class RegisterIT {
    
    public RegisterIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIfTheInputIsCorrect() {
       //arange
       Client client = new Client();
       User rez = new User("","","",client);
       User rez1;
       
       //act
       rez1 = client.Register("","","");
       //assert
       Assert.assertEquals(rez1, rez);
    }
    
    
    
    
    @Test
    public void testIfTheUserIsAlreadyRegistered() {
        //arange
       Client client = new Client();
       User rez = new User("Danel","1234","tataie",client);
       
       //act
       User rez1 = client.Register("Danel","1234","tataie");
       //assert
       Assert.assertEquals(rez1, rez);
    }
    
}
