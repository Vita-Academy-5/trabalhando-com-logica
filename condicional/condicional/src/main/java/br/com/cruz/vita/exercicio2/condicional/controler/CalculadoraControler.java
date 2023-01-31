package br.com.cruz.vita.exercicio2.condicional.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cruz.vita.exercicio2.condicional.model.Calculo;
import br.com.cruz.vita.exercicio2.condicional.service.Calculaservice;

@RestController
@RequestMapping ("/calculadora")
public class CalculadoraControler {

	@Autowired
	private Calculaservice calculaservice;
	
	@PostMapping ("/calcular")
	 public ResponseEntity<String>listaTodos (@RequestBody Calculo calculo ){
		
		return  ResponseEntity.ok(calculaservice.verificaUsuario(calculo));
	}	
}
