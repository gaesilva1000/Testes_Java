package br.com.confidencecambio.javabasico.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import java.util.Optional;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class HelloService {

	private static final String valorPadrao = "Mundo";

	public String retornaValorValido(@Nullable String nome) {
		return Optional.ofNullable(nome).orElse(valorPadrao);
	}

	public double calculaImc(double peso, double altura) {
		log.info("[Inicia] HelloService - calculaImc");
		double imc = peso / (altura * altura);
		log.info("[Fim] HelloService - calculaImc");
		return imc;
	}
}
