package Catalog.model;

public class ProductDescriptions {
    public int Id;
    public int ProductId;
    public String Value;
    public int Language;

    public int getId() {
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }

    public int getProductId() {
        return ProductId;
    }
    public void setProductId(int ProductId){
        this.ProductId = ProductId;
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
