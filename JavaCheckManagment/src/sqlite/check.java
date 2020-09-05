/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlite;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Administrator
 */
public class check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
      //Chargement du driver JDBC

      Class.forName("org.sqlite.JDBC");
      
      //Connexion à la base de données
      String     url = "jdbc:sqlite:checkrecived.sqlite";
      Connection con = DriverManager.getConnection(url);
      
      //Création d'un statement et d'une requête à adresse à la table
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("SELECT * FROM tblPartyAccount");
      
      //Affichage des résultats

      while (rs.next()) {
        int    id   = rs.getInt("code");
        String name = rs.getString("PartyAccount");
        System.out.println("code = " + id + ", PartyAccount = " + name);
      }
      
      //Fermeture de la connexion à la base

      con.close();
      
    } catch (SQLException ex) {
      //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
     // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

}
