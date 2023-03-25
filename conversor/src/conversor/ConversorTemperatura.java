package conversor;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	public void ejecutar () {
		// Menu de selección de escala para la temperatura
		String seleccionTemperatura = (JOptionPane.showInputDialog(null,
				"Elige la escala a la que deseas convertir tu temperatura", "Temperatura", 
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De °C a °F","De °F a °C","De °C a °K","De °K a °C", "De °K  a °F", "De °F a °K"},  
				"De °C a °F")).toString();
		
		// Solicitar el monto a convertir
		double temp = 0;
		boolean isNumeric = false;

		while (!isNumeric) {
		try {
		temp = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir:",
		"Temperatura a convertir", JOptionPane.PLAIN_MESSAGE));
		isNumeric = true;
		break;
		} catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Solo valores numéricos son permitidos. Inténtelo de nuevo.");
		}
		}
		
		 // Realizar la conversión de moneda
        double resultadoTemperatura = realizarConversion(seleccionTemperatura, temp);
        
        JOptionPane.showMessageDialog(null, "La temperatura es de °"+resultadoTemperatura);
		}
	
		// Lógica de conversión 
    	private double realizarConversion (String seleccionMonedas, double temp) {
    	
    	double operacionTemperatura = 0;
    	
    	switch (seleccionMonedas) {
			case "De °C a °F":
				operacionTemperatura = (temp*18)+32;
				break;
			case "De °F a °C":
				operacionTemperatura = (temp-32)/1.8;
				break;
			case "De °C a °K":
				operacionTemperatura = temp-273.15;
				break;
			case "De °K a °C":
				operacionTemperatura = temp+273.15;
				break;
			case "De °K  a °F":
				operacionTemperatura = ((temp-273.15)*1.8)+32;;
				break;
			case "De °F a °K":
				operacionTemperatura = (temp-32)*5/9+273.15;
				break;
			default:
				String texto = "Seleccione una opción válida";
				JOptionPane.showMessageDialog(null, texto);
				break;
    		}
		return operacionTemperatura = Math.round(operacionTemperatura*100.0)/100.0;
	}
	}
