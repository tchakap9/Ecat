/* On importe les Packages qui nous sont utiles*/
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
        String url = "jdbc:sqlite:src/ecat.db"; // Appel de l'instance  de connection à la BD
        CategoriesDao categoriesDao = new CategoriesDao(url);
        ProductsDao ProductsDao = new ProductsDao(url);
        java.util.Scanner entree = new java.util.Scanner(System.in);
        java.util.Scanner entree2 = new java.util.Scanner(System.in);

        // On appelle les dictionnaires et listes contenant les objets de la BD
        Map<Integer, String> mapAllCategories = categoriesDao.findAllCategorieName();
        Map<Integer, String> mapAAfficher = new HashMap<>();
        Map<Integer, Integer> mapIdCategorie = new HashMap<>();
        Map<Integer, String> mapIdCategories = new HashMap<>();
        int i = 0;
        for (Map.Entry<Integer, String> entry : mapAllCategories.entrySet()) {
            mapAAfficher.put(i, entry.getValue()); // Inserer la valeur du dictionnaire mapAAfficher
            mapIdCategorie.put(i, entry.getKey()); // Inserer la clé du dictionnaire mapIdCategorie
            i++;  // incrementer la position
        }
        for (Map.Entry<Integer, String> entry : mapIdCategories.entrySet()) {
            mapIdCategories.put(i, entry.getValue()); // Inserer la valeur du dictionnaire mapIdCategories
            i++;
        }
        //
        System.out.println("================================");
        System.out.println("Bienvenue Dans Notre Application");
        System.out.println("================================");
        System.out.println("Pour Naviguer dans le catalogue taper 1 pour Utiliser le moteur de recherche taper 2 : ");
        int modenav = 0; // initialisation du mode de navigation
        modenav = entree.nextInt(); // attente d'une entrée
        if (modenav == 1) {
            System.out.println(mapAAfficher);
            System.out.println("Choisissez un chiffre de  catégorie : ");
            int categorieChoisie = 0; // Initialisation de l'entrée choisie
            categorieChoisie = entree.nextInt();
            System.out.println(categoriesDao.findAllSousCategoriesByCategoryId(mapIdCategorie.get(categorieChoisie))); // Affichage des listes renvoyées par les méthodes de la classe Categorie DAO utiliosant la liste mapIdCategorie
            System.out.println("Choisissez le nombre correspondant à la sous catégorie : ");
            categorieChoisie = entree.nextInt();
            System.out.println(categoriesDao.findAllSousCategoriesByCategoryId(categorieChoisie));//Affichage des sous catégories de la catégorie choisie

            while (!categoriesDao.findAllSousCategoriesByCategoryId(categorieChoisie).isEmpty()) {
                System.out.println("Choisissez le nombre correspondant à la sous catégorie : ");
                categorieChoisie = entree.nextInt();
                System.out.println(categoriesDao.findAllSousCategoriesByCategoryId(categorieChoisie));

            } // Le while nous permet d'effectuer l'opération jusqu'a ce obtienne la sous catégorie la plus basse donc celle qui n'a pas son Id dans la colonne ParentID
            ArrayList<ProductDescriptions>  ProductDescriptions =  ProductsDao.getProductDescriptionsbyCategoryId(categorieChoisie); // Liste des produits associé à une sous catégorie
            for (int k = 0 ; k < ProductDescriptions.size() ; k++ ){

                ProductDescriptions.get(k).ToString(); // Methode pour nous renvoyer les attributs choissis
            }
        } else {

            System.out.println("Entrez La reférence du produit :");
            String Reference = entree2.nextLine();
            System.out.println(Reference);
            ArrayList<ProductDescriptions>  ProductDescriptions =  ProductsDao.getProductDescriptionsbyId(Reference); // Liste des Produits qui posséde les caractéres entrés dans sa Référence
            for (int j = 0 ; j < ProductDescriptions.size() ; j++ ){

                ProductDescriptions.get(j).ToString();
            }
        }
    }
}
