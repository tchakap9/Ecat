package Catalog.dao;

import Catalog.model.Categories;

import java.sql.*;
import java.util.*;

public class CategoriesDao {

    public String url;

    public  CategoriesDao(String url){
        this.url = url;
    }
    public Categories getCategoriesbyId(String name) {
        try {
            Connection con = DriverManager.getConnection(url);
            PreparedStatement statement = con.prepareStatement
                    ("select * from Categories as cat, CategoryNames as CN where cat.Id =CN.CategoryId AND CN.Value ='"+name+"'"
                    );
            ResultSet resultSet = statement.executeQuery();
            /*System.out.println(name);*/

            Categories categories = new Categories();

            while (resultSet.next()){
                categories.setId(resultSet.getInt("Id"));
                categories.setParentId(resultSet.getInt("ParentId"));
                categories.setLevel(resultSet.getInt("Level"));
                categories.setImage(resultSet.getString("Image"));
                /*String d = resultSet.getString( "FlagValidFrom");

                //Date dd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(d);
               // categories.setFlagValidFrom(dd);*/
            }
            return categories;
        } catch (SQLException /*| ParseException*/ e) {
            e.printStackTrace();
            return null;
        }

    }

    public Map<Integer, String> findAllCategorieName() {
        try {
            Connection con = DriverManager.getConnection(url);
            PreparedStatement statement = con.prepareStatement
                    ("SELECT cat.Id, catN.Value FROM Categories cat JOIN CategoryNames catN ON catN.CategoryId = cat.Id WHERE cat.ParentId is NULL"
                    );
            ResultSet resultSet = statement.executeQuery();

            Map<Integer, String> listeIdEtValue = new HashMap<>();

            while (resultSet.next()) {
                listeIdEtValue.put(resultSet.getInt("Id"), resultSet.getString("Value"));
            }

            // System.out.println(listeIdEtValue);
            return listeIdEtValue;
        } catch (SQLException exception) {

        }
        return null;
    }

    public Map<Integer, String> findAllSousCategoriesByCategoryId(Integer categoryId) {
        try {
            Connection con = DriverManager.getConnection(url);
            PreparedStatement statement = con.prepareStatement
                    ("SELECT cat.Id, catN.Value FROM Categories cat JOIN CategoryNames catN ON catN.CategoryId = cat.Id WHERE cat.ParentId = "+categoryId+""
                    );
            ResultSet resultSet = statement.executeQuery();

            Map<Integer, String> listeIdEtValue = new HashMap<>();

            while (resultSet.next()) {
                listeIdEtValue.put(resultSet.getInt("Id"), resultSet.getString("Value"));
            }

            // System.out.println(listeIdEtValue);
            return listeIdEtValue;
        } catch (SQLException /*| ParseException*/ e) {
            e.printStackTrace();
            return null;
        }

    }
}
