package com.gourmet.jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Comida {
	
	public static List<String> comidas = new ArrayList<>(Arrays.asList("Lasanha", "Bolo de Chocolate"));
	
	public static List<String> ProcuraComida(String comida) {
		if (!comidas.equals(comida) ) {
			comidas.add( 1, comida);
		}
		
		return comidas;
	}
	
	public static int adivinhaComida(int contador) {
		return JOptionPane.showConfirmDialog(null, "O prato que você pensou é " + comidas.get(contador));
	}
	
	public static void classificaTipoComida(String prato) {
		Prato.procuraPrato(prato);
	}
}