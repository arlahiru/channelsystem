package lk.ac.ucsc.webArc.assgnment.user.api.beans;


/**
 * This is the service api which used to set and get the user related information
 *
 * User: Hetti

 * Time: 12:19 PM
 */
public interface User {


    UserLoginProfile getLoginProfile();

    void setLoginProfile(UserLoginProfile loginProfile);

    String getUserNumber();

    void setUserNumber(String userNumber);

    long getUserId();

    void setUserId(long userId);

    String getTitle();

    void setTitle(String title);

    String getFirstName();

    void setFirstName(String firstName);

    String getGender();

    void setGender(String gender);

    String getOfficeTele();

    void setOfficeTele(String officeTele);

    String getMobile();

    void setMobile(String mobile);

    String getEmail();

    void setEmail(String email);

    String getLastName();

    void setLastName(String lastName);

    String getIdCardNumber();

    void setIdCardNumber(String idCardNumber);

    String getAddress();

    void setAddress(String address);


    int getUserType();

    void setUserType(int userType);
}
