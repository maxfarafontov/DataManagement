package data;

public class user {
    public Integer ID;
    public String FirstName, LastName,  Email;
    public Integer Age, PNubmer, PSeries;

    //initial object
    public user(Integer id, String firstName, String lastName, String email, Integer age, Integer pSeries, Integer pNumber) {
        ID = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Age = age;
        PSeries = pSeries;
        PNubmer = pNumber;
    }
    public user(String firstName, String lastName, String email, Integer age, Integer pSeries, Integer pNumber) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Age = age;
        PSeries = pSeries;
        PNubmer = pNumber;
    }

    // getters and setters
    //ID
    public Integer getID() {
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
    public void setLastName(String lastName) {
        LastName = lastName;
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
    public void setPSeries(Integer pSeries) {
        PSeries = pSeries;
    }
    //Passport Number
    public Integer getPNumber() {
        return PNubmer;
    }
    public void setPNubmer(Integer pNumber) {
        PNubmer = pNumber;
    }

    @Override
    public String toString() {
        return "(" + "'" + FirstName + "','" + LastName + "','" + Age + "','" + Email + "','" + PSeries + "','" + PNubmer + "')";
    }
}
