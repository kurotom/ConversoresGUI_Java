package com.conversor.app;

/**
 * @author kurotom
 * @see <a href="https://github.com/kurotom/ConversoresGUI_Java">Repositorio</a>
 */

import javax.swing.JOptionPane;


import com.conversor.app.monedas.ConversorMonedas;
import com.conversor.app.temperaturas.TemperaturasConversor;


public class HandleDataUser {

	public String handler(String contextoConvertidor) {
		String valor = JOptionPane.showInputDialog("Ingrese valor: ");
		
		if (valor != null) {
			
			if (validadorNumero(valor)) {
				Double cantidadIngresada = Double.valueOf(valor);
				
				if (contextoConvertidor == "Conversor de Moneda") {
					ConversorMonedas conversorMoneda = new ConversorMonedas(cantidadIngresada);
					String msgMoneda = conversorMoneda.convertir();
					if (msgMoneda == null) {
						return "";
					} else {
						JOptionPane.showMessageDialog(null, msgMoneda);
					}
				} else if (contextoConvertidor == "Conversor de Temperatura") {
					TemperaturasConversor tempConversor = new TemperaturasConversor(cantidadIngresada);
					String msgTemp = tempConversor.convertir();
					if (msgTemp == null) {
						return "";
					} else {
						JOptionPane.showMessageDialog(null, msgTemp);
					}
				}

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Continuar con otra operación?");
				if (JOptionPane.OK_OPTION == respuesta) {
//					System.out.println("Continuando");
					return contextoConvertidor;
				} else if (JOptionPane.NO_OPTION == respuesta) {
					return "";
				} else if (JOptionPane.OK_CANCEL_OPTION == respuesta) {
					JOptionPane.showMessageDialog(null, "Programa finalizado.");
					System.exit(0);
					return "";
				} else {
					return "";
				}			

			} else {
				JOptionPane.showMessageDialog(null, "Ingrese valores numéricos.");
				return contextoConvertidor;
			}
		} else {
			return "";
		}

	}
	
	public boolean validadorNumero(String string) {
		try {
//			Double valor = Double.valueOf(string);
//			System.out.println(valor);
			Double.valueOf(string);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
