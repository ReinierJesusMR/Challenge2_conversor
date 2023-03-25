
package conversor;

import javax.swing.JOptionPane;

public class MenuInicial {
	
	public String ejecutarSeleccion() {
		
		// Menu de selección para el usuario
		 Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", 
		            JOptionPane.PLAIN_MESSAGE, null,
		            new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},
		            "Conversor de Moneda");

		    // Verificar si el usuario ha seleccionado una opción o ha cancelado el diálogo
		    if (seleccion == null) {
		        JOptionPane.showMessageDialog(null, "Programa finalizado");
		        System.exit(0);
		    }

		    // Si el usuario ha seleccionado una opción, ejecutar la conversión correspondiente
		    if (seleccion.equals("Conversor de Moneda")) {
		        ConversorMonedas conversorMoneda = new ConversorMonedas();
		        conversorMoneda.ejecutar();
		    } else if (seleccion.equals("Conversor de Temperatura")) {
		        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
		        conversorTemperatura.ejecutar();
		    }
		
		return seleccion.toString();			
	}
}
