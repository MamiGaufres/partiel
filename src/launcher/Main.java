package launcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import data.Enseignant;
import data.Etudiant;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
           System.out.println("Bienvenue sur School Gestion !");
           System.out.println("Veuillez-vous authentifier pour continuer.");
           System.out.println(" ");
           
           System.out.print("Adresse email : ");
           String login = br.readLine();
           System.out.print("");
           
           System.out.print("Mot de passe : ");
           String mdp = br.readLine();
           System.out.println("");
			
           if(Enseignant.authentification(login, mdp)) {
        	   System.out.println("1 - Créér un étudiant ");
        	   System.out.println("2 - Lister les étudiants ");
        	   System.out.println("3 - Supprimer un étudiant (via code) ");
        	   System.out.println("4 - Supprimer un étudiant (via code) ");
        	   System.out.println("R - Redémarrer ");
        	   System.out.println("Q - Quitter ");
        	   System.out.println("");
        	   System.out.print("> ");
        	   String value = br.readLine();
        	   if(value.equals("1")) {
        		   System.out.println("");
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
        		   System.out.println("");
        		   System.out.println("L'étudiant a été ajouté au système.");
        		   System.exit(0);
        	   }
        	   
        	   if(value.equals("2")) {
        		   System.out.println("");
                   Etudiant.listerEtudiants();
        		   System.exit(0);
        	   }
        	   
        	   if(value.equals("3")) {
        		   System.out.println("");
        		   System.out.print("Code de l'étudiant : ");
        		   String id = br.readLine();
        		   System.out.println("");
                   Etudiant.supprimerEtudiant(id);;
        		   System.exit(0);
        	   }
        	   
        	   if(value.equals("4")) {
        		   System.out.println("");
        		   System.out.print("Code de l'étudiant : ");
        		   String id = br.readLine();
        		   System.out.println("");
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
                   Etudiant.majEtudiant(id, nom, prenom, mail, adresse, telephone, dateNaissance);
        		   System.exit(0);
        	   }
        	   
        	   if(value.equals("Q")) {
        		   System.out.println("");
        		   System.out.println("A bientôt !");
        		   System.exit(0);
        	   }
        	   
        	   if(value.equals("R")) {
        		   System.out.println("");
        		   System.out.println("Redémarrage en cours ...");
        		   System.out.println("");
        		   System.out.println("");
        		   Main.main(args);
                   
        	   }
        	   
           }
           
		} catch (Exception e) {
			e.printStackTrace();
		}

 	   Main.main(args);
	}
}
