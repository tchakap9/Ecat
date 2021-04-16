package Catalog.model;

public class FeatureDescriptions {
    public int Id;
    public int FeatureId;
    public String Value;
    public int Language;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getFeatureId() {
        return FeatureId;
    }

    public void setFeatureId(int featureId) {
        FeatureId = featureId;
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
