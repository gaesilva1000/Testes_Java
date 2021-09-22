package br.com.confidencecambio.javabasico.domain;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class Gerente {
	
	
	@Email
	 private String email;
	
	@NotNull
	@NotEmpty
	@NotBlank
	private String nome;

	/*- Deve ser possível obter o primeiro nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "João".
    - Retornar o último nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "Soares Silva".
    - Retornar o nome todo em letras maiúsculas.
    - Retornar o nome abreviado. Exemplo: Se o nome for "João Soares Silva", retornar "João S. Silva".
    
     prezados, bom dia não entendi se precisaria fazer um crud, Post e armazenar no banco H2  
     depois fazer a busca desse valor usando o GET , ou aqui eu deveria colocar um REgex?    
      - Caso o teste seja esse ficaria feliz em tentar novamente. 
      - Att Gabriel Erick  silva 
     
     
     */ 
}
