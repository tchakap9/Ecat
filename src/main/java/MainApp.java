import Catalog.dao.CategoriesDao;
import Catalog.dao.ProductsDao;
import Catalog.model.Categories;
import Catalog.model.ProductDescriptions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Starting");
        String url = "jdbc:sqlite:src/ecat.db";
        CategoriesDao categoriesDao = new CategoriesDao(url);
        ProductsDao ProductsDao = new ProductsDao(url);
        java.util.Scanner entree = new java.util.Scanner(System.in);
        java.util.Scanner entree2 = new java.util.Scanner(System.in);

        //
        Map<Integer, String> mapAllCategories = categoriesDao.findAllCategorieName();
        Map<Integer, String> mapAAfficher = new HashMap<>();
        Map<Integer, Integer> mapIdCategorie = new HashMap<>();
        Map<Integer, String> mapIdCategories = new HashMap<>();
        int i = 0;
        for (Map.Entry<Integer, String> entry : mapAllCategories.entrySet()) {
            mapAAfficher.put(i, entry.getValue());
            mapIdCategorie.put(i, entry.getKey());
            i++;
        }
        for (Map.Entry<Integer, String> entry : mapIdCategories.entrySet()) {
            mapIdCategories.put(i, entry.getValue());
            i++;
        }
        //
        System.out.println("================================");
        System.out.println("Bienvenue Dans Notre Application");
        System.out.println("================================");
        System.out.println("Pour Naviguer dans le catalogue taper 1 pour Utiliser le moteur de recherche taper 2 : ");
        int modenav = 0;
        modenav = entree.nextInt();
        if (modenav == 1) {
            System.out.println(mapAAfficher);
            System.out.println("Choisissez un chiffre de  catégorie : ");
            int categorieChoisie = 0;
            categorieChoisie = entree.nextInt();
            System.out.println(categoriesDao.findAllSousCategoriesByCategoryId(mapIdCategorie.get(categorieChoisie)));
            System.out.println("Choisissez le nombre correspondant à la sous catégorie : ");
            categorieChoisie = entree.nextInt();
            System.out.println(categoriesDao.findAllSousCategoriesByCategoryId(categorieChoisie));

            while (!categoriesDao.findAllSousCategoriesByCategoryId(categorieChoisie).isEmpty()) {
                System.out.println("Choisissez le nombre correspondant à la sous catégorie : ");
                categorieChoisie = entree.nextInt();
                System.out.println(categoriesDao.findAllSousCategoriesByCategoryId(categorieChoisie));

            }
            ArrayList<ProductDescriptions>  ProductDescriptions =  ProductsDao.getProductDescriptionsbyCategoryId(categorieChoisie);
            for (int k = 0 ; k < ProductDescriptions.size() ; k++ ){

                ProductDescriptions.get(k).ToString();
            }
        } else {
        /*Categories categories = categoriesDao.getCategoriesbyId(nom);
        System.out.println(categories);

        System.out.println("Vous avez enntré : " + nom);
        System.out.println(categories.Image);*/
            System.out.println("Entrez La reférence du produit :");
            String Reference = entree2.nextLine();
            System.out.println(Reference);
            ArrayList<ProductDescriptions>  ProductDescriptions =  ProductsDao.getProductDescriptionsbyId(Reference);
            for (int j = 0 ; j < ProductDescriptions.size() ; j++ ){

                ProductDescriptions.get(j).ToString();
            }
        }
    }
}
