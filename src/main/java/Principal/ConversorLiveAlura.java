package Principal;

import ConversorMoneda.OpcionesConversion;
import javax.swing.JOptionPane;

public class ConversorLiveAlura {

    public static void main(String[] args) {

        OpcionesConversion op = new OpcionesConversion();
        while (true) {
            String opciones = JOptionPane.showInputDialog(null,
                    "Seleccione una opción de conversión", "Menú",
                    JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Conversor de Monedas"}, "Elegir").toString();

            switch (opciones) {
                case "Conversor de Monedas":
                    op.seleccionDeMonedasAConvertir();
                    
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    if(JOptionPane.OK_OPTION == respuesta){
                        System.out.println("Selecciona opción Afirmativa");
                    }else{
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        System.exit(0);
                    }
                    break;
            }
        }

    }
}
