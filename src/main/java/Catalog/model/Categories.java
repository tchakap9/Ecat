package Catalog.model;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Categories {
    public int Id;
    public int ParentId;
    public int Level;
    public int Brand;
    public String Image;
    public String Status;
    public String FlagType;
    public Date FlagValidFrom;
    public Date FlagValidUtil;
    public int Order;
    public double ImageSize;
    public int Market;

    public int getId() {
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }

    public int getParentId() {
        return ParentId;
    }

    public void setParentId(int parentId) {
        ParentId = parentId;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getBrand() {
        return Brand;
    }
    public void setBrand(int Brand){
        this.Brand = Brand;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getStatus() {
        return Status;
    }
    public void setStatus(String Status){
        this.Status = Status;
    }

    public String getFlagType() {
        return FlagType;
    }

    public void setFlagType(String flagType) {
        FlagType = flagType;
    }

    public Date getFlagValidFrom() {
        return FlagValidFrom;
    }

    public void setFlagValidFrom(Date flagValidFrom) {
        FlagValidFrom = flagValidFrom;
    }

    public Date getFlagValidUtil() {
        return FlagValidUtil;
    }

    public void setFlagValidUtil(Date flagValidUtil) {
        FlagValidUtil = flagValidUtil;
    }

    public int getOrder() {
        return Order;
    }
    public void setOrder(int Order){
        this.Order = Order;
    }

    public double getImageSize() {
        return ImageSize;
    }

    public void setImageSize(double imageSize) {
        ImageSize = imageSize;
    }

    public int getMarket() {
        return Market;
    }
    public void setMarket(int Market){
        this.Market = Market;
    }
}
