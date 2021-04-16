import Catalog.dao.CategoriesDao;
import Catalog.model.Categories;

import java.text.SimpleDateFormat;

public class MainApp {

    public static void main(String[] args){
        System.out.println("Starting");
        String url ="jdbc:sqlite:src/ecat.db";
        CategoriesDao categoriesDao = new CategoriesDao(url);
        java.util.Scanner entree =new java.util.Scanner (System.in);
        System.out.println("================================");
        System.out.println("Bienvenue Dans Notre Application");
        System.out.println("================================");
        System.out.println("Entrez Le nom de la Catégories de votre choix");
        String nom = entree.nextLine();
        System.out.println(nom);
        Categories categories = categoriesDao.getCategoriesbyId(nom);
        System.out.println(categories.Image);
    }
}
