package Catalog.model;

import com.mysql.cj.result.StringValueFactory;

public class ProductDescriptions {
    public int Id;
    public int ProductId;
    public String Value;
    public int Language;
    public float Price;
    public String Reference;

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
    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
    public String getReference() {
        return Reference;
    }
    public void setReference(String Reference){
        this.Reference = Reference;
    }

    public void ToString(){
        System.out.println("Reference : " + Reference+ " nom du produit : " +Value+ " Prix en Euro : "+Price);
    }
}
