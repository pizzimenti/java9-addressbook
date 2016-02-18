import java.util.ArrayList;

public class Contact {
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private String mContext;
  private static ArrayList<Contact> contactList = new ArrayList<Contact>();


  public Contact (String firstName, String lastName) {
    mFirstName = firstName;
    contactList.add(this);
    mLastName = lastName;
  }

  public String fullName() {
    return mFirstName + " " + mLastName;
  }

  public static ArrayList<Contact> all() {
    return contactList;
  }

  public void setBirthMonth(String month) {
    mBirthMonth = month;
  }

  public String getBirthMonth() {
    return mBirthMonth;
  }

  public void setContext(String context) {
    mContext = context;
  }

  public String getContext() {
    return mContext;
  }

} //end of Contact Class
