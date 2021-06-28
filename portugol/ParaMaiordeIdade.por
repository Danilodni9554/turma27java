programa
{
	
	funcao inicio()
	{
		inteiro idade
		inteiro contador=1

		escreva("Digite sua idade: ")
		leia(idade)

		enquanto(idade < 18){
			escreva("Você não tem idade para acessar \n")

			escreva("Digite sua idade: ")
			leia(idade)
			contador++
			se(contador>2){
				escreva("Você é teimosinho hein !\n")
				pare
			}
			
		}
		se(contador==1){
			escreva("Parabéns você é de Maior !")
			}			
			
			senao{
				escreva("Mano, esse site não é pra tu !")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */