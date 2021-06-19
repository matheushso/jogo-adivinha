package com.gourmet.jogo;

import java.util.List;

import javax.swing.JOptionPane;

public class RunApp {
	
	public static void main(String[] args) {
		
		int resposta = -1;
		List<String> pratos = Prato.pratos;
		List<String> comidas = Comida.comidas;

		jogoGourmet(resposta, args, pratos, comidas);
	}

	private static void jogoGourmet(int resposta, String[] args, List<String> pratos, List<String> comidas) {
		
		int contador = -1;
		Object[] confirmar = {"Ok"};
		
		int continuarJogando = JOptionPane.showOptionDialog(null, "Pense em um prato que você gosta", "Adivinha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, confirmar, confirmar[0]);
		
		if (continuarJogando != JOptionPane.CLOSED_OPTION ) {
			do {
				contador++;
				if (contador < pratos.size()) {
					resposta = Prato.advinhaPrato(contador);
				}
			} while (contador < pratos.size() && resposta != JOptionPane.YES_OPTION);
			System.out.println(contador);
			if (resposta == JOptionPane.YES_OPTION) {
				resposta = Comida.adivinhaComida(contador);
				verificaAcerto(resposta, contador, args, comidas);
			} else {
				resposta = Comida.adivinhaComida(contador);
				verificaAcerto(resposta, contador, args, comidas);
			}
		}
	}

	public static void verificaAcerto(int resposta, int contador, String[] args, List<String> comidas) {
		String prato = null;
		String comida = null;
		
		if (resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Acertei de novo! :D");
			RunApp.main(args);
		} else {
			comida = JOptionPane.showInputDialog("Qual prato você pensou?");
			Comida.ProcuraComida(comida);
			prato = JOptionPane.showInputDialog(comida + " é _______ mas " + comidas.get(contador) + " não.");
			Prato.procuraPrato(prato);
			RunApp.main(args);
		}
	}
}