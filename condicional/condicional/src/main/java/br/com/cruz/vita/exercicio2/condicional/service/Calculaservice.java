package br.com.cruz.vita.exercicio2.condicional.service;

import org.springframework.stereotype.Service;

import br.com.cruz.vita.exercicio2.condicional.model.Calculo;

@Service
public class Calculaservice {

    
	
	public String verificaUsuario (Calculo calculo) {	
			if(calculo.getUsuario().equals("admin")) {
				return verificaOperacao(calculo);
			} else if (calculo.getUsuario().equals("comum")){
				return " Voce não é o administrador da calculadora ";
		     }
			  return "acesso negado" ;
	       }	

	
	public String verificaOperacao(Calculo calculo ) {
		if(calculo.getOperacao().equals("soma")) {
			return calculaValoresSoma(calculo);
		} else if (calculo.getOperacao().equals("subtração")){
			return calculaValoresSubtracao(calculo);
		}else {
			return "A operação informada não existe.";
	    }	
	   }
	

	
	public String calculaValoresSoma (Calculo calculo) {
	 Integer soma = calculo.getValor1() + calculo.getValor2();
        return "O resultado da soma é " + soma ;
      }
	
	
	
	
	public String calculaValoresSubtracao (Calculo calculo) {
		Integer subrtracao = calculo.getValor1() - calculo.getValor2();
		  return "O resusltado da subtração " + subrtracao ;
	 }	
  }



     

	
  


   	
	
    
