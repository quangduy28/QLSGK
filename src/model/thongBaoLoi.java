
package model;

import java.awt.Component;
import javax.swing.JOptionPane;

public class thongBaoLoi {
    public static void showMessageDialog(Component p, String content, String title){
        JOptionPane.showMessageDialog(p,content ,title,JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showErrorDialog(Component p, String content, String title){
        JOptionPane.showMessageDialog(p,content,title,JOptionPane.ERROR_MESSAGE);
    }
    public static int showConfirmDialog(Component p, String content, String title){
        int choose = JOptionPane.showConfirmDialog(p,content,title,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return choose;
    }
     
}
