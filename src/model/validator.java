
package model;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class validator {
    public static void validatorEmty(JTextField f,StringBuilder s, String error ){
        if(f.getText().equals("")){
            s.append(error).append("\n");
            f.setBackground(Color.red);
            f.requestFocus();
    }else{
            f.setBackground(new java.awt.Color(204,255,255));
            }
}
public static void validatorEmty(JPasswordField f,StringBuilder s, String error ){
        String pass = new String(f.getPassword());
        if(pass.equals("")){
            s.append(error).append("\n");
            f.setBackground(Color.red);
            f.requestFocus();
    }else{
            f.setBackground(new java.awt.Color(204,255,255));
            }
}
}