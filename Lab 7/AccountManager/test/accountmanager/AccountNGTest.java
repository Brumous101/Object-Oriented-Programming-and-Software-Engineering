//Name: Kyle Johnson
//Class: ETEC2104
//Section: 02
//Assignment 7
package accountmanager;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class AccountNGTest
{
    //Verify first user was added
    @Test
    public void testVerifyUser1() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Bob@bob.com", "Bobword");
        assertEquals(true, result);
    }
    //Verify middle user was added
    @Test
    public void testVerifyUser2() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Suzy@suzy.com", "Suzyword");
        assertEquals(true, result);
    }
    //Verify end user was added
    @Test
    public void testVerifyUser3() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Kyle@kyle.com", "Kyleword");
        assertEquals(true, result);
    }
    //First users correct email, with a middle users password
    @Test
    public void testVerifyUser4() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Bob@bob.com", "Suzyword");
        assertEquals(false, result);//Correct user, incorrect pw
    }
    //First users correct email, with a end users password
    @Test
    public void testVerifyUser5() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Bob@bob.com", "Kyleword");
        assertEquals(false, result);//Correct user, incorrect pw
    }
    //Middle users correct email, with a first users password
    @Test
    public void testVerifyUser6() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Suzy@suzy.com", "Bobword");
        assertEquals(false, result);//Correct user, incorrect pw
    }
    //Middle users correct email, with a end users password
    @Test
    public void testVerifyUser7() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Suzy@suzy.com", "Kyleword");
        assertEquals(false, result);//Correct user, incorrect pw
    }
    //End users correct email, with a first users password
    @Test
    public void testVerifyUser8() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Kyle@kyle.com", "Bobword");
        assertEquals(false, result);//Correct user, incorrect pw
    }
    //End users correct email, with a middle users password
    @Test
    public void testVerifyUser9() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Kyle@kyle.com", "Suzyword");
        assertEquals(false, result);//Correct user, incorrect pw
    }
    //first user no password
    @Test
    public void testVerifyUser10() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Bob@bob.com", "");
        assertEquals(false, result);//Correct user, incorrect pw
    }
    //Middle user no password
    @Test
    public void testVerifyUser11() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("Suzy@suzy.com", "");
        assertEquals(false, result);//Correct user, incorrect pw
    }
    //End user no password
    @Test
    public void testVerifyUser12() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "");
        boolean result = a.verifyUser("Kyle@kyle.com", "");
        assertEquals(false, result);//Correct user, incorrect pw
    }
    //First user has password but no email
    @Test
    public void testVerifyUser13() 
    {
        var a = new AccountManager();
        a.addUser("", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("", "Bobword");
        assertEquals(false, result);
    }
    //Middle user has password but no email
    @Test
    public void testVerifyUser14() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("", "Suzyword");
        assertEquals(false, result);
    }
    //End user has password but no email
    @Test
    public void testVerifyUser15() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("", "Kyleword");
        boolean result = a.verifyUser("", "Kyleword");
        assertEquals(false, result);
    }
    
    //First user has neither a username or password
    @Test
    public void testVerifyUser16() 
    {
        var a = new AccountManager();
        a.addUser("", "");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("", "");
        assertEquals(false, result);
    }
    //Middle user has neither a username or password
    @Test
    public void testVerifyUser17() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("", "");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.verifyUser("", "");
        assertEquals(false, result);
    }
    //End user has neither a username or password
    @Test
    public void testVerifyUser18() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("", "");
        boolean result = a.verifyUser("", "");
        assertEquals(false, result);
    }
    
