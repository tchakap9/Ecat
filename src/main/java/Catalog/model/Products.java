package Catalog.model;

import java.util.Date;

public class Products {
    public int Id;
    public String AEN;
    public int CategoryId;
    public String Reference;
    public int PriorityImage;
    public String BaseUnit;
    public String Brand;
    public int PackQuantity;
    public String MarketStatus;
    public int PriceQuantity;
    public String PriceCurrency;
    public float Price;
    public String PriceGroup;
    public String PriceUnit;
    public String ENumber;
    public int Order;
    public int FlagType;
    public Date FlagValidFrom;
    public Date FlagValidUntil;
    public boolean ZPL;
    public int Market;


    public int getId() {
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }

    public String getAEN() {
        return AEN;
    }

    public void setAEN(String AEN) {
        this.AEN = AEN;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    public int getPriorityImage() {
        return PriorityImage;
    }

    public void setPriorityImage(int priorityImage) {
        PriorityImage = priorityImage;
    }

    public String getBaseUnit() {
        return BaseUnit;
    }

    public void setBaseUnit(String baseUnit) {
        BaseUnit = baseUnit;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPackQuantity() {
        return PackQuantity;
    }

    public void setPackQuantity(int packQuantity) {
        PackQuantity = packQuantity;
    }

    public String getMarketStatus() {
        return MarketStatus;
    }

    public void setMarketStatus(String marketStatus) {
        MarketStatus = marketStatus;
    }

    public int getPriceQuantity() {
        return PriceQuantity;
    }

    public void setPriceQuantity(int priceQuantity) {
        PriceQuantity = priceQuantity;
    }

    public String getPriceCurrency() {
        return PriceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        PriceCurrency = priceCurrency;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getPriceGroup() {
        return PriceGroup;
    }

    public void setPriceGroup(String priceGroup) {
        PriceGroup = priceGroup;
    }

    public String getPriceUnit() {
        return PriceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        PriceUnit = priceUnit;
    }

    public String getENumber() {
        return ENumber;
    }

    public void setENumber(String ENumber) {
        this.ENumber = ENumber;
    }

    public int getOrder() {
        return Order;
    }

    public void setOrder(int order) {
        Order = order;
    }

    public int getFlagType() {
        return FlagType;
    }

    public void setFlagType(int flagType) {
        FlagType = flagType;
    }

    public Date getFlagValidFrom() {
        return FlagValidFrom;
    }

    public void setFlagValidFrom(Date flagValidFrom) {
        FlagValidFrom = flagValidFrom;
    }

    public Date getFlagValidUntil() {
        return FlagValidUntil;
    }

    public void setFlagValidUntil(Date flagValidUntil) {
        FlagValidUntil = flagValidUntil;
    }

    public boolean isZPL() {
        return ZPL;
    }

    public void setZPL(boolean ZPL) {
        this.ZPL = ZPL;
    }

    public int getMarket() {
        return Market;
    }

    public void setMarket(int market) {
        Market = market;
    }


}
