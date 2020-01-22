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
           System.out.println("");
           
           System.out.print("Mot de passe : ");
           String mdp = br.readLine();
           System.out.println("");
			
           if(Enseignant.authentification(login, mdp)) {
        	   System.out.println("1 - Cr��r un �tudiant ");
        	   System.out.println("Q - Quitter ");
        	   
        	   String value = br.readLine();
        	   if(value.equals("1")) {
        		   System.out.println("Nom etudiant : ");
                   String nom = br.readLine();
                   System.out.println("Pr�om etudiant : ");
                   String prenom = br.readLine();
                   System.out.println("Mail etudiant : ");
                   String mail = br.readLine();
                   System.out.println("Adresse etudiant : ");
                   String adresse = br.readLine();
                   System.out.println("T�l�phone etudiant : ");
                   String telephone = br.readLine();
                   System.out.println("Date de naissance etudiant : ");
                   String dateNaissance = br.readLine();
                   Etudiant.creer(nom, prenom, mail, adresse, telephone, dateNaissance);
        	   }
        	   
        	   if(value.equals("Q")) {
        		   System.out.println("");
        		   System.out.println("");
        		   System.out.println("A bient�t !");
        		   System.exit(0);
                   
        	   }
        	   
           }
           
		} catch (Exception e) {
			e.printStackTrace();
		}

 	   Main.main(args);
	}
}