//------------------------------------------------------------------------------    
    
    //Adding a user
    @Test
    public void testForAddUser1() 
    {
        var a = new AccountManager();
        boolean result = a.addUser("Bob@bob.com", "Bobword");
        assertEquals(true, result);
    }
    //Adding a duplicate user with same email and same password
    @Test
    public void testForAddUser2() 
    {
        var a = new AccountManager();
        boolean result = a.addUser("Bob@bob.com", "Bobword");
        assertEquals(true, result);
        boolean result2 = a.addUser("Bob@bob.com", "Bobword");
        assertEquals(false, result2);
    }
    //Adding a user with different email and same password
    @Test
    public void testForAddUser3() 
    {
        var a = new AccountManager();
        boolean result = a.addUser("Bob@bob.com", "Bobword");
        assertEquals(true, result);
        boolean result2 = a.addUser("Suzy@suzy.com", "Bobword");
        assertEquals(true, result2);
    }
    //No Email provided by first user
    @Test
    public void testForAddUser4() 
    {
        var a = new AccountManager();
        boolean result = a.addUser( "", "Bobword");
        a.addUser( "Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        assertEquals(false, result);
    }
    //No Email provided by Middle user
    @Test
    public void testForAddUser5() 
    {
        var a = new AccountManager();
        a.addUser( "Bob@bob.com", "Bobword");
        boolean result = a.addUser("", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        assertEquals(false, result);
    }
    //No Email provided by End user
    @Test
    public void testForAddUser6() 
    {
        var a = new AccountManager();
        a.addUser( "Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        boolean result = a.addUser("", "Bobword");
        assertEquals(false, result);
    }
    //No Password provided  by first user
    @Test
    public void testForAddUser7() 
    {
        var a = new AccountManager();
        boolean result = a.addUser( "Bob@bob.com", "");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        assertEquals(false, result);
    }
    //No Password provided by Middle user
    @Test
    public void testForAddUser8() 
    {
        var a = new AccountManager();
        a.addUser( "Bob@bob.com", "Bobword");
        boolean result = a.addUser("Suzy@suzy.com", "");
        a.addUser("Kyle@kyle.com", "Kyleword");
        assertEquals(false, result);
    }
    //No Password provided by end user
    @Test
    public void testForAddUser9() 
    {
        var a = new AccountManager();
        a.addUser( "Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        boolean result = a.addUser("Kyle@kyle.com", "");
        assertEquals(false, result);
    }
    //No Info provided by first user
    @Test
    public void testForAddUser10() 
    {
        var a = new AccountManager();
        boolean result = a.addUser("", "");
        assertEquals(false, result);
    }
    //No Info provided by middle user
    @Test
    public void testForAddUser11() 
    {
        var a = new AccountManager();
        a.addUser( "Bob@bob.com", "Bobword");
        boolean result = a.addUser("", "");
        a.addUser("Kyle@kyle.com", "Kyleword");
        assertEquals(false, result);
    }
    //No Info provided by end user
    @Test
    public void testForAddUser12() 
    {
        var a = new AccountManager();
        a.addUser( "Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        boolean result = a.addUser("", "");
        assertEquals(false, result);
    } 
    
//------------------------------------------------------------------------------    
    
    //Checking the uniqueness of IDs
    @Test
    public void testGetUserID1() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        int result1 = a.getUID("Bob@bob.com");
        int result2 = a.getUID("Suzy@suzy.com");
        int result3 = a.getUID("Kyle@kyle.com");
        assertNotEquals(result1, result2);
        assertNotEquals(result1, result3);
        assertNotEquals(result2, result3);
    }
    //Tests for a users without an ID
    @Test
    public void testGetUserID2() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        int result1 = a.getUID("Philip@philip.com");
        int result2 = a.getUID("Greg@greg.com");
        int result3 = a.getUID("Cj@cj.com");
        assertEquals(-1, result1);
        assertEquals(-1, result2);
        assertEquals(-1, result3);
    }
    //Makes sure a user gets skipped when account isnt created
    @Test
    public void testGetUserID3() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "");
        a.addUser("Kyle@kyle.com", "Kyleword");
        int result1 = a.getUID("Bob@bob.com");
        int result2 = a.getUID("Suzy@suzy.com");
        int result3 = a.getUID("Kyle@kyle.com");
        assertEquals(-1, result2);
        assertEquals(result3, (result1 + 1));
    }
    
//------------------------------------------------------------------------------    
    
    //Gets what email of first user is
    @Test
    public void testGetEmail1() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getEmail(0);
        assertEquals("Bob@bob.com", result);
    }
    //Gets what email of a middle user is
    @Test
    public void testGetEmail2() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getEmail(1);
        assertEquals("Suzy@suzy.com", result);
    }
    //Gets what email of an end user is
    @Test
    public void testGetEmail3() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getEmail(2);
        assertEquals("Kyle@kyle.com", result);
    }
    //Gets email of a first entry following a signup error on middle user
    @Test
    public void testGetEmail4() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getEmail(0);
        assertEquals("Bob@bob.com", result);
    }
    //Gets email of a first entry following a signup error on end user
    @Test
    public void testGetEmail5() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("", "Kyleword");
        String result = a.getEmail(0);
        assertEquals("Bob@bob.com", result);
    }
    //Gets email of a middle entry following a signup error on first user
    @Test
    public void testGetEmail6() 
    {
        var a = new AccountManager();
        a.addUser("", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getEmail(0);
        assertEquals("Suzy@suzy.com", result);
    }
    //Gets email of a end entry following a signup error on middle user
    @Test
    public void testGetEmail7() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getEmail(1);
        assertEquals("Kyle@kyle.com", result);
    }
    //invalid index going over entries
    @Test
    public void testGetEmail8() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getEmail(5);
        assertEquals(null, result);
    }
    //invalid index negative index
    @Test
    public void testGetEmail9() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getEmail(-5);
        assertEquals(null, result);
    }
    
