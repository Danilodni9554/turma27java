//7) Receber valores de base e altura de um triângulo e verificar se são valores 
//válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.


programa
{
	
	funcao inicio()
	{
	real valorBase
	real valorAltura
	real areaDoTriangulo
	escreva("Insira o valor da base do triângulo: ")
	leia(valorBase)
	escreva("Insira o valor de altura do triângulo: ")
	leia(valorAltura)
	se(valorBase>0 e valorAltura>0)
	{
	areaDoTriangulo = (valorBase * valorAltura) / 2
	escreva("A área do triângulo é: ", areaDoTriangulo)
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */