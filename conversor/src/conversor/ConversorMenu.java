package conversor;

import javax.swing.JOptionPane;

public class ConversorMenu {
	
	public static void main(String[] args) {
	
		MenuInicial menuInicial = new MenuInicial();
		menuInicial.ejecutarSeleccion();
		
		int opciones = JOptionPane.showConfirmDialog(null, "¿Desea continuar?"); 
		
		while (opciones == JOptionPane.YES_OPTION) {
			menuInicial.ejecutarSeleccion();
			opciones = JOptionPane.showConfirmDialog(null, "¿Desea continuar?"); 
		}
		
		if (opciones == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
		}
		else if (opciones == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
		}	
    }
}
