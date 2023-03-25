
package conversor;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorMonedas {
	
	public void ejecutar() {
		
		// Menu de selección de tipo de cambio de moneda
		String seleccionMonedas = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero",
				"Monedas", 
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De Pesos a Dólar","De Pesos a Euros","De Pesos a Libras","De Pesos a Yen",
					"De Pesos a Won Coreano",
					"De Dólar a Pesos","De Euros a Pesos","De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"},  
					"De Pesos a Dólar")).toString();
		
		// Solicitar el monto a convertir
		double monto = 0;
		boolean isNumeric = false;

		while (!isNumeric) {
			try {
				monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a convertir:",
						"Cantidad a convertir", JOptionPane.PLAIN_MESSAGE));
				isNumeric = true;
				break;
		}	catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Solo valores numéricos son permitidos. Inténtelo de nuevo.");
			}
		}
			
		// Realizar la conversión de moneda
    	double resultadoMonedas = realizarConversion(seleccionMonedas, monto);
    	DecimalFormat formato = new DecimalFormat("#,##0.00");
    	String resultadoFormateado = formato.format(resultadoMonedas);    	
    	String text = "Pesos";
    
    	if (seleccionMonedas == "De Pesos a Dólar") {
    		text = "Dolares";	
    	} else if (seleccionMonedas == "De Pesos a Euros") {
    		text = "Euros";
    	}
    	else if (seleccionMonedas == "De Pesos a Libras") {
    		text = "Libras";
    	}
    	else if (seleccionMonedas == "De Pesos a Yen") {
    		text = "Yenes";
    	}
    	else if (seleccionMonedas == "De Pesos a Won Coreano") {
    		text = "Wones";
    	}
    	
    	JOptionPane.showMessageDialog(null,"Usted tiene $"+resultadoFormateado+" de "+text);
		}
	
		// Lógica de conversión 
		private double realizarConversion (String seleccionMonedas, double monto) {
		    	
		   double tasaCambio = 0;
		   double resultado = 0;
		    	
		   switch (seleccionMonedas) {
					case "De Pesos a Dólar":
						tasaCambio = 4800;
						resultado = monto/tasaCambio;
						break;
					case "De Pesos a Euros":
						tasaCambio = 5000;
						resultado = monto/tasaCambio;
						break;
					case "De Pesos a Libras":
						tasaCambio = 5700;
						resultado = monto/tasaCambio;
						break;
					case "De Pesos a Yen":
						tasaCambio = 35;
						resultado = monto/tasaCambio;
						break;
					case "De Pesos a Won Coreano":
						tasaCambio = 3.64;
						resultado = monto/tasaCambio;
						break;
					case "De Dólar a Pesos":
						tasaCambio = 4800;
						resultado = monto*tasaCambio;
						break;
					case "De Euros a Pesos":
						tasaCambio = 5000;
						resultado = monto*tasaCambio;
						break;
					case "De Librss a Pesos":
						tasaCambio = 5700;
						resultado = monto*tasaCambio;
						break;
					case "De Yen a Pesos":
						tasaCambio = 35;
						resultado = monto*tasaCambio;
						break;
					case "De Won Coreano a Pesos":
						tasaCambio = 3.64;
						resultado = monto*tasaCambio;
						break;
					default: 
						String texto = "Seleccione una opción válida";
						JOptionPane.showMessageDialog(null, texto);
						break;
		    		}
				return resultado =  Math.round(resultado*100.0)/100.0;
			}

}
			
