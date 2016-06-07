package data;

public class user {
    public Integer ID;
    public String FirstName, LastName,  Email;
    public Integer Age, PNubmer, PSeries;


    public user(Integer id, String firstname, String lastname, String email, Integer age, Integer pseries, Integer pnumber) {
        ID = id;
        FirstName = firstname;
        LastName = lastname;
        Email = email;
        Age = age;
        PSeries = pseries;
        PNubmer = pnumber;
    }

    public user(String firstname, String lastname, String email, Integer age, Integer pseries, Integer pnumber) {
        FirstName = firstname;
        LastName = lastname;
        Email = email;
        Age = age;
        PSeries = pseries;
        PNubmer = pnumber;
    }


    //ID
    public Integer getId() {
        return ID;
    }
    public void setId(Integer id) {
        ID = id;
    }

    //First Name
    public String getFirstName() {
        return FirstName;
    }
    public void setName(String firstName) {
        FirstName = firstName;
    }

    //Last Name
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastname) {
        LastName = lastname;
    }

    //Age
    public Integer getAge() {
        return Age;
    }
    public void setAge(Integer age) {
        Age = age;
    }

    //Email
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

    //Passport Series
    public Integer getPSeries() {
        return PSeries;
    }
    public void setPSeries(Integer pseries) {
        PSeries = pseries;
    }

    //Passport Number
    public Integer getPNumber() {
        return PNubmer;
    }
    public void setPNubmer(Integer pnumber) {
        PNubmer = pnumber;
    }

    @Override
    public String toString() {
        return "(" + "'" + FirstName + "','" + LastName + "','" + Age + "','" + Email + "','" + PSeries + "','" + PNubmer + "')";
    }
}