//------------------------------------------------------------------------------
    
    //Defaults to not admin
    //Checking first entry 
    @Test
    public void testIsAdmin1() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.isAdmin(0);
        assertEquals(false, result);
    }
    //Checking middle entry 
    @Test
    public void testIsAdmin2() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.isAdmin(1);
        assertEquals(false, result);
    }
    //Checking end entry 
    @Test
    public void testIsAdmin3() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result = a.isAdmin(2);
        assertEquals(false, result);
    }
    //Changing first entry and checking admin status
    @Test
    public void testIsAdmin4() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result1 = a.isAdmin(0);
        assertEquals(false, result1);
        boolean result2 = a.setAdmin(0, true);
        assertEquals(true, result2);
        boolean result3 = a.isAdmin(0);
        assertEquals(true, result3);
    }
    //Changing middle entry and checking admin status
    @Test
    public void testIsAdmin5() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result1 = a.isAdmin(1);
        assertEquals(false, result1);
        boolean result2 = a.setAdmin(1, true);
        assertEquals(true, result2);
        boolean result3 = a.isAdmin(1);
        assertEquals(true, result3);
    }
    //Changing end entry and checking admin status
    @Test
    public void testIsAdmin6() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result1 = a.isAdmin(1);
        assertEquals(false, result1);
        boolean result2 = a.setAdmin(1, true);
        assertEquals(true, result2);
        boolean result3 = a.isAdmin(1);
        assertEquals(true, result3);
    }
    
//------------------------------------------------------------------------------    
    
    //Changing first entry 
    @Test
    public void testSetAdmin1() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result1 = a.isAdmin(0);
        assertEquals(false, result1);
        boolean result2 = a.setAdmin(0, true);
        assertEquals(true, result2);
    }
    //Changing middle entry 
    @Test
    public void testSetAdmin2() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result1 = a.isAdmin(1);
        assertEquals(false, result1);
        boolean result2 = a.setAdmin(1, true);
        assertEquals(true, result2);
    }
    //Changing end entry 
    @Test
    public void testSetAdmin3() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result1 = a.isAdmin(2);
        assertEquals(false, result1);
        boolean result2 = a.setAdmin(2, true);
        assertEquals(true, result2);
    }
    //Changing non existent positive entry (erro catching)
    @Test
    public void testSetAdmin4() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result1 = a.setAdmin(5, true);
        assertEquals(false, result1);
    }
    //Changing non existent negative entry (error catching)
    @Test
    public void testSetAdmin5() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        boolean result1 = a.setAdmin(-5, true);
        assertEquals(false, result1);
    }
    
