/*
Ejercicio 8: Pedir un número N, y
mostrar todos los números del 1 al N 
*/
package deceroan;

import javax.swing.JOptionPane;
public class DeceroAN {


    public static void main(String[] args) {
        int num,contador;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        
        for (contador=1;contador<=num;contador++){
            System.out.println(+contador);
        }
    }
    
}
