package com.conversor.app.temperaturas;

/**
 * @author kurotom
 * @see <a href="https://github.com/kurotom/ConversoresGUI_Java">Repositorio</a>
 */

import java.util.Locale;


import javax.swing.JOptionPane;


public class TemperaturasConversor {

	private double temperatura;
//    ºC a ºF :    ºF = ºC x 1.8 + 32
//    ºF a ºC :    ºC = (ºF - 32) / 1.8

//     K a ºC :    ºC = K – 273.15
//    ºC a K  :     K = ºC + 273.15

//     K a °F :    °F = 1,8 x (K - 273) + 32
//    °F a K  :     K = (°F + 459,67) x 5/9
	
	public TemperaturasConversor(double temperatura) {
		this.temperatura = temperatura;
	}
	
	
	public String convertir() {
		
		String[] lista = {
				"°C a °F",
				"°F a °C",
				"K a °C",
				"°C a K",
				"K a °F",
				"°F a K"
		};
		
		String returnData = (String) JOptionPane.showInputDialog(
				null,
				"Seleccione operación",
				"",
				JOptionPane.PLAIN_MESSAGE,
				null,
				lista,
				""
		);
		
		if (returnData == null) {
			return null;
		} else {
			switch (returnData) {
				case "°C a °F": {
	//				ºF = ºC x 1.8 + 32
					double resultado = (this.temperatura * 1.8) + 32;
					return formatResponse(this.temperatura, "°C", resultado, "°F");
				}
				case "°F a °C": {
	//				ºC = (ºF - 32) / 1.8
					double resultado = (this.temperatura - 32) / 1.8;
					return formatResponse(this.temperatura, "°F", resultado, "°C");
				}
				case "K a °C": {
	//				ºC = K – 273.15
					double resultado = this.temperatura - 273.15;
					return formatResponse(this.temperatura, "K", resultado, "°C");
				}
				case "°C a K": {
	//				K = ºC + 273.15
					double resultado = this.temperatura + 273.15;
					return formatResponse(this.temperatura, "°C", resultado, "K");
				}
				case "K a °F": {
	//				°F = 1,8 x (K - 273) + 32
					double resultado = 1.8 * (this.temperatura - 273) + 32;
					return formatResponse(this.temperatura, "K", resultado, "°F");
				}
				case "°F a K": {
	//				K = (°F + 459,67) x 5/9
					double resultado = ((this.temperatura + 459.67) * 5) / 9;
					return formatResponse(this.temperatura, "K", resultado, "°F");
				}
				default: {
					return null;
				}
			}
		}		
	}
	
	public String formatResponse(double temp, String unidadOrigen, double resultado, String unidadFinal) {
		return String.format(
				Locale.US,
				"%.2f %s equivalen a %.2f %s",
				temp, unidadOrigen, resultado, unidadFinal
		);
	}
	
	
}
