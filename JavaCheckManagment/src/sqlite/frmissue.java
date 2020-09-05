/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmissue.java
 *
 * Created on Aug 19, 2013, 6:15:25 PM
 */
package sqlite;

import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

//import sqlite.ComboJumbo.Customer;



/**
 *
 * @author Administrator
 */
public class frmissue extends javax.swing.JFrame {

    private TreeMap<Integer, String> categoryMap = new TreeMap<Integer, String>();
    private String strsql = ("SELECT tblPartyAccount.PartyAccount as namefamilyparty,tblCheckIssued.DescCheck, tblCheckIssued.NameBank,tblCheckIssued.NumberCheck, tblCheckIssued.AmountCheck, tblCheckIssued.DateIssuance, tblCheckIssued.DateUsance,tblCheckIssued.pass,tblCheckIssued.id FROM tblPartyAccount INNER JOIN tblCheckIssued ON tblPartyAccount.[code] = tblCheckIssued.[PartyAccount];");
    private int partycode = 0;
    private int id = 0;
    public Customer customers[];

    /**
     * Creates new form frmissue
     */
    public frmissue() {

        initComponents();
   /*     this.tblissue.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.txtmablaghcheck.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.txtnambank.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.txtsharhheck.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.txtshomarehcheck.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);*/
        this.setLocationRelativeTo(null);  
        //this.cbotarafhesab.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);  
        //  this.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    }

    void formatTableColumn() {
        tblissue.getColumnModel().getColumn(0).setHeaderValue("Account side");
        tblissue.getColumnModel().getColumn(1).setHeaderValue("Description");
        tblissue.getColumnModel().getColumn(2).setHeaderValue("Bank name");
        tblissue.getColumnModel().getColumn(3).setHeaderValue("check number");
        tblissue.getColumnModel().getColumn(4).setHeaderValue("Check amount");
        tblissue.getColumnModel().getColumn(5).setHeaderValue("Check issuance date");
        tblissue.getColumnModel().getColumn(6).setHeaderValue("Check due date");
        tblissue.getColumnModel().getColumn(7).setHeaderValue("Passed");
        tblissue.getColumnModel().getColumn(8).setHeaderValue("Code");
        tblissue.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblissue.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblissue.getColumnModel().getColumn(2).setPreferredWidth(45);
        tblissue.getColumnModel().getColumn(3).setPreferredWidth(30);
        tblissue.getColumnModel().getColumn(4).setPreferredWidth(30);
        tblissue.getColumnModel().getColumn(5).setPreferredWidth(20);
        tblissue.getColumnModel().getColumn(6).setPreferredWidth(20);
        tblissue.getColumnModel().getColumn(7).setPreferredWidth(5);
        tblissue.getColumnModel().getColumn(8).setPreferredWidth(5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msktarikhsodor = new javax.swing.JFormattedTextField();
        cbotarafhesab = new javax.swing.JComboBox();
        txtmablaghcheck = new javax.swing.JTextField();
        txtnambank = new javax.swing.JTextField();
        txtshomarehcheck = new javax.swing.JTextField();
        txtsharhheck = new javax.swing.JTextField();
        msksarresid = new javax.swing.JFormattedTextField();
        btnadd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chkpas = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblissue = new javax.swing.JTable();
        btnsave = new javax.swing.JButton();
        btnselect = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("فرم ثبت چک های صادره");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        try {
            msktarikhsodor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        msktarikhsodor.setNextFocusableComponent(msksarresid);
        msktarikhsodor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                msktarikhsodorKeyPressed(evt);
            }
        });

        cbotarafhesab.setNextFocusableComponent(txtsharhheck);
        cbotarafhesab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbotarafhesabItemStateChanged(evt);
            }
        });
        cbotarafhesab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotarafhesabActionPerformed(evt);
            }
        });
        cbotarafhesab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbotarafhesabKeyPressed(evt);
            }
        });

        txtmablaghcheck.setText("jTextField4");
        txtmablaghcheck.setNextFocusableComponent(msktarikhsodor);
        txtmablaghcheck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmablaghcheckKeyPressed(evt);
            }
        });

        txtnambank.setText("jTextField2");
        txtnambank.setNextFocusableComponent(txtshomarehcheck);
        txtnambank.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnambankKeyPressed(evt);
            }
        });

        txtshomarehcheck.setText("jTextField3");
        txtshomarehcheck.setNextFocusableComponent(txtmablaghcheck);
        txtshomarehcheck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtshomarehcheckKeyPressed(evt);
            }
        });

        txtsharhheck.setText("jTextField1");
        txtsharhheck.setName(""); // NOI18N
        txtsharhheck.setNextFocusableComponent(txtnambank);
        txtsharhheck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsharhheckKeyPressed(evt);
            }
        });

        try {
            msksarresid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        msksarresid.setNextFocusableComponent(chkpas);
        msksarresid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                msksarresidKeyPressed(evt);
            }
        });

        btnadd.setActionCommand("");
        btnadd.setLabel("Add");
        btnadd.setName(""); // NOI18N
        btnadd.setNextFocusableComponent(cbotarafhesab);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        btnadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnaddKeyPressed(evt);
            }
        });

        jLabel8.setText("Check due date");

        jLabel5.setText("check number ");

        jLabel4.setText("Bank name");

        jLabel3.setText("Description");

        jLabel1.setText("Account side");

        jLabel7.setText("Check issuance date");

        jLabel6.setText("Check amount ");

        chkpas.setText("Passed ");
        chkpas.setNextFocusableComponent(btnsave);
        chkpas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkpasKeyPressed(evt);
            }
        });

        tblissue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Account side ", "Description", "Bank name", "check number", "Check amount", "Check issuance date", "Check due date", "Passed ", "code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblissue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblissueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblissue);

        btnsave.setLabel("Save");
        btnsave.setNextFocusableComponent(btnadd);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        btnsave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsaveKeyPressed(evt);
            }
        });

        btnselect.setLabel("Select");
        btnselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectActionPerformed(evt);
            }
        });

        btnupdate.setLabel("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setLabel("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnprint.setLabel("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        btnclose.setLabel("Exit");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20)
                                .addComponent(cbotarafhesab, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtshomarehcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmablaghcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(msktarikhsodor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(msksarresid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtsharhheck, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnambank, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkpas)
                                .addGap(34, 34, 34))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnclose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnprint)
                        .addGap(98, 98, 98)
                        .addComponent(btndelete)
                        .addGap(90, 90, 90)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnselect)
                        .addGap(142, 142, 142)
                        .addComponent(btnsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadd)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnambank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkpas))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(txtsharhheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotarafhesab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtshomarehcheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtmablaghcheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(msktarikhsodor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jLabel8)
                            .addComponent(msksarresid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclose)
                    .addComponent(btnprint)
                    .addComponent(btndelete)
                    .addComponent(btnupdate)
                    .addComponent(btnselect)
                    .addComponent(btnsave)
                    .addComponent(btnadd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshForm() {
        try {
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:"+Paths.get("").toAbsolutePath().toString()+"/checkrecived.sqlite";
            Connection con = DriverManager.getConnection(url);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strsql);

            tblissue.setModel(DbUtils.resultSetToTableModel(rs));

            formatTableColumn();
            con.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }

    }

    private void fillcomboPartyAccount() throws SQLException {
        /* previous    ComboJumbo c;
        c = new ComboJumbo();
        cbotarafhesab.setModel(c.combo.getModel());  */
        
        try {
            cbotarafhesab.removeAllItems();
            Integer i= 0;
            int size=0;
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:"+Paths.get("").toAbsolutePath().toString()+"/checkrecived.sqlite";
            Connection con = DriverManager.getConnection(url);

            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            ResultSet rs = st.executeQuery("select code,PartyAccount from tblPartyAccount");
            ResultSet rsCount = st2.executeQuery("select count(*) as rowcount from tblPartyAccount");
            
            size= rsCount.getInt("rowcount");
            
            customers = new Customer[size]; 
            //Customer customers[] = new Customer[size]; 
            while (rs.next()) {
                customers[i++] = new Customer(rs.getInt("code"),rs.getString("PartyAccount"));
               //cbotarafhesab.addItem(new customers[i]);
            }
            cbotarafhesab.setModel(new javax.swing.DefaultComboBoxModel(customers));
         /*           
            while (rs.next()) {
                int id = rs.getInt("code"); // Get the Id
                String name = rs.getString("PartyAccount"); // Get the Name

                Customer CustomerItem = new Customer(id, name); // Create a new ComboItem
                cbotarafhesab.addItem(CustomerItem); // Put it into the ComboBox
            }   */
            con.close();
      

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    void clearTextBox() {
        cbotarafhesab.setSelectedIndex(0);
        cbotarafhesab.requestFocus();
        txtshomarehcheck.setText("");
        txtnambank.setText("");
        txtsharhheck.setText("");
        txtmablaghcheck.setText("");
        msktarikhsodor.setText("");
        msksarresid.setText("");
        chkpas.setSelected(false);
    }

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        clearTextBox();
        this.btnadd.transferFocus();
}//GEN-LAST:event_btnaddActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        Customer c = (Customer) this.cbotarafhesab.getSelectedItem();
        partycode = c.getId();

        if (isValidate() == true) {
            try {

                boolean pass = chkpas.isSelected();

                String SQL = "";

                Class.forName("org.sqlite.JDBC");

                String url = "jdbc:sqlite:"+Paths.get("").toAbsolutePath().toString()+"/checkrecived.sqlite";
                Connection con = DriverManager.getConnection(url);
                SQL = "INSERT INTO tblCheckIssued(DescCheck,NameBank,NumberCheck,AmountCheck,DateIssuance,PartyAccount,DateUsance,pass) VALUES('" + txtsharhheck.getText().trim() + "','" + txtnambank.getText().trim() + "','" + txtshomarehcheck.getText().trim() + "','" + txtmablaghcheck.getText().trim() + "','" + msktarikhsodor.getText().trim() + "','" + partycode + "','" + msksarresid.getText().trim() + "','" + pass + "')";
                Statement st = con.createStatement();
                st.executeUpdate(SQL);

                RefreshForm();

                st.close();
                con.close();

                //JOptionPane.showMessageDialog(this,"??????? ?????? ??? ?????" ,"information", JOptionPane.OK_OPTION);
                JOptionPane.showMessageDialog(null, "اطلاعات به درستی ثبت گردید");

            } catch (Exception ex) {
                System.out.print(ex);
            }

        }//for if

        this.btnsave.transferFocus();

    }//GEN-LAST:event_btnsaveActionPerformed

    private boolean isValidate() {
        if (txtmablaghcheck.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "مبلغ چک خالی  است", "Warning", JOptionPane.OK_OPTION);
            return false;
        }
        if (txtnambank.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "نام بانک خالی می باشد", "Warning", JOptionPane.OK_OPTION);
            return false;
        }

        if (txtsharhheck.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "شرح چک خالی می باشد", "Warning", JOptionPane.OK_OPTION);
            return false;
        }

        if (txtshomarehcheck.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "شماره چک خالی می باشد", "Warning", JOptionPane.OK_OPTION);
            return false;
        }

        return true;
    }
    
    private Object findObject(String name)
     {
        for(Integer i=0; i< this.cbotarafhesab.getItemCount();i++)    
           if(customers[i].getName().equals(name))
              return  customers[i];
        return null;

     }
    private void btnselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectActionPerformed

        //System.out.print(cbj.findId(tblissue.getModel().getValueAt(tblissue.getSelectedRow(),0)));
        //this.cbotarafhesab.setSelectedItem(this.cbotarafhesab.getModel().setSelectedItem(cbj.findId((String) tblissue.getModel().getValueAt(tblissue.getSelectedRow(),0))));

        this.cbotarafhesab.getModel().setSelectedItem(findObject((String)tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 0)));
        this.txtsharhheck.setText(tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 1).toString());
        this.txtnambank.setText(tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 2).toString());
        this.txtshomarehcheck.setText(tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 3).toString());
        this.txtmablaghcheck.setText(tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 4).toString());
        this.msktarikhsodor.setValue(tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 5).toString());
        this.msksarresid.setValue(tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 6).toString());
        id = (int) tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 8);
    }//GEN-LAST:event_btnselectActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        Customer c = (Customer) this.cbotarafhesab.getSelectedItem();
        partycode = c.getId();

        if (isValidate() == true) {
            try {

                boolean pass = chkpas.isSelected();

                String SQL = "";

                Class.forName("org.sqlite.JDBC");

                String url = "jdbc:sqlite:"+Paths.get("").toAbsolutePath().toString()+"/checkrecived.sqlite";
                Connection con = DriverManager.getConnection(url);
                SQL = "Update tblCheckIssued SET DescCheck = ?, NameBank = ?, NumberCheck = ?, AmountCheck = ?,DateIssuance = ?, PartyAccount = ?, DateUsance = ?,pass ='" + pass + "' WHERE id = ?";
                PreparedStatement st = con.prepareStatement(SQL);
                st.setString(1, txtsharhheck.getText().trim());
                st.setString(2, txtnambank.getText().trim());
                st.setString(3, txtshomarehcheck.getText().trim());
                st.setString(4, txtmablaghcheck.getText().trim());
                st.setString(5, msktarikhsodor.getText().trim());
                st.setInt(6, partycode);
                st.setString(7, msksarresid.getText().trim());
               // st.setBoolean(8, pass); set 0,1 
                st.setInt(8, id);

                st.executeUpdate();

                RefreshForm();

                st.close();
                con.close();

                //JOptionPane.showMessageDialog(this,"??????? ?????? ??? ?????" ,"information", JOptionPane.OK_OPTION);
                JOptionPane.showMessageDialog(null, "اطلاعات به درستی تغییر یافت");

            } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
                System.out.print(ex);
            }

        }//for if

        this.btnsave.transferFocus();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {

            String SQL = "";

            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:"+Paths.get("").toAbsolutePath().toString()+"/checkrecived.sqlite";
            Connection con = DriverManager.getConnection(url);
            SQL = "DELETE FROM tblCheckIssued WHERE id=" + (int) tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 8);
            Statement st = con.createStatement();
            st.executeUpdate(SQL);

            RefreshForm();

            st.close();
            con.close();

            //JOptionPane.showMessageDialog(this,"??????? ?????? ??? ?????" ,"information", JOptionPane.OK_OPTION);
            JOptionPane.showMessageDialog(null, "اطلاعات به درستی حذف گردید");

        } catch (Exception ex) {
            System.out.print(ex);
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            String SQL1;
            SQL1   = "SELECT * from tblcheckincoming,tblpartyaccount";
            String reportSource;
            reportSource = Paths.get("").toAbsolutePath().toString()+"\\report2.jrxml";
           // reportSource =JasperCompileManager.compileReport(getClass().getResourceAsStream("/report2.jrxml"));
            String reportDest;
            reportDest =  Paths.get("").toAbsolutePath().toString()+"\\report2.jasper";

            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:"+Paths.get("").toAbsolutePath().toString()+"/checkrecived.sqlite";
            Connection con = DriverManager.getConnection(url);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL1);

    
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            JasperCompileManager.compileReportToFile(reportSource, reportDest);

            JasperPrint jasperPrint
                    = JasperFillManager.fillReport(reportDest, null, jrRS);
            /* JasperFillManager.fillReport(
             reportDest, params, new JREmptyDataSource());*/
            JasperViewer.viewReport(jasperPrint);

        } catch (ClassNotFoundException | SQLException | JRException ex) {
            System.out.print(ex);
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
       
 JOptionPane.showMessageDialog(null,System.getProperty("user.dir")+"");
        // dispose();
       // setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            fillcomboPartyAccount();
        } catch (SQLException ex) {
            Logger.getLogger(frmissue.class.getName()).log(Level.SEVERE, null, ex);
        }
        RefreshForm();
        clearTextBox();

       // ComboJumbo j = new ComboJumbo();

    }//GEN-LAST:event_formWindowOpened

    private void cbotarafhesabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotarafhesabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotarafhesabActionPerformed

    private void cbotarafhesabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbotarafhesabKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.cbotarafhesab.transferFocus();
        }
        //  this.txtshomarehcheck.requestFocusInWindow();  
    }//GEN-LAST:event_cbotarafhesabKeyPressed

    private void txtsharhheckKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsharhheckKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txtsharhheck.transferFocus();
        }
    }//GEN-LAST:event_txtsharhheckKeyPressed

    private void txtnambankKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnambankKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txtnambank.transferFocus();
        }
    }//GEN-LAST:event_txtnambankKeyPressed

    private void txtshomarehcheckKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtshomarehcheckKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txtshomarehcheck.transferFocus();
        }
    }//GEN-LAST:event_txtshomarehcheckKeyPressed

    private void msktarikhsodorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_msktarikhsodorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.msktarikhsodor.transferFocus();
        }
    }//GEN-LAST:event_msktarikhsodorKeyPressed

    private void msksarresidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_msksarresidKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.msksarresid.transferFocus();
        }
    }//GEN-LAST:event_msksarresidKeyPressed

    private void chkpasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkpasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.chkpas.transferFocus();
        }
    }//GEN-LAST:event_chkpasKeyPressed

    private void btnsaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.btnsave.doClick();
        }
    }//GEN-LAST:event_btnsaveKeyPressed

    private void btnaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnaddKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.btnadd.doClick();
        }
    }//GEN-LAST:event_btnaddKeyPressed

    private void txtmablaghcheckKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmablaghcheckKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txtmablaghcheck.transferFocus();
        }
    }//GEN-LAST:event_txtmablaghcheckKeyPressed

    private void tblissueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblissueMouseClicked

         //  Object userID = tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 0);
        //   this.txtnambank.setText(tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 1).toString());
        //   Object status = tblissue.getModel().getValueAt(tblissue.getSelectedRow(), 2);

    }//GEN-LAST:event_tblissueMouseClicked

    private void cbotarafhesabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbotarafhesabItemStateChanged
      /*previous combo  Customer c = (Customer) evt.getItem();
        // this.jLabel2.setText(""+c.getId());
        partycode = c.getId();
        // this.txtsharhheck.setText(""+partycode); */
        Customer comboItem = (Customer) cbotarafhesab.getSelectedItem();
        partycode = comboItem.getId();
    }//GEN-LAST:event_cbotarafhesabItemStateChanged

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed


    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = sdf.format(date);
        shamsi shamsidate = new shamsi();
        msktarikhsodor.setValue(shamsidate.Fa_Date(strDate));

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = sdf.format(date);
        shamsi shamsidate = new shamsi();
        msksarresid.setValue(shamsidate.Fa_Date(strDate));
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

                    //com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
                    //com.sun.java.swing.plaf.motif.MotifLookAndFeel
                    //com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
                    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmissue.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(frmissue.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(frmissue.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(frmissue.class.getName()).log(Level.SEVERE, null, ex);
                }
                new frmissue().setVisible(true);

            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnselect;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cbotarafhesab;
    private javax.swing.JCheckBox chkpas;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JFormattedTextField msksarresid;
    private javax.swing.JFormattedTextField msktarikhsodor;
    private javax.swing.JTable tblissue;
    private javax.swing.JTextField txtmablaghcheck;
    private javax.swing.JTextField txtnambank;
    private javax.swing.JTextField txtsharhheck;
    private javax.swing.JTextField txtshomarehcheck;
    // End of variables declaration//GEN-END:variables
}
