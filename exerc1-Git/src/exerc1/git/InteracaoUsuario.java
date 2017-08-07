/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc1.git;
import javax.swing.JOptionPane;
/**
 *
 * @author karto
 */
public class InteracaoUsuario {
    
    public double solicitaDouble(String msg){
        String texto = JOptionPane.showInputDialog(msg);
        return Double.parseDouble(texto);
    }
    
    public void informaUsuario(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
