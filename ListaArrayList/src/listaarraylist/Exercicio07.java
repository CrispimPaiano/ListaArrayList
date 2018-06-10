package listaarraylist;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Crispim Paiano dos Santo
 */
public class Exercicio07 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        String texto = "Nomes digitados: ", maiorNome = "", menorNome = "";
        int nomePaulo = 0;
        int nomeAna = 0;
        int qtdVogalInicial = 0;

        for (int i = 0; i < 25; i++) {
            if (i == 23) {

                nomes.add(JOptionPane.showInputDialog(null, "digite o 23+1º nome", "Que delicia", JOptionPane.WARNING_MESSAGE, new ImageIcon(Exercicio07.class.getResource("/ListaArrayList/pasta/QnQ8gB.gif")), null, null).toString());

            } else {
                nomes.add(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º nome!"));
            }

            texto += "\n" + nomes.get(i);
            
            if (nomes.get(i).equalsIgnoreCase("Jailson Mendes")) {
                JOptionPane.showMessageDialog(null, "", "", JOptionPane.WARNING_MESSAGE, new ImageIcon(Exercicio07.class.getResource("/ListaArrayList/pasta/QnQ8gB.gif")));

            }

            if (i == 0) {
                menorNome = nomes.get(i);
            } else {
                if (menorNome.length() > nomes.get(i).length()) {
                    menorNome = nomes.get(i);
                }
                if (maiorNome.length() < nomes.get(i).length()) {
                    maiorNome = nomes.get(i);
                }
            }

            if (nomes.get(i).equalsIgnoreCase("Paulo")) {
                nomePaulo++;
            }

            if (nomes.get(i).equalsIgnoreCase("Ana")) {
                nomeAna++;
            }

            char letraInicial = nomes.get(i).toLowerCase().charAt(0);

            if (letraInicial == 'a'
                    || letraInicial == 'e'
                    || letraInicial == 'i'
                    || letraInicial == 'o'
                    || letraInicial == 'u') {
                qtdVogalInicial++;
            }

        }

        texto += "\n Maior nome:" + maiorNome + " :" + maiorNome.length()
                + "\n Menor nome:" + menorNome + " :" + menorNome.length()
                + "\n Quantidade Paulo: " + nomePaulo
                + "\n Quantidade Ana: " + nomeAna
                + "\n Quantidade de nomes com inicial vogal: " + qtdVogalInicial;

        JOptionPane.showMessageDialog(null, texto);

    }

}
