package exercicio05;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Exemplo01 {
    public static void main(String[] args) {
        /*showMessageDialog(null,"oi");
        showInputDialog("fala");
        showConfirmDialog(null, "confirma");
         */

        int valor1, valor2, resultado;
        valor1 = parseInt(showInputDialog("Primeiro valor"));
        valor2 = parseInt(showInputDialog("Segundo valor"));
        resultado = valor1 + valor2;
        showMessageDialog(null,"Resultado: " + resultado);

    }
}
