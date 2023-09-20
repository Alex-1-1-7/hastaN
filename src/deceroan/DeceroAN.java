/*
Ejercicio 8: Pedir un número N, y
mostrar todos los números del 1 al N 
*/
package deceroan;

import javax.swing.JOptionPane;
public class DeceroAN {


    public static void main(String[] args) {
        int num,contador,acumulador=0;
        
        //de cero a N 
        /*num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        
        for (contador=1;contador<=num;contador++){
            System.out.println(+contador);
        }*/
        
        // pedir 5 numeros y mostrara la suma total
        
       for (int i =1; i <=5;i++){
           num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
           acumulador+=num;
       }  
        JOptionPane.showMessageDialog(null, "la suma total de esos numeros es: "+acumulador);
        
        
    }
    
}
