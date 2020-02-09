package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

import br.com.codenation.TestadorFibonacci;
import br.com.codenation.annotation.Desafio;

public class DesafioApplication {

	public static void main(String[] args) { new TestadorFibonacci().testaDesafio(DesafioApplication.class);}

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {
		int numeroAtual = 0;
		int ultimoNumero = 1;
		int proximoNumero = 0;
		List<Integer> sequenciaFibonacci = new ArrayList<>();
		for(int i = 0; numeroAtual <= 350; i++){
			sequenciaFibonacci.add(numeroAtual);
			proximoNumero = numeroAtual + ultimoNumero;
			numeroAtual = ultimoNumero;
			ultimoNumero = proximoNumero;
		}
		return sequenciaFibonacci;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {
		int numeroAtual = 0;
		int ultimoNumero = 1;
		int proximoNumero = 0;
		for(int i = 0; numeroAtual < a; i++){
			proximoNumero = numeroAtual + ultimoNumero;
			numeroAtual = ultimoNumero;
			ultimoNumero = proximoNumero;
		}
		return numeroAtual == a;
	}

}
