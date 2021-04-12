package Catalog.dao;

import Catalog.model.Categories;

import java.sql.*;
import java.util.Date;

public class CategoriesDao {

    public String url;

    public  CategoriesDao(String url){
        this.url = url;
    }
    public Categories getCategoriesbyId(int id) {
        try {
            Connection con = DriverManager.getConnection(url);
            PreparedStatement statement = con.prepareStatement
                    ("select * from Categories where id = ?");
            ResultSet resultSet = statement.executeQuery();
            Categories categories = new Categories();
            while (resultSet.next()){
              /*  categories.setId(resultSet.getInt("Id"));
                categories.setParentId(resultSet.getInt("ParentId"));
                categories.setLevel(resultSet.getInt("Level")*/
            }
            return categories;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
