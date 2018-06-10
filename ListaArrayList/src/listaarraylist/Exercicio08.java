package listaarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Crispim Paiano dos Santos
 */
public class Exercicio08 {

    public static void main(String[] args) {

        ArrayList<Double> salarios = new ArrayList<>();
        double totalSalario=0,mediaSalario=0,totalSalarioPar=0, mediaSalarioImpar=0;
        int qtdImpar=0;
        String texto = "Listagem de salarios:";
        
        for (int i = 0; i < 10; i++) {
            
            //recebe o valor do salário
            salarios.add(Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(i+1)+" salário:")));
            texto+="\nSalário "+(i+1)+": "+salarios.get(i);
            
            //Total dos Salários
            totalSalario+=salarios.get(i);
            //Quantidade de salários
            mediaSalario++;
            
            
            //total de salários de posições pares
            if (i%2==0) {
                totalSalarioPar+=salarios.get(i);
            }
            
            if (i%2!=0) {
                mediaSalarioImpar+=salarios.get(i);
                qtdImpar++;
            }
            
        }
        
        //media = total de salários dividido por quantidade
        mediaSalario=totalSalario/mediaSalario;
        
        //media de salários impar
        mediaSalarioImpar=mediaSalarioImpar/qtdImpar;
        
        texto+="\n\nMédia de salários: "+mediaSalario
              +"\nTotal dos salários: "+totalSalario
              +"\nTotal dos salários na posição par: "+totalSalarioPar
              +"\nMédia dos salários na posição impar: "+mediaSalarioImpar
              +"\nQuantidade de salários: "+salarios.size();
        
        JOptionPane.showMessageDialog(null, texto);
    }

}
