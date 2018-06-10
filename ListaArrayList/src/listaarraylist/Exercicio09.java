package listaarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Crispim Paiano dos Santos
 */
public class Exercicio09 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º valor")));
            
        }
        
        if (numeros.get(0)==numeros.lastIndexOf(numeros)) {
            JOptionPane.showMessageDialog(null, "O primeiro e o ultimo são iguais!");
        }else{
            JOptionPane.showMessageDialog(null, "O primeiro e o ultimo são diferentes!");
        }
    }
    
}
