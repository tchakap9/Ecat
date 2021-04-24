package Catalog.model;

public class PFeatures {
    public int Id;
    public int ProductId;
    public int FeatureId;
    public int DataType;
    public boolean DisplayWeb;
    public boolean DisplayTT;
    public boolean Filterable;
    public boolean OnlyValue;
    public int Market;

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

    public int getFeatureId() {
        return FeatureId;
    }
    public void setFeatureId(int FeatureId){
        this.FeatureId = FeatureId;
    }

    public int getDataType() {
        return DataType;
    }
    public void setDataType(int DataType){
        this.DataType = DataType;
    }

    public boolean isDisplayWeb() {
        return DisplayWeb;
    }
    public void setDisplayWeb(boolean DisplayWeb){
        this.DisplayWeb = DisplayWeb;
    }

    public boolean isDisplayTT() {
        return DisplayTT;
    }

    public void setDisplayTT(boolean displayTT) {
        DisplayTT = displayTT;
    }

    public boolean isFilterable() {
        return Filterable;
    }

    public void setFilterable(boolean filterable) {
        Filterable = filterable;
    }

    public boolean isOnlyValue() {
        return OnlyValue;
    }

    public void setOnlyValue(boolean onlyValue) {
        OnlyValue = onlyValue;
    }

    public int getMarket() {
        return Market;
    }

    public void setMarket(int market) {
        Market = market;
    }
}
