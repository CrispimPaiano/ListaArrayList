package listaarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Crispim Paiano dos Santos
 */
public class Exercicio10 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        String texto = "Numeros Digitados: ";
        
        for (int i = 0; i < 7; i++) {

            numeros1.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor da primeira lista")));

        }
        
        for (int i = 0; i < 7; i++) {

            numeros2.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor da segunda lista")));
            texto+="\n"+numeros1.get(i)+" e "+numeros2.get(i)+" são:";
            
            if (numeros1.get(i)==numeros2.get(i)) {
                texto+="iguais";
            }else{
                texto+="diferentes";
            }
            
        }
        
        JOptionPane.showMessageDialog(null, texto);

    }

}
