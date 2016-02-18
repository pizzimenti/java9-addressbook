import java.util.ArrayList;

public class Contact {
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private static ArrayList<Contact> contactList = new ArrayList<Contact>();


  public Contact (String firstName, String lastName) {
    mFirstName = firstName;
    contactList.add(this);
    mLastName = lastName;
  }

  public String fullName() {
    return mFirstName + " " + mLastName;
  }

  public void setBirthMonth(String month) {
    mBirthMonth = month;
  }

  public String getBirthMonth() {
    return mBirthMonth;
  }

  public static ArrayList<Contact> all() {
    return contactList;
  }

} //end of Contact Class
