package Catalog.model;

public class PFeatureValues {
    public int Id;
    public int PFeatureId;
    public String Value;
    public int Language;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPFeatureId() {
        return PFeatureId;
    }

    public void setPFeatureId(int PFeatureId) {
        this.PFeatureId = PFeatureId;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public int getLanguage() {
        return Language;
    }

    public void setLanguage(int language) {
        Language = language;
    }
}
