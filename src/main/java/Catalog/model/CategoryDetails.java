package Catalog.model;

public class CategoryDetails {
    public int Id;
    public int CategoryId;
    public String Value;
    public int Language ;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getValue() {
        return Value;
    }
    public void setValue(String Value){
        this.Value = Value;
    }

    public int getLanguage() {
        return Language;
    }
    public void setLanguage(int Language){
        this.Language = Language;
    }
}
