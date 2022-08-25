package ConversorMoneda;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class OpcionesConversion {

    private HashMap<String, Double> listaMonedas = new HashMap<>();
    private HashMap<String, String> simbolos = new HashMap<>();
    ConversorMoneda cs = new ConversorMoneda();

    public void seleccionDeMonedasAConvertir() {
        boolean repetido = true;
        String monedaSeleccionada;
        String input;

        simbolos.put("ARS", "ARS$");
        simbolos.put("USD", "US$");
        simbolos.put("EUR", "€");
        simbolos.put("COP", "COP$");
        simbolos.put("BRL", "R$");
        simbolos.put("RUB", "₽");

        String monedaLocal = JOptionPane.showInputDialog(null,
                "Seleccione moneda local", "Menú",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"ARS", "USD", "EUR", "COP", "BRL", "RUB"}, "Seleccion").toString();

        do {
            monedaSeleccionada = JOptionPane.showInputDialog(null,
                    "Seleccione moneda a convertir", "Menú",
                    JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"ARS", "USD", "EUR", "COP", "BRL", "RUB"}, "Seleccion").toString();

            if (!monedaLocal.equals(monedaSeleccionada)) {
                repetido = false;
            } else {
                JOptionPane.showMessageDialog(null, "No puede ingresar la misma moneda");
            }

        } while (repetido);

        do {
            input = JOptionPane.showInputDialog(null, "Ingrese un valor");
            if (!(input.matches("[0-9]+"))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo números");
            }
        } while (!input.matches("[0-9]+"));

        double valor = Double.parseDouble(input);

        switch (monedaLocal) {
            case "ARS":
                listaMonedas.put("USD", 0.0073);
                listaMonedas.put("EUR", 0.0073);
                listaMonedas.put("COP", 31.77);
                listaMonedas.put("BRL", 0.037);
                listaMonedas.put("RUB", 0.44);

                cs.conversorMoneda(valor, monedaSeleccionada, listaMonedas, simbolos);
                break;
            case "USD":
                listaMonedas.put("ARS", 136.94);
                listaMonedas.put("EUR", 1.0);
                listaMonedas.put("COP", 4350.95);
                listaMonedas.put("BRL", 5.10);
                listaMonedas.put("RUB", 59.95);

                cs.conversorMoneda(valor, monedaSeleccionada, listaMonedas, simbolos);
                break;
            case "EUR":
                listaMonedas.put("ARS", 136.94);
                listaMonedas.put("USD", 1.0);
                listaMonedas.put("COP", 4350.95);
                listaMonedas.put("BRL", 5.10);
                listaMonedas.put("RUB", 59.95);

                cs.conversorMoneda(valor, monedaSeleccionada, listaMonedas, simbolos);

                break;
            case "COP":
                listaMonedas.put("ARS", 0.031);
                listaMonedas.put("USD", 0.00023);
                listaMonedas.put("EUR", 0.00023);
                listaMonedas.put("BRL", 0.0012);
                listaMonedas.put("RUB", 0.014);

                cs.conversorMoneda(valor, monedaSeleccionada, listaMonedas, simbolos);
                break;
            case "BRL":
                listaMonedas.put("ARS", 26.82);
                listaMonedas.put("USD", 0.2);
                listaMonedas.put("EUR", 0.2);
                listaMonedas.put("COP", 852.08);
                listaMonedas.put("RUB", 11.74);

                cs.conversorMoneda(valor, monedaSeleccionada, listaMonedas, simbolos);
                break;
            case "RUB":
                listaMonedas.put("ARS", 2.28);
                listaMonedas.put("USD", 0.017);
                listaMonedas.put("EUR", 0.017);
                listaMonedas.put("COP", 72.52);
                listaMonedas.put("BRL", 0.085);

                cs.conversorMoneda(valor, monedaSeleccionada, listaMonedas, simbolos);
                break;

        }

    }

}
