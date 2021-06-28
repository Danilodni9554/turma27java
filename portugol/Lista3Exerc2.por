//2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de 
//três e que se encontram no conjunto dos números de 1 até 500.

programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro numero
		inteiro totalImparMult3=0
		//entradas
		
			para(numero=0;numero<=500;numero++){
			se(((numero%2)==1) e ((numero%3)==0)){
			
			totalImparMult3 += numero
			escreva(numero,"\n")
			}
			}	
		escreva("A soma dos Ímpares Multíplos de 3 é: " + totalImparMult3)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */