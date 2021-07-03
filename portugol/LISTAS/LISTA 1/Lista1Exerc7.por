

programa
{
	
	funcao inicio()
	{
	real a,b,c,d,f,g,x,y
	escreva("Insira o valor de A: ")
	leia(a)
	escreva("Insira o valor de B: ")
	leia(b)
	escreva("Insira o valor de C: ")
	leia(c)
	escreva("Insira o valor de D: ")
	leia(d)
	escreva("Insira o valor de F: ")
	leia(f)
	escreva("Insira o valor de G: ")
	leia(g)
	x = ((c * f) - (b * g)) / ((a * f) - (b * d))
	y = ((a * g) - (c * d)) / ((a * f) - (b * d))
	escreva("O valor de X é: ", x, "\n")
	escreva("O valor de Y é: ", y, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */