
//6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos

	programa
{

	funcao inicio()
	{
		cadeia nome
		inteiro idade
		
		escreva("Informe seu nome: ")
		leia(nome)
		escreva("Informe sua idade: ")
		leia(idade)
		se (idade<5)
		{
		escreva("Fora da faixa etária classificatória")
		}
		se(idade>=5 e idade<=7)
		{
		escreva("Você pertence ao Infantil A")
		}
		se(idade>7 e idade<=11)
		{
		escreva("Você pertence ao Infantil B")
		}se(idade>11 e idade<=13)
		{
		escreva("Você pertence ao Juvenil A")
		}se(idade>13 e idade<=17)
		{
		escreva("Você pertence ao Juvenil B")
		}se(idade>17)
		{
		escreva("Você pertence ao Adulto")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 781; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */