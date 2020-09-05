/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqlite;

/**
 *
 * @author Administrator
 */
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
  
import javax.swing.DefaultComboBoxModel;  
import javax.swing.JComboBox;  
import javax.swing.JFrame;  


import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.proteanit.sql.DbUtils;
  
class DemoModelItem {  
    public String objectName;  
    public String objectType;  
      
    public DemoModelItem(String objectName,String objectType){  
        this.objectName = objectName;  
        this.objectType = objectType;  
    }  
      
    public String toString(){  
        return objectType+"-"+objectName;  
    }  
}  
  
public class ComboTest {  
    public static Connection getConnection() throws Exception {  
        Connection conn = null;  
        //open connection   
        return conn;  
    }  
      
    public static DefaultComboBoxModel buildComboBoxModel() throws Exception {  
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();  
        Class.forName("org.sqlite.JDBC");

        String url = "jdbc:sqlite:checkrecived.sqlite";
        Connection con = DriverManager.getConnection(url);

       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery("select code,PartyAccount from tblPartyAccount");
 
        try {  

            while(rs.next()){  
                comboBoxModel.addElement(new DemoModelItem(rs.getString("code"),rs.getString("PartyAccount")));  
            }  
            rs.close();  
         //   ps.close();  
        } catch (Exception e) {  
            throw e;  
        }finally{  
            try{}catch(Exception e){;}  
        }  
        return comboBoxModel;  
    }  
  
    public static void main(String[] args) throws Exception {  
        JComboBox comboBox = new JComboBox();  
        comboBox.setModel(buildComboBoxModel());  
  
        JFrame frame = new JFrame("Combo Demo");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
        frame.getContentPane().add(comboBox);  
        frame.pack();  
        frame.setVisible(true);  
    }  
}  
