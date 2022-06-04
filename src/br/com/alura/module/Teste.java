package br.com.alura.module;

import javax.swing.JOptionPane;
import br.com.alura.*;


public class Teste {

	public static void main(String[] args) {
		
		double resultado = 0;
		Moeda moeda = new Moeda();
		
		String[] valores = { "Conversor de Moeda"};
		String[] opcoesConversaoReal = { "Real para Dólar", "Real para Euro", "Real para Libras", "Dólar para Real","Euro para Real", "Libras para Real"};

		
		while (true) {
			Object nome = JOptionPane.showInputDialog(null, "Selecione uma das Opções", "Conversor Alura",
					JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
			System.out.println(nome);
			
			if (nome == valores[0]) {
				double recebeValor = 0;
				
				Object selecaoDeConversaoReal = JOptionPane.showInputDialog(null, "Converter Real para...",
						"Menu de Conversão", JOptionPane.DEFAULT_OPTION, null, opcoesConversaoReal, opcoesConversaoReal[0]);
				try {
					recebeValor = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor"));
				} catch (NumberFormatException error) {
					String msg = error.getMessage();
					JOptionPane.showMessageDialog(null, msg + " Erro ao inserir valor diferente de um número.");
					continue;
				}
				
				if (selecaoDeConversaoReal == opcoesConversaoReal[0]) {
					resultado = moeda.converteMoeda(recebeValor, ListaCotacao.getBRLUSD());
				}
				
				if (selecaoDeConversaoReal == opcoesConversaoReal[1]) {
					resultado = moeda.converteMoeda(recebeValor, ListaCotacao.getBRLEUR());
				}
				
				if (selecaoDeConversaoReal == opcoesConversaoReal[2]) {
					resultado = moeda.converteMoeda(recebeValor, ListaCotacao.getBRLGBP());
				}
				
				if (selecaoDeConversaoReal == opcoesConversaoReal[3]) {
					resultado = moeda.converteMoeda(recebeValor, ListaCotacao.getUSDBRL());
				}
				
				if (selecaoDeConversaoReal == opcoesConversaoReal[4]) {
					resultado = moeda.converteMoeda(recebeValor, ListaCotacao.getEURBRL());
				}
				
				if (selecaoDeConversaoReal == opcoesConversaoReal[5]) {
					resultado = moeda.converteMoeda(recebeValor, ListaCotacao.getGBPBRL());
				}
				
				JOptionPane.showMessageDialog(null,"O valor convertido é: " + resultado);
				int selecao = JOptionPane.showConfirmDialog(null, "Deseja Realizar outra Conversão? ", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
				if (selecao == 1) {
					break;
				}
			}
		}
	}
}
