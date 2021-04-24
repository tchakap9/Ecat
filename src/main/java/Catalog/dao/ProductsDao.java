package Catalog.dao;
/*recuperer la liste des reférences produit et faire une fonction qui recherche un produit en fonction des reférences*/

import Catalog.model.Categories;
import Catalog.model.ProductDescriptions;
import Catalog.model.Products;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProductsDao {
    public String url;

    public ProductsDao(String url) {
        this.url = url;
    }

    public ArrayList<ProductDescriptions> getProductDescriptionsbyCategoryId (int categorieChoisie) {
        try {
            Connection con = DriverManager.getConnection(url);
            PreparedStatement statement = con.prepareStatement
                    ("SELECT Products.Id,\n" +
                                    "   Products.Reference,ProductDescriptions.Value,Products.Price\n" +
                                    "FROM Categories\n" +
                                    "INNER JOIN Products\n" +
                                    "   ON Categories.Id =  Products.CategoryId\n" +
                                    "INNER JOIN ProductDescriptions\n" +
                                    "   ON ProductDescriptions.ProductId = Products.Id where CategoryId = "+categorieChoisie);
            ResultSet resultSet = statement.executeQuery();
            /*System.out.println(Reference);*/
            ArrayList<ProductDescriptions>  liste= new ArrayList<ProductDescriptions>();

            while (resultSet.next()) {
                ProductDescriptions ProductDescriptions = new ProductDescriptions();


                ProductDescriptions.setReference(resultSet.getString("Reference"));
                ProductDescriptions.setValue(resultSet.getString("Value"));
                ProductDescriptions.setPrice(resultSet.getFloat("Price"));
                liste.add(ProductDescriptions);

            }
            return liste;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<ProductDescriptions> getProductDescriptionsbyId (String Reference) {
        try {
            Connection con = DriverManager.getConnection(url);
            PreparedStatement statement = con.prepareStatement
                    ("select * from ProductDescriptions  left join  Products on Products.id  = ProductDescriptions.ProductId where Products.Reference like '"+ Reference+ "%'");

            ResultSet resultSet = statement.executeQuery();
            /*System.out.println(Reference);*/
            ArrayList<ProductDescriptions>  liste= new ArrayList<ProductDescriptions>();

            while (resultSet.next()) {
                ProductDescriptions ProductDescriptions = new ProductDescriptions();

                ProductDescriptions.setProductId(resultSet.getInt("ProductId"));
                ProductDescriptions.setReference(resultSet.getString("Reference"));
                ProductDescriptions.setValue(resultSet.getString("Value"));
                ProductDescriptions.setPrice(resultSet.getFloat("Price"));
                liste.add(ProductDescriptions);

            }
            return liste;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
