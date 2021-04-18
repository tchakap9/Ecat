import Catalog.dao.CategoriesDao;
import Catalog.dao.ReferenceDao;
import Catalog.model.Categories;
import Catalog.model.ProductDescriptions;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class MainApp {

    public static void main(String[] args){
        System.out.println("Starting");
        String url ="jdbc:sqlite:src/ecat.db";
        CategoriesDao categoriesDao = new CategoriesDao(url);
        ReferenceDao ReferenceDao = new ReferenceDao(url);
        java.util.Scanner entree = new java.util.Scanner (System.in);

        //
        Map<Integer, String> mapAllCategories = categoriesDao.findAllCategorieName();
        Map<Integer, String> mapAAfficher = new HashMap<>();
        Map<Integer, Integer> mapIdCategorie = new HashMap<>();
        int i = 0;
        for ( Map.Entry<Integer, String> entry : mapAllCategories.entrySet() ) {
            mapAAfficher.put(i, entry.getValue());
            mapIdCategorie.put(i, entry.getKey());
            i++;
        }
        //
        System.out.println("================================");
        System.out.println("Bienvenue Dans Notre Application");
        System.out.println("================================");
        System.out.println(mapAAfficher);
        System.out.println("Choisissez une catégorie : ");
        int categorieChoisie = entree.nextInt();
        System.out.println(categoriesDao.findAllSousCategoriesByCategoryId(mapIdCategorie.get(categorieChoisie)));
        System.out.println("Entrez Le nom de la Catégories de votre choix :");
        String nom = entree.nextLine();
        System.out.println("Entrez La reférence du produit :");
        int Reference = entree.nextInt();
        /*System.out.println(nom);
        System.out.println(Reference);*/
        Categories categories = categoriesDao.getCategoriesbyId(nom);
        System.out.println(categories.Image);
        ProductDescriptions ProductDescriptions = ReferenceDao.getProductDescriptionsbyId(Reference);
        System.out.println("Le numéro de Référence correspond au produit : " + ProductDescriptions.Value);
    }
}
