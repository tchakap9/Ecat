package Catalog.dao;
/*recuperer la liste des reférences produit et faire une fonction qui recherche un produit en fonction des reférences*/

import Catalog.model.Categories;
import Catalog.model.ProductDescriptions;
import Catalog.model.Products;
import java.sql.*;


public class ReferenceDao {
    public String url;

    public ReferenceDao(String url) {
        this.url = url;
    }

    public ProductDescriptions getProductDescriptionsbyId (int Reference) {
        try {
            Connection con = DriverManager.getConnection(url);
            PreparedStatement statement = con.prepareStatement
                    ("select * from ProductDescriptions  left join  Products on Products.id  = ProductDescriptions.ProductId where Products.Reference =" + Reference);

            ResultSet resultSet = statement.executeQuery();
            /*System.out.println(Reference);*/
            ProductDescriptions ProductDescriptions = new ProductDescriptions();

            while (resultSet.next()) {
                ProductDescriptions.setId(resultSet.getInt("Id"));
                ProductDescriptions.setProductId(resultSet.getInt("ProductId"));
                ProductDescriptions.setValue(resultSet.getString("Value"));
            }
            return ProductDescriptions;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
