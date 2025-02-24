package Lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";

		System.out.println(parOuImpar.apply(145));

		Function<String, String> oResultadoE = 
				valor -> "O resultado � " + valor;
		
	   String resultadoFinal = 
			   parOuImpar.andThen(oResultadoE).apply(145);
	   
	   System.out.println(resultadoFinal);

	}

}
