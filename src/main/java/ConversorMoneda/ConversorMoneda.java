package ConversorMoneda;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ConversorMoneda {

    public void conversorMoneda(double valor, String monedaSeleccionada, HashMap<String, Double> listaMonedas, HashMap<String, String> simbolos) {
        
        double monedaSel = valor * listaMonedas.get(monedaSeleccionada);
        monedaSel = (double) Math.round(monedaSel * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes:    " + simbolos.get(monedaSeleccionada) + monedaSel);
    }

}