//------------------------------------------------------------------------------
    //Checking first entry avatar without setting it
    @Test
    public void testGetAvatar1() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(0);
        assertEquals(null, result1);
    }
    //Checking middle entry avatar without setting it
    @Test
    public void testGetAvatar2() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(1);
        assertEquals(null, result1);
    }
    //Checking end entry avatar without setting it
    @Test
    public void testGetAvatar3() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(2);
        assertEquals(null, result1);
    }
    //Changing first entry avatar 
    @Test
    public void testGetAvatar4() 
    {
        var a = new AccountManager();
        byte[] j = new byte[]{1,2,3,4};
        
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(0);
        assertEquals(null, result1);
        
        boolean result2 = a.setAvatar( 0, j);
        assertEquals(true, result2);
        
        byte[] result3 = a.getAvatar(0);
        assertEquals(j, result3);
    }
    //Changing middle entry avatar 
    @Test
    public void testGetAvatar5() 
    {
        var a = new AccountManager();
        byte[] j = new byte[]{1,2,3,4};
        
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(1);
        assertEquals(null, result1);
        
        boolean result2 = a.setAvatar( 1, j);
        assertEquals(true, result2);
        
        byte[] result3 = a.getAvatar(1);
        assertEquals(j, result3);
    }
    //Changing last entry avatar 
    @Test
    public void testGetAvatar6() 
    {
        var a = new AccountManager();
        byte[] j = new byte[]{1,2,3,4};
        
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(2);
        assertEquals(null, result1);
        
        boolean result2 = a.setAvatar( 2, j);
        assertEquals(true, result2);
        
        byte[] result3 = a.getAvatar(2);
        assertEquals(j, result3);
    }
    
//------------------------------------------------------------------------------  
    
    //Changing the first entries avatar
    @Test
    public void testSetAvatar1() 
    {
        var a = new AccountManager();
        byte[] j = new byte[]{1,2,3,4};
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(0);
        assertEquals(null, result1);
        boolean result2 = a.setAvatar( 0, j );
        assertEquals(true, result2);
    }
    //Changing the middle entries avatar
    @Test
    public void testSetAvatar2() 
    {
        var a = new AccountManager();
        byte[] j = new byte[]{1,2,3,4};
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(1);
        assertEquals(null, result1);
        boolean result2 = a.setAvatar( 1, j );
        assertEquals(true, result2);
    }
    //Changing the end entries avatar
    @Test
    public void testSetAvatar3() 
    {
        var a = new AccountManager();
        byte[] j = new byte[]{1,2,3,4};
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(2);
        assertEquals(null, result1);
        boolean result2 = a.setAvatar( 2, j );
        assertEquals(true, result2);
    }
    //Changing an invalid index avatar (too high of an index)
    @Test
    public void testSetAvatar4() 
    {
        var a = new AccountManager();
        byte[] j = new byte[]{1,2,3,4};
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(5);
        assertEquals(null, result1);
        boolean result2 = a.setAvatar( 5, j);
        assertEquals(false, result2);
    }
    //Changing an invalid index avatar (negative index)
    @Test
    public void testSetAvatar5() 
    {
        var a = new AccountManager();
        byte[] j = new byte[]{1,2,3,4};
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        byte[] result1 = a.getAvatar(-5);
        assertEquals(null, result1);
        boolean result2 = a.setAvatar( -5, j);
        assertEquals(false, result2);
    }
    
//------------------------------------------------------------------------------
    
    //Optional
    //Checking to see if it will return correct password for first user
    @Test
    public void testGetPassword1() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getPassword(0);
        assertEquals("Bobword", result);
    }
    //Checking to see if it will return correct password for middle user
    @Test
    public void testGetPassword2() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getPassword(1);
        assertEquals("Suzyword", result);//checking middle account
    }
    //Checking to see if it will return correct password for end user
    @Test
    public void testGetPassword3() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getPassword(2);
        assertEquals("Kyleword", result);//checking last account
    }
    //Checking to make sure first user gets skipped
    @Test
    public void testGetPassword4() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "");
        a.addUser("Suzy@suzy.com", "Suzyword");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getPassword(0);
        assertEquals("Suzyword", result);
    }
    //Checking to make sure middle user gets skipped
    @Test
    public void testGetPassword5() 
    {
        var a = new AccountManager();
        a.addUser("Bob@bob.com", "Bobword");
        a.addUser("Suzy@suzy.com", "");
        a.addUser("Kyle@kyle.com", "Kyleword");
        String result = a.getPassword(1);
        assertEquals("Kyleword", result);
    }
}