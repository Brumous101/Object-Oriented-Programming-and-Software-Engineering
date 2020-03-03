//Name: Kyle Johnson
//Class: ETEC2104
//Section: 02
//Assignment 7
package accountmanager;

public class Account 
{
    protected String mEmail, mPassword;
    protected int mUserID;
    protected boolean mAdminFlag;
    protected byte[] mImg;
 
    protected Account( String userEmail, String userPassword, int passedUserID, boolean adminStatus, byte[] avatar)
    {
        this.mEmail = userEmail;
        this.mPassword = userPassword;
        this.mAdminFlag = adminStatus;
        this.mUserID = passedUserID;
        this.mImg = avatar;
    }
    protected Account(String userEmail, String userPassword, int passedUserID)
    {
        this.mPassword = userPassword;
        this.mEmail = userEmail;
        this.mAdminFlag = false;
        this.mUserID = passedUserID;
        this.mImg = null;
    }
}