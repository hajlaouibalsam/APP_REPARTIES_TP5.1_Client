package rmiClient;


import rmiService.IConversion; // Import de l'interface IConversion

import java.rmi.Naming;

public class ConversionClient  {

    public static void main(String[] args) {
        try{
            // Recherche de l'objet distant en utilisant l'URL rmi://localhost:1099/objetdistant
            IConversion STUB = (IConversion) Naming.lookup("rmi://localhost:1099/objetdistant");
            // Appel de la méthode convertirMontant de l'objet distant avec différents montants
            double result = STUB.convertirMontant(100);
            System.out.println("Result from server: " + result);
            System.out.println(STUB.convertirMontant(7000.200));
            System.out.println(STUB.convertirMontant(200.52));
            System.out.println(STUB.convertirMontant(4202.02));
        }
        catch (Exception e) {
            // Gestion des exceptions : affichage de la trace de l'exception en cas d'erreur
            e.printStackTrace();
        }
    }
}
