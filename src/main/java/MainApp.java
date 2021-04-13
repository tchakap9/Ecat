import Catalog.dao.CategoriesDao;
import Catalog.model.Categories;

public class MainApp {
    public static void main(String[] args){
        System.out.println("Starting");
        String url ="jdbc:sqlite:src/ecat.db";
        CategoriesDao categoriesDao = new CategoriesDao(url);

        Categories categories = categoriesDao.getCategoriesbyId(4936);
        System.out.println("Done");
    }
}
