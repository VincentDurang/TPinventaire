public class Produit {
    private int codeProduit;
    private String nom;
    private int quantite;
    private double prix;
    private int stockSecu;

    public Produit ( int codeProduit , String nom, int quantite , double prix, int stockSecu){
        this.codeProduit=codeProduit;
        this.nom=nom;
        this.quantite=quantite;
        this.prix=prix;
        this.stockSecu=stockSecu;
    }


    public void setstockPlus(int augmentation){
        this.quantite += augmentation;
    }
    public void setstockMoins(int vente){
        quantite -= vente;
    }
    public double valeurStock(){
        return quantite*prix;
    }
    public boolean alerteStock(){
        if ( quantite <= stockSecu){
            return true ;
        }else{
            return false;
        }
    }
    public boolean  validationCommande(int commande){
       if((commande - quantite) <= 0){
           return true;
       }else {
           return false;
       }
    }

    public int getCodeProduit() {
        return codeProduit;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    public int getStockSecu() {
        return stockSecu;
    }
}


