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
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.sql.Connection;
import javax.swing.JOptionPane;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ComboJumbo extends JFrame{

    JLabel label;
    JComboBox combo;
    public Customer customers[];
    public int size=0;

    public Customer findObject(String name)
     {
        for(Integer i=0; i<size;i++)    
            if(customers[i].getName().equals(name))
              return  customers[i];
        return null;
     }
    public static void main(String args[]){
        new ComboJumbo();
    }

    public ComboJumbo(){
      
         try {
            Integer i= 0;
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:H:\\saeed\\SAEED PROJECT\\JAVA\\sqlite\\JavaApplication2\\checkrecived.sqlite";
            Connection con = DriverManager.getConnection(url);

            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            ResultSet rs = st.executeQuery("select code,PartyAccount from tblPartyAccount");
            ResultSet rsCount = st2.executeQuery("select count(*) as rowcount from tblPartyAccount");
            
            size= rsCount.getInt("rowcount");

            label = new JLabel("Select a Customer");
            add(label, BorderLayout.NORTH);
            
           customers = new Customer[size]; 
            //Customer customers[] = new Customer[size]; 
            while (rs.next()) {
                customers[i++] = new Customer(rs.getString("PartyAccount"), rs.getInt("code"));
            }
            con.close();
            combo = new JComboBox(customers);
        
        combo.addItemListener(new ItemListener(){

            public void itemStateChanged(ItemEvent e) {
                Customer c = (Customer)e.getItem();
                label.setText(""+c.getId());
            }

        });
        JPanel panel = new JPanel();
        panel.add(combo);
        add(panel,BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
       //setVisible(true);
        setVisible(false);
        
                } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }


    class Customer{
        private String name;
        private int id;

        public Customer(String name, int id){
            this.name = name;
            this.id = id;
        }

        public String toString(){
            return getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
