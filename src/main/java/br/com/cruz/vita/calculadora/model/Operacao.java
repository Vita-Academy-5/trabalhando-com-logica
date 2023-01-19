package br.com.cruz.vita.calculadora.model;

import lombok.Data;

@Data
public class Operacao {

	private String usuario;
	private String operacao;
	private Long valor1;
	private Long valor2;
	
	
}
