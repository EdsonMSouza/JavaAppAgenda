/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappagenda;

import Controle.Tarefa;
import Controle.Usuario;
import Windows.JFrameLogin;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author
CARLOS JOSE DE AMORIM - RA 917207155
ALEXSANDRO SILVA PIAZZA- RA 916119196
BRUNO OLIVEIRA BRAZ - RA - RA 916111837
GLAUCYANY LIRA DA CRUZ - RA - RA 916116774
 */
public class JavaAppAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrameLogin jFrameLogin = new JFrameLogin();
        jFrameLogin.setLocationRelativeTo(null);
        jFrameLogin.setVisible(true);
    }
}
