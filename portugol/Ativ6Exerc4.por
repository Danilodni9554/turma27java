programa
{
	inclua biblioteca Matematica-->Mat
	
	funcao inicio()
	{
	
	real d,r,s,a,b,c
	escreva("Digite o valor de A: ")
	leia(a)
	escreva("Digite o valor de B: ")
	leia(b)
	escreva("Digite o valor de C: ")
	leia(c)

	d=(Mat.potencia((a+b),2)+(Mat.potencia((b+c),2)/2))
	
	escreva("O resultado é: "+d)
	



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */