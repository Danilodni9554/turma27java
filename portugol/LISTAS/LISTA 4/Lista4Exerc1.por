//1 - Faça um programa que crie um vetor por leitura com 5 
//valores de pontuação de uma atividade e o escreva em 
//seguida. Encontre após a maior pontuação e a apresente. 


programa
{
	
	funcao inicio()
	{

		cadeia materia [5]
		inteiro pontuacaoV [5]
		inteiro maiorPontuacao=0
		inteiro pontuacao=0

		escreva("Pontuação das atividades: \n")

		para(inteiro i = 0; i <5; i++){
			escreva("\nDigite aqui a matéria: ")
			leia(materia [i])
			escreva("\nDigite aqui a pontuação: ")
			leia(pontuacaoV [i])
			
			se(pontuacaoV[i] > maiorPontuacao){
				maiorPontuacao=pontuacaoV[i]
			}
			
			
		}
		limpa()
		
		para(inteiro i = 0; i <=4; i++){
			escreva("Em: ",materia [i]," sua nota foi: ",pontuacaoV [i],"\n")
			
			
						
		}
		escreva("\nMaior nota foi: "+maiorPontuacao,"\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */