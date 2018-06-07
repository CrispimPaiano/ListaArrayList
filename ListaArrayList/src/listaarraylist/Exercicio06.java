package listaarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Crispim Paiano dos Santos
 */

public class Exercicio06 {

    public static void main(String[] args) {

        String texto = "";
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número")));
            texto+=numeros.get(i)+"\n";
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }

}
