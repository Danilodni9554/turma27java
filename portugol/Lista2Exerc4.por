//4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
//número é par ou ímpar, e se é positivo ou negativo.

programa
{
	
	funcao inicio()
	{
	inteiro numero
	escreva("Informe um número: ")
	leia(numero)
	se(numero%2 == 0)
	{
	escreva("Esse número é par \n")
	}
	senao
	{
	escreva("Esse número é ímpar \n")
	}
	se(numero>=0)
	{
	escreva("E também é positivo")
	}
	senao
	{
	escreva("E também é negativo")
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */