package Catalog.model;

public class CategoryLogoImage {
    public int Id;
    public int CategoryId;
    public int Language ;
    public String Type;
    public String Name;
    public String Style;
    public Double Size;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getType() {
        return Type;
    }
    public void setType(String Type){
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public String getStyle() {
        return Style;
    }
    public void setStyle(String Style){
        this.Style = Style;
    }

    public int getLanguage() {
        return Language;
    }
    public void setLanguage(int Language){
        this.Language = Language;
    }

    public Double getSize() {
        return Size;
    }
    public void setSize(Double Size){
        this.Size = Size;
    }
}
