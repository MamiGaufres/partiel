package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Etudiant extends Personne {

	private String dateNaissance;
	
	public Etudiant(int id, String nom, String prenom, String mail, String adresse, String telephone, String dateNaissance) {
		super(id, nom, prenom, mail, adresse, telephone);
		this.dateNaissance = dateNaissance;
	}

	
	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public static boolean creer(String nom, String prenom, String mail, String adresse, String telephone, String dateNaissance) {
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(db_host, db_user, db_passwd);
			st = cn.createStatement();
			String sql = "INSERT into etudiants (etudiant_nom, etudiant_prenom, etudiant_mail, etudiant_adresse, etudiant_tel, etudiant_naissance) VALUES "
					+ "('"+nom+"'"
					+ ",'"+prenom+"'"
					+ ",'"+mail+"'"
					+ ", '"+adresse+"'"
					+ ", '"+telephone+"'"
					+ ", '"+dateNaissance+"'"
					+")";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	
}
