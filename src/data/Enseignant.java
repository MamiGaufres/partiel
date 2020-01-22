package data;

import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Enseignant extends Personne {
	
	private String enseignement;
	
	public Enseignant(int id, String nom, String prenom, String mail, String adresse, String telephone, String enseignement) {
		super(id, nom, prenom, mail, adresse, telephone);
		this.enseignement = enseignement;
	}
	
	public String getMatiereEnseigne() {
		return enseignement;
	}

	public void setMatiereEnseigne(String matiereEnseigne) {
		this.enseignement = matiereEnseigne;
	}
	
	
	public static boolean authentification(String mail, String pass) {
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(db_host, db_user, db_passwd);
			st = cn.createStatement();
			String sql = "SELECT * FROM enseignants WHERE enseignant_mail = '"+mail+"' AND enseignant_passwd = '"+pass+"'";
			
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				return true;
			}
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
		
		return false;
	}
}
