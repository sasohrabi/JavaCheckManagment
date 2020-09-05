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
public class Customer {
    private int id;
    private String name;
    
    
    
    Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Add the getter and setter as you want.

    // This will be used internally by JComboBox as the label to be displayed.
    @Override
    public String toString() {
        return name;
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
