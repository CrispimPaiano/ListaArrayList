package listaarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Crispim Paiano dos Santos
 */
public class Exercicio05 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            nomes.add(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º nome"));
        }

        String nomeParaComparar = JOptionPane.showInputDialog("Digite o nome para comparação");
        String texto = "Nome não encontrado";

        for (int i = 0; i < nomes.size(); i++) {
            if (nomeParaComparar.equalsIgnoreCase(nomes.get(i))) {
                texto = "Nome Repetido:" + nomeParaComparar;
                break;
            }

        }

        System.out.println(texto);

    }
}
