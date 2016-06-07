package data;

public class master {
    public Integer ID, Stage;
    public String Name;

    public master(Integer id, String name, Integer stage){
        ID = id;
        Name = name;
        Stage = stage;
    }
    public master(String name, Integer stage){
        Name = name;
        Stage = stage;
    }

    // getters and setters
    //ID
    public Integer getID(){
        return ID;
    }
    public void setID(Integer id){
        ID = id;
    }
    //Name
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }
    //Stage
    public Integer getStage(){
        return Stage;
    }
    public void setStage(Integer stage) {
        Stage = stage;
    }
}
