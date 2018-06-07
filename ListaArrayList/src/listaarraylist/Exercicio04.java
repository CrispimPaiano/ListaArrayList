package listaarraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Crispim Paiano dos Santos
 */

public class Exercicio04 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            numeros.add(aleatorio.nextInt(10));
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }    
        
        numeros.remove(3);
        System.out.println("\nPosição 3 removida\nTamanho atual da array list: "+numeros.size());
        
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        
        numeros.remove(4);
        System.out.println("\nPosição 4 removida\nTamanho atual da array list: "+numeros.size());
        
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }

}
