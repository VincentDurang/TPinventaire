public class Categorie {
    private int codeProduit;
    private String nom;

    public Categorie (int codeProduit,String nom){
        this.codeProduit=codeProduit;
        this.nom=nom;
    }

    public int getCodeProduit() {
        return codeProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
