package com.gourmet.jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Prato {

	public static List<String> pratos = new ArrayList<>(Arrays.asList("massa"));
	
	public static List<String> procuraPrato(String prato) {
		if (!pratos.equals(prato) ) {
			pratos.add(prato);
		}
		
		return pratos;
	}
	
	public static int advinhaPrato(int contador) {
		return JOptionPane.showConfirmDialog(null, "O prato que você pensou é " + pratos.get(contador));
	}
	
	public static int tamanhoLista() {
		return pratos.size();
	}
}