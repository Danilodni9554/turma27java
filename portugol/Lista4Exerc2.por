//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, 
//escreva esse vetor. A seguir determine e imprima a 
//média aritmética dos lançamentos, contabilize 
//e apresente também quantas foram as 
//ocorrências da maior pontuação.

programa
{
	
	funcao inicio()
	{

		inteiro lancamentoV[3], numV[3], maiorNum=0, repeteMaior=0,contador=0, contador2=0
		real mediaTotal,totDado=0.0		

          para( inteiro i=0;i <3; i++){
          	
      	escreva("Lançamento  : ")
		leia(lancamentoV[i])
          escreva("O número : ")
          leia(numV[i])
          totDado += numV[i]
          contador++
          se(numV[i]>=maiorNum ou numV[i]==maiorNum){
          	maiorNum+=numV[i]
          	contador2++
          	
          	
          }
          
          }
          limpa()
      	para(inteiro i=0;i <3; i++){
      	escreva("No lançamento ",lancamentoV[i]," o número foi:",numV[i],"\n")
      	}
      	mediaTotal= totDado / contador
      	escreva("\nA média dos numeros é: ",mediaTotal)
      	escreva("\nOcorrências de maior pontuação: ",contador2-1)
      }
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 710; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */