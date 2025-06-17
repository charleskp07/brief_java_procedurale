import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String Nom_Du_Produit;
        int montant;
        int quantite;
        int prix_total;
        double TVA;
        double prix_taux_TVA;
        double TVA_2;
        double prix_taux_TVA2;
        int choix;


        System.out.print("Entrer le nom du produit : ");
        Nom_Du_Produit= sc.nextLine();

        System.out.print("Entrer le prix du produit : ");
        montant= sc.nextInt();

        System.out.print("Entrer la quantité du produit : ");
        quantite= sc.nextInt();

        System.out.print("Entrer le taux de la TVA en %: ");
        TVA = sc.nextDouble();

        prix_total= montant*quantite;

        prix_taux_TVA= ((prix_total*TVA)/100);


        do {
            System.out.print("Souhaitez-vous ajouter un autre taux ? \n Si oui entrer 1 \n Si non entrer 0 \n Entrer votre choix :");
            choix= sc.nextInt();
        } while (choix!=0 && choix!=1);

        switch (choix) {
            case (0):
                do {
                    System.out.println("Appuyer 1 confirmer la vente ou O pour Annuler");
                    choix = sc.nextInt();
                } while (choix!=0 && choix!=1);

                switch (choix) {
                    case 0:
                        System.out.println("Vente Annuler...");


                        break;

                    case 1 :
                        System.out.println("*****FACTURE DE PHARMACIE******");
                        System.out.println("\t"+ "Produits : " + Nom_Du_Produit);
                        System.out.println("\t"+ "Prix unitaire : " + montant );
                        System.out.println("\t"+ "Quantité : " + quantite +"FCFA" );
                        System.out.println("\t"+ "Montant brut: " + prix_total + " FCFA");
                        System.out.println("\t"+ "taux de la TVA: " + TVA + " %");
                        System.out.println("\t"+ "taux secondaire: 0 %");
                        System.out.println("\t"+ "le montant de la TVA:" +prix_taux_TVA+ " FCFA ");
                        System.out.println("\t"+ "le montant taux secondaire : 0 FCFA  \n");
                        System.out.println("Montant total TTC : " + (prix_total+prix_taux_TVA) + " FCFA");

                        break;
                }


                break;


            case (1):
                System.out.print(" Entrer l'autre taux souhaiter en %: ");
                TVA_2= sc.nextDouble();

                prix_taux_TVA2= ((prix_total*TVA_2)/100);

                do {
                    System.out.println(" Appuyer 1 confirmer la vente ou O pour Annuler");
                    choix = sc.nextInt();
                } while (choix!=0 && choix!=1);

                switch (choix) {
                    case 0:
                        System.out.println("Vente Annuler...");

                        break;

                    case 1 :
                        System.out.println("*****FACTURE DE PHARMACIE******");
                        System.out.println("\t"+ "Produits : " + Nom_Du_Produit);
                        System.out.println("\t"+ "Prix unitaire : " + montant + "FCFA");
                        System.out.println("\t"+ "Quantité : " + quantite );
                        System.out.println("\t"+ "Montant brut: " + prix_total + " FCFA");
                        System.out.println("\t"+ "Taux de la TVA: " + TVA + " %");
                        System.out.println("\t"+ "Taux secondaire: " + TVA_2 + " %");
                        System.out.println("\t"+ "Le montant de la TVA: " + prix_taux_TVA + " FCFA ");
                        System.out.println("\t"+ "Le montant taux secondaire : " + prix_taux_TVA2 + " FCFA  \n");
                        System.out.println("Montant total TTC : " + (prix_total+prix_taux_TVA+prix_taux_TVA2) + " FCFA");

                        break;
                }

                break;
        }

    }

}

