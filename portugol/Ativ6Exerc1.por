//1. Faça um sistema que leia a idade de uma pessoa 
//expressa em anos, meses e dias e mostre-a expressa 
//apenas em dias. 


programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, respdias
		 
		escreva("Digite sua idade:\n")
		escreva("Anos: ")
		leia(anos)
		escreva("Digite sua idade:\n")
		escreva("Meses: ")
		leia(meses)
		escreva("Digite sua idade:\n")
		escreva("Dias: ")
		leia(dias)
		se(anos>0 e meses>0 e dias>0){
		
		anos = anos * 365
		meses = meses * 30
		dias = dias*1
		}
		escreva("Idade em dias é: ",anos+meses+dias,"\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */