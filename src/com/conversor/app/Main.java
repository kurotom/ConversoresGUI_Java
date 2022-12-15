package com.conversor.app;

/**
 * @author kurotom
 * @see <a href="https://github.com/kurotom/ConversoresGUI_Java">Repositorio</a>
 */

import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;


public class Main {
	
	private String seleccion = "";
	
	
	public Main() {
		starGUI();
	}
	
	public void starGUI() {
		
		while(true) {
			String[] items = {"Conversor de Moneda", "Conversor de Temperatura"};
//			System.out.println("-->  " + this.seleccion);
			
			if (this.seleccion == "") {
				String userSeleccion = (String) JOptionPane.showInputDialog(null,
						"Seleccione conversor",
						"Menu",
						JOptionPane.PLAIN_MESSAGE,
						null,
						items,
						""
				);
				if (userSeleccion != null) {
					this.seleccion = userSeleccion;
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado.", "Saliendo", JOptionPane.PLAIN_MESSAGE);
					System.exit(0);
					break;
				}
			}
//			System.out.println(seleccion);		
		
			HandleDataUser handlerProgram = new HandleDataUser();
			
			switch(this.seleccion) {
				case "": {
				} 
				case "Conversor de Moneda": {
					String convertidorRetorno = handlerProgram.handler("Conversor de Moneda"); 
					this.seleccion = convertidorRetorno;
//					System.out.println(convertidorRetorno);
					break;
					
				}
				case "Conversor de Temperatura": {
					String tempRetorno = handlerProgram.handler("Conversor de Temperatura");
					this.seleccion = tempRetorno;
//					System.out.println(tempRetorno);
					break;
					
				}
				default:
//					System.out.println("un throw");
					throw new IllegalArgumentException("Unexpected value: " + seleccion);
			}
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
		Main conversor = new Main();
		conversor.starGUI();
		
	}
	
}
