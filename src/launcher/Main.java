package launcher;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import data.Enseignant;
import data.Etudiant;

public class Main {

	private static void Start() {
		
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
           System.out.println("Bienvenue sur School Gestion !");
           System.out.println("Veuillez-vous authentifier pour continuer.");
           System.out.println(" ");
           
           System.out.print("Adresse email :");
           String login = br.readLine();
           System.out.print(" ");
           System.out.print("Mot de passe : ");
           String mdp = br.readLine();
           System.out.print(" ");
			
           if(Enseignant.authentification(login, mdp)) {
        	   System.out.println("1 - Créér un étudiant ");
        	   
        	   String choix = br.readLine();
        	   if(choix.equals("1")) {
        		   System.out.println("Nom etudiant : ");
                   String nom = br.readLine();
                   System.out.println("Préom etudiant : ");
                   String prenom = br.readLine();
                   System.out.println("Mail etudiant : ");
                   String mail = br.readLine();
                   System.out.println("Adresse etudiant : ");
                   String adresse = br.readLine();
                   System.out.println("Téléphone etudiant : ");
                   String telephone = br.readLine();
                   System.out.println("Date de naissance etudiant : ");
                   String dateNaissance = br.readLine();
                   Etudiant.creer(nom, prenom, mail, adresse, telephone, dateNaissance);
        	   }
        	   
           }else {
        	   System.out.println("Erreur! Adresse email ou mot de passe incorrect(s). Veuillez reessayer.");
           }
           
		} catch (Exception e) {
			e.printStackTrace();
		}

 	   Main.main(args);
	}
}
