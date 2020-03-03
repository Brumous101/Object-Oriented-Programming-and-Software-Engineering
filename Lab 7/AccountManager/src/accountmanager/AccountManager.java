//Name: Kyle Johnson
//Class: ETEC2104
//Section: 02
//Assignment 7
package accountmanager;

import java.util.ArrayList;

public class AccountManager
{
    ArrayList <Account> users = new ArrayList<>();
    private int counter = 0;
    
    public boolean verifyUser( String username, String password)
    {
        for(int i = 0; i < users.size(); i++)
        {
            var a = users.get(i);
            if((getEmail(i).equals(username) && getPassword(i).equals(password)))
            {
                return true;
            }
        }
            return false;// Did not find the user in the database
    }
    
    public boolean addUser( String emailAddress, String password)
    {
        //Check to see if it is the first entry of the list
        if( (users.isEmpty()) && (emailAddress.isEmpty() || password.isEmpty() ) )
        {
            return false;
        }
        else
        {
            for(int i = 0; i < users.size(); i++)
            {
                var a = users.get(i);
                if( ( a.mEmail.equals(emailAddress) ) || //username already exists
                    ( emailAddress.isEmpty()        ) || //username is empty
                    ( password.isEmpty()            )  ) //no password
                {
                    return false;
                }
            }
            users.add(new Account(emailAddress, password, counter));
            counter++;
            return true;
        }
    }
    public int getUID( String username)
    {
        if( (users.isEmpty() ) )
        {
            return -1;
        }
        for(int i = 0; i < users.size(); i++)
        {
            var a = users.get(i);
            if(a.mEmail.equals(username))
            {
                return users.get(i).mUserID;
            }
        }
        return -1;
    }
    public String getEmail(int userID)
    {
        if( (users.isEmpty() ) )
        {
            return null;
        }
        
        for(int i = 0; i < users.size(); i++)
        {
            var a = users.get(i);
            
            if(a.mUserID == (userID))
            {
                return users.get(userID).mEmail;
            }
        }
        return null;
    }
    public boolean isAdmin( int userID )
    {
        if( (users.isEmpty() ) )
        {
            return false;
        }
        
        for(int i = 0; i < users.size(); i++)
        {
            var a = users.get(i);
            
            if( (a.mUserID == (userID)) && (a.mAdminFlag == true) )
            {
                return true;
            }
        }
        return false;
    }
    public boolean setAdmin( int userID, boolean isAdmin )
    {
        if( (users.isEmpty() ) )
        {
            return false;
        }
        
        for(int i = 0; i < users.size(); i++)
        {
            var a = users.get(i);
            
            if( (a.mUserID == (userID)) )
            {
                a.mAdminFlag = isAdmin;
                return true;
            }
        }
        return false;
    }
    public byte[] getAvatar(int userID )
    {
        if( (users.isEmpty() ) )
        {
            return null;
        }
        
        for(int i = 0; i < users.size(); i++)
        {
            var a = users.get(i);
            
            if( (a.mUserID == (userID)) )
            {
                return users.get(userID).mImg;
            }
        }
        return null;
    }
    public boolean setAvatar( int userID, byte[] img )
    {
        if( (users.isEmpty() ) )
        {
            return false;
        }
        
        for(int i = 0; i < users.size(); i++)
        {
            var a = users.get(i);
            
            if( (a.mUserID == (userID)) )
            {
                a.mImg = img;
                return true;
            }
        }
        return false;
    }     
    public String getPassword(int index)
    {
        return users.get(index).mPassword;
    }
}

