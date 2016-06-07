package data;

public class car {
    public Integer ID, MasterID, UserID;
    public String Model, Color;

    //initial object
    public car(Integer id, String model, String color, Integer userID, Integer masterID){
        ID = id;
        Model = model;
        Color = color;
        UserID = userID;
        MasterID = masterID;
    }
    public car(String model, String color, Integer userID, Integer masterID) {
        Model = model;
        Color = color;
        UserID = userID;
        MasterID = masterID;
    }


    // getters and setters
    //id
    public Integer getID(){
        return ID;
    }
    public void setID( Integer id){
        ID = id;
    }

    //model
    public String getModel(){
        return Model;
    }
    public void setModel(String model){
        Model = model;
    }

    //color
    public String getColor(){
        return Color;
    }
    public void setColor(String color){
        Color = color;
    }

    //userID
    public Integer getUserID() {
        return UserID;
    }
    public void setUserID(Integer userID){
        UserID = userID;
    }

    //masterID
    public Integer getMasterID(){
        return MasterID;
    }
    public void setMasterID(Integer masterID){
        MasterID = masterID;
    }
}
