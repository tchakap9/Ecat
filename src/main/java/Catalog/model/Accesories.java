package Catalog.model;

public class Accesories {
    public int Id;
    public int ProductId;
    public int ReferencedProductId;
    public int Type;
    public int Market;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getProductId() {
        return ProductId;
    }
    public void setProductId(int ProductId){
        this.ProductId = ProductId;
    }

    public int getReferencedProductId() {
        return ReferencedProductId;
    }

    public void setReferencedProductId(int referencedProductId) {
        ReferencedProductId = referencedProductId;
    }

    public int getType() {
        return Type;
    }
    public void setType(int Type){
        this.Type = Type;
    }

    public int getMarket() {
        return Market;
    }

    public void setMarket(int market) {
        Market = market;
    }
}
