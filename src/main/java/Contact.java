import java.util.ArrayList;

public class Contact {
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;

  public Contact (String firstName, String lastName) {
    mFirstName = firstName;
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

} //end of Contact Class
