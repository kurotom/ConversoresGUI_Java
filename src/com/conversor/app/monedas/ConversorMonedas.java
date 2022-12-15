package com.conversor.app.monedas;

/**
 * @author kurotom
 * @see <a href="https://github.com/kurotom/ConversoresGUI_Java">Repositorio</a>
 */

import java.util.Locale;

import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;


public class ConversorMonedas {
	
	private double amount = 0; 
	
	public ConversorMonedas(double cantidad) {
		this.amount = cantidad;
	}
	
	public String convertir() {
		
		String[] listItems = {
				"Moneda local a Dólar",
				"Moneda local a Euros",
				"Moneda local a Libras Esterlinas",
				"Moneda local a Yen Japonés",
				"Moneda local a Won sul-coreano",
				
				"Dólar a moneda local",
				"Euros a moneda local",
				"Libras Esterlinas a moneda local",
				"Yen Japonés a moneda local",
				"Won sul-coreano a moneda local"
		};
		
		String optionUser = (String) JOptionPane.showInputDialog(null,
				"Seleccione tipo de cambio",
				"Seleccionar operacion",
				JOptionPane.PLAIN_MESSAGE,
				null,
				listItems,
				""
		);
		
//		System.out.println(optionUser);
//		System.out.println("->  " + this.amount);
		
		if (optionUser == null) {
			return null;
		} else {
			switch (optionUser) {
				case "Moneda local a Dólar": {
					double dolar = 0.0011530467;
					return localToInternational(dolar, "Dolar");
				}
				case "Moneda local a Euros": {
					double eur = 0.0010944047;
					return localToInternational(eur, "Euro");
				}
				case "Moneda local a Libras Esterlinas": {
					double lib = 0.00094035412;
					return localToInternational(lib, "Libras Esterlinas");
				}
				case "Moneda local a Yen Japonés": {
					double yen = 0.15874097;
					return localToInternational(yen, "Yen Japonés");
				}
				case "Moneda local a Won sul-coreano": {
					double won = 1.5076563;
					return localToInternational(won, "Won sul-coreano");
				}
				
				
				case "Dólar a moneda local": {
					double us = 867.26759;
					return internationalToLocal(us, "Dolar");
				}
				case "Euros a moneda local": {
					double eur = 913.73876;
					return internationalToLocal(eur, "Euro");
				}
				case "Libras Esterlinas a moneda local": {
					double lib = 1063.3664;
					return internationalToLocal(lib, "Libras Esterlinas");
				}
				case "Yen Japonés a moneda local": {
					double yen = 6.2979275;
					return internationalToLocal(yen, "Yen Japonés");
				}
				case "Won sul-coreano a moneda local": {
					double won = 0.66303857;
					return internationalToLocal(won, "Won sul-coreano");
				}
				default: {
					return null;
				}
			}
		}
	}
	
	public String localToInternational(double valor, String moneda) {
		double price = this.amount * valor;
		String string = String.format(Locale.US, "$ %.2f CLP  equivale  $ %.2f  %s", this.amount, price, moneda);
		return string;
	}
	public String internationalToLocal(double valor, String moneda) {
		double price = this.amount * valor;
		String string = String.format(Locale.US, "$ %.2f %s  equivale  $ %.2f CLP", this.amount, moneda, price);
		return string;
	}


}
