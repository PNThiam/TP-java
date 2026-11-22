public class GestionFacture {
    public static void main(String[] args){
        String nom = args[0];
        int prix = Integer.parseInt(args[1]);
        int quantite = Integer.parseInt(args[2]);
        System.out.println("produit = " + nom);
        System.out.println("prix unitaire = " + prix);
        System.out.println("quantite = " + quantite);
        System.out.println("prix total = " + prix * quantite);

    }
}