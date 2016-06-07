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
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    //Email
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

    //Passport Series
    public Integer getpassSeries() {
        return passSeries;
    }
    public void setpassSeries(Integer passSeries) {
        this.passSeries = passSeries;
    }

    //Passport Number
    public Integer getpassNumb() {
        return passNumb;
    }
    public void setpassNumb(Integer passNumb) {
        this.passNumb = passNumb;
    }

    @Override
    public String toString() {
        return "(" + "'" + FirstName + "','" + LastName + "','" + Age + "','" + Email + "','" + PSeries + "','" + PNubmer + "')";
    }
}
