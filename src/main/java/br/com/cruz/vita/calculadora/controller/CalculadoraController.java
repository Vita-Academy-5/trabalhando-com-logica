package br.com.cruz.vita.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cruz.vita.calculadora.model.Operacao;
import br.com.cruz.vita.calculadora.service.CalculadoraService;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

	@Autowired
	private CalculadoraService calculadoraService;

	@PostMapping("/calcular")
	public ResponseEntity<String> calcular(@RequestBody Operacao operacao) {
		return ResponseEntity.ok(calculadoraService.verificarUsuario(operacao));

	}
}
