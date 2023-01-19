package br.com.cruz.vita.calculadora.service;

import org.springframework.stereotype.Service;

import br.com.cruz.vita.calculadora.model.Operacao;

@Service
public class CalculadoraService {
	
	

	public String verificarUsuario(Operacao operacao) {
		if (operacao.getUsuario().equals("admin")) {
			return verificarOperacao(operacao);
		} else {
			return "O usuário não possui permissão para realizar a operação.";
		}
	}

	public String verificarOperacao(Operacao operacao) {
		if (operacao.getOperacao().equals("soma")) {
			return valorSoma(operacao);
		} else if (operacao.getOperacao().equals("subtracao")) {
			return valorSubtracao(operacao);
		} else {
			return "A operação informada não existe";
		}
	}

	public String valorSoma(Operacao operacao) {
		Long resultado = operacao.getValor1() + operacao.getValor2();

		return "O resultado da soma é: " + resultado;
	}

	public String valorSubtracao(Operacao operacao) {
		Long resultado = operacao.getValor1() - operacao.getValor2();

		return "O resultado da subtração é: " + resultado;
	}

}
