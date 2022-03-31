import java.util.ArrayList;
import java.util.List;

public class Traitement {
    public static void main(String[] args) {
        List<Produit> listeproduit = new ArrayList<Produit>();

        listeproduit.add(new Produit(125, "Fraise", 13, 1.20, 10));
        listeproduit.add(new Produit(150, "Banane", 60, 1.20, 10));
        listeproduit.add(new Produit(720, "Pomme", 20, 2.20, 5));

        for (Produit p : listeproduit)
            if (p.getCodeProduit() == 125) {
                System.out.println("Produit : " + p.getNom() + " et quantité : " + p.getQuantite());
                if (p.alerteStock()) {
                    System.out.println("Attention ,stock de secoure");
                } else {
                    System.out.println("Stock correct");
                }
                System.out.println("Prix :"+p.valeurStock() + "€");
            } else if (p.getCodeProduit() == 150) {
                System.out.println("Produit : " + p.getNom() + " et quantité : " + p.getQuantite());
                p.setstockPlus(80);
                System.out.println("Nouveau stock : "+p.getQuantite());

                if(p.validationCommande(50)){

                    System.out.println("Validation de commande");
                }else {
                    System.out.println("Commande Refuser");
                }
            } else if (p.getCodeProduit() == 720) {
                System.out.println("Produit : " + p.getNom() + " et quantité : " + p.getQuantite());
                p.setstockMoins(6);
                System.out.println("Nouveau stock: "+p.getQuantite());

                if(p.validationCommande(50)){

                    System.out.println("Validation de commande");
                }else {
                    System.out.println("Commande Refuser");

            }
    }
    }
}
